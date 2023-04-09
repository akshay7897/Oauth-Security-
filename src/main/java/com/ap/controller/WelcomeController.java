package com.ap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/")
	public String getWelcome() {
		
		return "<h2> Welcome Akshay PAtil </h2>";
	}

}
