package com.naveen.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.naveen.welcomer.service.SecurityService;
import com.naveen.welcomer.service.SecurityServiceImpl;

public class SecurityServiceTest {
	private SecurityService securityService = null;

	@BeforeClass
	public void init() {
		securityService = new SecurityServiceImpl();
	}

	@Test
	public void whenUserCredentialIsIncorrectThenReturnFalse() {
		String loginMessage = securityService.login("", "user", "correctPass");
		Assert.assertTrue(loginMessage.contains("Welcome"));
	}

	@Test
	public void testIfLoginPageIsHavingHTMLForm() {
		String logoutMessage = securityService.showLoginPage();
		Assert.assertTrue(logoutMessage.contains("form"));
	}

	@Test
	public void whenUserCredentialIsIncorrectThenLoginPageRedirectionHappens() {
		String loginMessage = securityService.login("", "newUser", "wrongPass");
		Assert.assertTrue(loginMessage.contains("form"));
	}

}
