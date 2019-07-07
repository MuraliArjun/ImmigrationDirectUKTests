package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.qa.base.BaseTest;
import com.qa.utils.CustomListner;

@Listeners(CustomListner.class)
public class RegistrationPage extends BaseTest {

	String email = "test-uk-autom-" + System.currentTimeMillis() + "@dcis.net";
	public Logger log = Logger.getLogger(RegistrationPage.class);

	@FindBy(id = "customerSignup-firstName")
	WebElement firstname;

	@FindBy(id = "customerSignup-lastName")
	WebElement lastname;

	@FindBy(id = "customerSignup-emailId")
	WebElement emailid;

	@FindBy(id = "customerSignup-password")
	WebElement password;

	@FindBy(id = "customerSignup-signinPhone-phone3")
	WebElement telephone;

	@FindBy(id = "signupbutton")
	WebElement continuebutton;

	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterRegistrationForm() {
		firstname.sendKeys(prop.getProperty("firstname"));
		lastname.sendKeys(prop.getProperty("lastname"));
		emailid.sendKeys(email);
		password.sendKeys(prop.getProperty("password"));
		telephone.sendKeys(prop.getProperty("telephone"));
	}

	public void submitAccount() {
		continuebutton.click();
	}
}
