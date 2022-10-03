package com.api.Gayathri_Api;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/Hello")
	public String helloMethod() {
		
		return "Hello Everyone! Welcome to SUBEX";

	}

}
