package com.naveen.welcomer.dao;

public interface DatabaseService {
	boolean authenticate(String sessionId, String username, String password);

}
