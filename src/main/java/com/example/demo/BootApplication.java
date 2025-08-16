package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootApplication {

	public static void main(String[] args) {
		//bug = 100
		int a= 10;
                int b= 20;
		SpringApplication.run(BootApplication.class, args);
	}
	
        
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to Ashok IT - Software Training";
	}

      //bug(103)
        @GetMapping("/Greet")
	public String getWelcomeMsg() {
		//in progress

	}

}
