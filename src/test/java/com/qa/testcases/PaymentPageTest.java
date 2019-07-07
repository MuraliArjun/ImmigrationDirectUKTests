package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.ThankyouPage;
import com.qa.pages.PaymentPage;
import com.qa.pages.RegistrationPage;
import com.qa.utils.CustomListner;
import com.qa.utils.Utility;

@Listeners(CustomListner.class)
public class PaymentPageTest extends BaseTest{
	
	RegistrationPage registration;
	PaymentPage payment;
	ThankyouPage thankyou;
	Utility utility;
	
	public PaymentPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		registration = new RegistrationPage();
		payment = new PaymentPage();
		thankyou = new ThankyouPage();
		utility = new Utility();

	}
	
	@Test
	public void createAccountTest() {
		registration.enterRegistrationForm();
		registration.submitAccount();
		payment.enterPaymentForm();
		payment.submitPayment();
		utility.alertHandler();
		thankyou.clickContinue();
		
	}
	
	@AfterMethod
	public void tearsDown() {
		driver.quit();
	}


}
