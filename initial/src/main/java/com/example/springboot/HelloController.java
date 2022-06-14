package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* Flag: @RestController
* - Implies class is ready for use by Spring MVC to handle web requests. */
@RestController
public class HelloController {

	/* @GetMapping maps "/" to index() method.
	* When invoked from a browser or by using `curl` on the CLI,
	* the method returns pure text.
	* - This is because @RestController combines @Controller and @ResponseBody.
	* - These two annotations result in web requests returning data instead of a view.
	* The message prints when a GET request is sent to the API. */
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/faq")
	public String faq() {return "Welcome to the FAQ page!";}
}
