package com.javakia.api.camel.s3.fileupload;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws.s3.S3Constants;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that moves an object from an endpoint to AWS S3 Bucket
 * Spring boot provides auto-configuration for Apache Camel and the camel route
 * will be started automatically.
 * The required dependencies are provided in the pom.xml file
 * <p/>
 * 
 * @Component annotation will make spring boot/camel auto detect this route when
 *            starting.
 */

@Component
public class AWSS3Route extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("{{from.component}}:{{from.endpoint}}").routeId("camelS3Route")
				.setHeader(S3Constants.CONTENT_LENGTH, simple("${in.header.CamelFileLength}"))
				//This is the filename on the S3 bucket
				.setHeader(S3Constants.KEY, simple("${in.header.CamelFileNameOnly}"))
				//aws-s3 the camel component and  and that is how you tell camel where you want to upload. 
				.to("aws-s3://{{awsS3BucketName}}?deleteAfterWrite=false&region={{awsRegion}}&accessKey={{awsAccessKey}}&secretKey=RAW({{awsAccessSecretKey}})")
				//optionally logging success message
				.log("${in.header.CamelFileNameOnly} succesfully uploaded to S3 {{awsS3BucketName}} bucket");
	}
}
