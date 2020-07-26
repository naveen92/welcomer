package com.naveen.welcomer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.naveen.welcomer.service.WelcomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class IndexController {
	
	@Autowired
	WelcomerService service;
	
    @RequestMapping("/about")
    public String about() {
    	return "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App - About</title></head>"
        		+ "<body><br />"
        		+ "<br /><p>This repo is to demonstrate Test Driven Development (TDD) using a project that welcomes a user if they login.</p> <br />"
				+ "Click <a href=\"/login\">here</a> to login.<br /></body></html>";
    }
    
    @RequestMapping("/")
    public String index(@RequestParam String sessionId) {
        return service.welcome();
    }
    
    // Security based End-points starts from here
    
    @RequestMapping("/login")
    public String showLoginPage() {
    	return null;
    }

    @PostMapping("/login")
    public String logout(@RequestParam String username, @RequestParam String password) {
    	return null;
    }
    
    @GetMapping("/logout")
    public String logout(@RequestParam String sessionId) {
    	return null;
    }
    
}