package com.pawdirect.spring.controller;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HomeControllerTest {
	static HomeController hc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		hc = new HomeController();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		hc = null;
	}

	@Test
	public void test() {
		
		assertNotNull(hc.toString());
	}

}
