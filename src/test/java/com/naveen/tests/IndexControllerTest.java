package com.naveen.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.Test;

import com.naveen.welcomer.html.HTMLContentService;
import com.naveen.welcomer.service.SecurityService;
import com.naveen.welcomer.service.WelcomerService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.mockito.Mockito;

public class IndexControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private WelcomerService service;
	
	@MockBean
	HTMLContentService htmlContentService;
	
	@MockBean
	SecurityService securityService;

	@Test
	public void shouldReturnWelcomeMessage() throws Exception {
		String expectedMessage = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App - Home</title></head>"
        		+ "<body><br />"
        		+ "<br /><p>Welcome user! You are now logged in! This is your home page!!</p> <br />"
				+ "Click <a href=\"/logout\">here</a> to logout.<br /></body></html>";
		Mockito.when(service.welcome()).thenReturn(expectedMessage);
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnAboutMessage() throws Exception {
		String expectedMessage = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Welcomer App - About</title></head>"
				+ "<body><br />"
				+ "<br /><p>This repo is to demonstrate Test Driven Development (TDD) using a project that welcomes a user if they login.</p> <br />"
				+ "Click <a href=\"/login\">here</a> to login.<br /></body></html>";
		Mockito.when(htmlContentService.aboutMessageHTMLContent()).thenReturn(expectedMessage);
		this.mockMvc.perform(get("/about")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnLogInContent() throws Exception {
		String expectedWord = "form";
		Mockito.when(securityService.showLoginPage()).thenReturn(expectedWord);
		this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnLogoutContent() throws Exception {
		String expectedWord = "form";
		Mockito.when(securityService.showLoginPage()).thenReturn(expectedWord);
		this.mockMvc.perform(get("/logout")).andDo(print()).andExpect(status().isOk());
	}

}
