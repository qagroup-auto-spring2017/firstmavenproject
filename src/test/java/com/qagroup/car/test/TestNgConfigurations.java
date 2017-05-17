package com.qagroup.car.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgConfigurations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In before suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("In before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("In before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In before method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("In test method 1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("In test method 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("In after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("In after class");
	}
}
