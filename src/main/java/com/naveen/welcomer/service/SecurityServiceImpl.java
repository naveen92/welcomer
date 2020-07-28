package com.naveen.welcomer.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.naveen.welcomer.dao.DatabaseService;

public class SecurityServiceImpl implements SecurityService {

	@Autowired
	DatabaseService databaseService;
	
	@Override
	public String login(String sessionId, String username, String password) {
		return null;
	}

	@Override
	public String logout(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showLoginPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
