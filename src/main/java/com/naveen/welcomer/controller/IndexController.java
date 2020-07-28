package com.naveen.welcomer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.naveen.welcomer.html.HTMLContentService;
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
	
	@Autowired
	HTMLContentService htmlContentService;
	
    @RequestMapping("/about")
    public String about() {
    	return htmlContentService.aboutMessageHTMLContent();
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