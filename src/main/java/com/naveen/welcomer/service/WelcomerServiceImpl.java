package com.naveen.welcomer.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.naveen.welcomer.html.HTMLContentService;

public class WelcomerServiceImpl implements WelcomerService {
	
	@Autowired
	HTMLContentService htmlContentService;

	@Override
	public String welcome() {
		return htmlContentService.welcomeMessageHTMLContent();
	}
	
}
