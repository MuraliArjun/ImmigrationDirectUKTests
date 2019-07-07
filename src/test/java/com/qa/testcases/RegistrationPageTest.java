package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qa.base.BaseTest;
import com.qa.pages.RegistrationPage;
import com.qa.utils.CustomListner;

@Listeners(CustomListner.class)
public class RegistrationPageTest extends BaseTest{
	
	RegistrationPage registration;
	
	public RegistrationPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		registration = new RegistrationPage();
	}
	
	@Test
	public void createAccountTest() {
		registration.enterRegistrationForm();
		registration.submitAccount();
	}
	
	
	
	@AfterMethod
	public void tearsDown() {
		driver.quit();
	}


}
