package com.naveen.tests;

import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.naveen.welcomer.html.HTMLContentService;
import com.naveen.welcomer.html.HTMLContentServiceImpl;
import com.naveen.welcomer.service.WelcomerServiceImpl;

public class WelcomeMessageTest {
	@Mock private HTMLContentService htmlContentService = null;
	@InjectMocks private WelcomerServiceImpl welcomerService = null;
	
	@BeforeClass
	public void init() {
		htmlContentService = Mockito.mock(HTMLContentServiceImpl.class);
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testWelcomeMessageIfItIsHavingWelcomeWord() {
		String expectedMessage = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App - Home</title></head>"
        		+ "<body><br />"
        		+ "<br /><p>Welcome user! You are now logged in! This is your home page!!</p> <br />"
				+ "Click <a href=\"/logout\">here</a> to logout.<br /></body></html>";
		Mockito.when(htmlContentService.welcomeMessageHTMLContent()).thenReturn(expectedMessage);
		String actualMessage = welcomerService.welcome();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
