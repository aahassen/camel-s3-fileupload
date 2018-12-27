package com.javakia.api.camel.s3.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for camel-s3-fileupload application. This class will be used as an
 * entry point to the application.
 * 
 * @SpringBootApplication annotation is same as
 *                        (@Configuration, @EnableAutoConfiguration,
 *                        and @ComponentScan) all together
 *
 * @author Ahmedin Hassen
 *
 */
@SpringBootApplication
public class CamelFileUploadApplication {
	public static void main(String[] args) {
		SpringApplication.run(CamelFileUploadApplication.class, args);
	}

}
