package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class PaymentPage extends BaseTest{
	
	@FindBy(id="cardType")
	WebElement cardtype;
	
	@FindBy(id="UMcard")
	WebElement cardnumber;
	
	@FindBy(id="month")
	WebElement expmonth;
	
	@FindBy(id="year")
	WebElement expyear;
	
	@FindBy(id="UMcvv2")
	WebElement securitycode;
	
	@FindBy(id="nameoncard")
	WebElement fullname;
	
	@FindBy(id="ZIP")
	WebElement postalcode;

	@FindBy(className="payment-btn")
	WebElement submitbutton;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPaymentForm() {
		cardtype.sendKeys(prop.getProperty("cardtype"));
		cardnumber.sendKeys(prop.getProperty("cardnumber"));
		expmonth.sendKeys(prop.getProperty("expmonth"));
		expyear.sendKeys(prop.getProperty("expyear"));
		securitycode.sendKeys(prop.getProperty("securitycode"));
		fullname.sendKeys(prop.getProperty("fullname"));
		postalcode.sendKeys(prop.getProperty("postalcode"));
	}
	
	public void submitPayment() {
		submitbutton.click();
	}
}
