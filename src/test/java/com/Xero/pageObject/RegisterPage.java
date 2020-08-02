package com.Xero.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver ldriver;
	
	 public RegisterPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	 @FindBy(name="FirstName")
		@CacheLookup
		WebElement FirstName;
	 
	 @FindBy(name="LastName")
		@CacheLookup
		WebElement LastName;
	 
	 @FindBy(name="EmailAddress")
		@CacheLookup
		WebElement EmailAddress;
	 
	 @FindBy(name="LocationCode")
		@CacheLookup
		WebElement LocationCode;
	 
	 @FindBy(className="recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox")
		@CacheLookup
		WebElement robot;
	 
	 @FindBy(name="TermsAccepted")
		@CacheLookup
		WebElement TermsAccepted;
	 
	 @FindBy(using="submit")
		@CacheLookup
		WebElement submit;
	 
	 
	 public void setFirstName(String FName) 
		{
		 FirstName.sendKeys(FName);
		}

	 public void setLastName(String LName) 
		{
			LastName.sendKeys(LName);
		}
	 
	 public void setEmailAddress(String Email) 
		{
		 EmailAddress.sendKeys(Email);
		}
	 public void setrobot() 
		{
		 robot.click();
		}
}
