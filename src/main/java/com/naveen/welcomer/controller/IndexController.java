package com.naveen.welcomer.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IndexController {
    @RequestMapping("/about")
    public String about() {
    	return "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App - About</title></head>"
        		+ "<body><br />"
        		+ "<br /><p>This repo is to demonstrate Test Driven Development (TDD) using a project that welcomes a user if they login.</p> <br />"
				+ "Click <a href=\"/login\">here</a> to login.<br /></body></html>";
    }
}