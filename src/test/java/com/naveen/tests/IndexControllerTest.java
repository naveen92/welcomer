package com.naveen.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class IndexControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnWelcomeMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnAboutMessage() throws Exception {
		this.mockMvc.perform(get("/about")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnLogInContent() throws Exception {
		this.mockMvc.perform(get("/login")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void shouldReturnLogoutContent() throws Exception {
		this.mockMvc.perform(get("/logout")).andDo(print()).andExpect(status().isOk());
	}

}
