package com.sahu.service;

public class LoginService {

	public String login(String userName, String password) {
		if ((userName == null || userName.length() == 0) || (password == null || password.length() == 0)) {
			throw new IllegalArgumentException("Invalid inputs");
		}
		
		if(userName.equalsIgnoreCase("Raja") && password.equalsIgnoreCase("Rani")) {
			return "Valid credentials";
		}
		
		return "Invalid credentials";
	}

}
