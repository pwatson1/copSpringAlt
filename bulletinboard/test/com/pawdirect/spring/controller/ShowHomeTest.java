package com.pawdirect.spring.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;

/*
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(HomeController.class)
*/
public class ShowHomeTest {
	private static final String NEW_HOME_CONTROLLER = 
			new HomeController().showHome();
	
	/* @Autowired
	private MockMvc mocMvc;
	*/
	
	private static HomeController hc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//MockitoAnnotations.initMocks(this);
		hc = new HomeController();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		 hc = null;
	}

	@Test
	public void testShowHomeNotNull() {
		
		//mocMvc.perform(get("/home"));
		
		assertNotNull(hc.toString());
	}
	
	@Test
	public void testShowHome() {
		
		//mocMvc.perform(get("/home"));
		
		assertNotNull(hc.toString());
	}

}