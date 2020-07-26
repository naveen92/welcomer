package com.naveen.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.naveen.welcomer.service.WelcomerService;
import com.naveen.welcomer.service.WelcomerServiceImpl;

public class LoginPageIfUnauthTest {
	private WelcomerService welcomer = null;

	@BeforeClass
	public void init() {
		welcomer = new WelcomerServiceImpl();
	}

	@Test
	public void whenUserIsUnauthenticatedThenLoginPageRedirectionHappens() {
		String actualMessage = welcomer.welcome();
		Assert.assertTrue(actualMessage.contains("Welcome"));
	}

}
