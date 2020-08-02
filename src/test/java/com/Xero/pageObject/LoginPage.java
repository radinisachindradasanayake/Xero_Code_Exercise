package com.Xero.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		WebDriver ldriver;
		
		 public LoginPage(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(name="userName")
		@CacheLookup
		WebElement Email;
		
		@FindBy(name="password")
		@CacheLookup
		WebElement Password;
		
		@FindBy(id="submitButton")
		@CacheLookup
		WebElement Login;
		
		
		public void setUserName(String uname) 
		{
			Email.sendKeys(uname);
		}

		public void setpassword(String password) 
		{
			Password.sendKeys(password);
		}
		
		public void setlogin() throws InterruptedException 
		{
			Login.click();
			Thread.sleep(5000);
		}
		
		
	
}
