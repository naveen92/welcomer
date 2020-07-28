package com.naveen.welcomer.html;

public class HTMLContentServiceImpl implements HTMLContentService {

	@Override
	public String welcomeMessageHTMLContent() {
		/*return "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App - Home</title></head>"
        		+ "<body><br />"
        		+ "<br /><p>Welcome user! You are now logged in! This is your home page!!</p> <br />"
				+ "Click <a href=\"/logout\">here</a> to logout.<br /></body></html>";*/
		return null;
	}

	@Override
	public String aboutMessageHTMLContent() {
    	return "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App - About</title></head>"
        		+ "<body><br />"
        		+ "<br /><p>This repo is to demonstrate Test Driven Development (TDD) using a project that welcomes a user if they login.</p> <br />"
				+ "Click <a href=\"/login\">here</a> to login.<br /></body></html>";
	}

}
