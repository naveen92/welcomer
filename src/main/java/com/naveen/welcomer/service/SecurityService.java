package com.naveen.welcomer.service;

public interface SecurityService {

	public String login(String sessionId, String username, String password);

	public String logout(String sessionId);
	
	public String showLoginPage();

}
