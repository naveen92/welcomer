package com.naveen.welcomer.service;

public class WelcomerServiceImpl implements WelcomerService {

	@Override
	public String welcome() {
		return fetchWelcomeMessageFromDataLayer();
	}
	
	private String fetchWelcomeMessageFromDataLayer() {
		return "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App</title></head>"
        		+ "<body><br />"
        		+ "<br /><p>Welcome user! You are now logged in! This is your home page!!</p> <br />"
				+ "Click <a href=\"/logout\">here</a> to logout.<br /></body></html>";
	}

}
