package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(BootApplication.class, args);
	}
	
        //bug 120
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to Ashok IT - Software Training";
	}

       //bug (103)
        @GetMapping("/Greet")
	public String getWelcomeMsg() {
		//in progress
	}

}
