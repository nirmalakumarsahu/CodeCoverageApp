package com.sahu.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoginServiceTest {

	private LoginService loginService = new LoginService();

	@Test
	public void testWithValidCredentials() {
		String result = loginService.login("Raja", "Rani");
		assertEquals("Test 1: To check for valid credentials", "Valid credentials", result);
	}

	@Test
	public void testWithInValidCredentials() {
		String result = loginService.login("Raja", "Rani1");
		assertEquals("Test 2: To check for Invalid credentials", "Invalid credentials", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWithNoCredentials() {
		loginService.login("", "");
	}

}
