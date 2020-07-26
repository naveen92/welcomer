package com.naveen.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.naveen.welcomer.service.SecurityService;
import com.naveen.welcomer.service.SecurityServiceImpl;

public class LoginPageIfIncorrectCredTest {
	private SecurityService securityService = null;

	@BeforeClass
	public void init() {
		securityService = new SecurityServiceImpl();
	}

	@Test
	public void whenUserCredentialIsIncorrectThenLoginPageRedirectionHappens() {
		String loginMessage = securityService.login("", "newUser", "wrongPass");
		Assert.assertTrue(loginMessage.contains("form"));
	}

}
