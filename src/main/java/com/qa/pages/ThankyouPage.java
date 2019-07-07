package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class ThankyouPage extends BaseTest{
	
	@FindBy(className="forgot-password-btn")
	WebElement continuebutton;

	public ThankyouPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickContinue() {
		continuebutton.click();
	}

}
