package com.api.restapi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
	
	@GetMapping("Hello")
	public String helloMethod() {
		
		return "Hello Everyone Welcome to Java Training";
	}

}
 