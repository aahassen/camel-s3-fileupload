package com.javakia.microservice.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for SMS-API application. This class will be used as an entry point
 * to the application.
 * 
 * @SpringBootApplication annotation is same as
 *                        (@Configuration, @EnableAutoConfiguration,
 *                        and @ComponentScan) all together
 *
 * @author Ahmedin Hassen
 *
 */
@SpringBootApplication
public class SMSApplication {
	public static void main(String[] args) {
		SpringApplication.run(SMSApplication.class, args);
	}

}
