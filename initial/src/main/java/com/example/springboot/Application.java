package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
*@SpringBootApplication is a convenience annotation that adds each of the following:
* - @Configuration: Tags the class as a source of bean definitions for the application context.
* - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,
*   other beans, and various property settings. For example, if `spring-webmvc` is on the classpath,
*   this annotation flags the application as a web application and activates key behaviors,
*   such as setting up a `DispatcherServlet`.
* - @ComponentScan: Tells Spring to look for other components, configurations,
*   and services in the `com/example package`, letting it find the controllers.

*/
@SpringBootApplication
public class Application {

	/* The main() method uses Spring Boot’s `SpringApplication.run()` method to launch an application. */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		/* This message is printed upon initialization of the program. */
		System.out.println("Let's inspect the beans provided by Spring Boot:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
	
}
