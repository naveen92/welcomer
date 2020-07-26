package com.naveen.welcomer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.naveen.welcomer.service.WelcomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String index() {
        return service.welcome();
    }

}