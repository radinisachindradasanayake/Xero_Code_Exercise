package com.Xero.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddOrgPage {

	WebDriver driver;
	
	 public AddOrgPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	 
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"organisation-name\"]/div/div")
	 @CacheLookup
	 static WebElement organisation_name;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"organisation-country\"]/div/div/div/div[2]/div")
	 @CacheLookup
	 static WebElement organisation_country;
		
	 @FindBy(how = How.XPATH, using = "//*[@id=\"organisation-timezone\"]/div/div/div/div[2]/div")
	 @CacheLookup
	 static WebElement organisation_timezone;	
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"organisation-industry\"]/div/div/div/div[2]/div")
	 @CacheLookup
	 static WebElement organisation_industry;	
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"shell-app-root\"]/div/div[2]/div/div/div[1]/form/div[6]/div/div/div/label/div")
	 @CacheLookup
	 static WebElement organisation_GST;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"shell-app-root\"]/div/div[2]/div/div/div[1]/form/div[7]/div/div/div/div/div")
	 @CacheLookup
	 static WebElement organisation_SW;
	
	 @FindBy(how = How.XPATH, using = "//*[@id=\"shell-app-root\"]/div/div[2]/div/div/div[1]/form/div[8]/div/button[1]")
	 @CacheLookup
	 static WebElement StartTrial;
	
	 public void organisation_name(String oName) throws InterruptedException 
		{
		 Thread.sleep(1000);
		 	organisation_name.sendKeys(oName);
		}

		
		
		public void organisation_industry(String oIndustry) 
		{
			organisation_industry.sendKeys(oIndustry);
		}
	 
		public void StartTrial() 
		{
			StartTrial.click();
		}
	 
	 
	 
	 
	
}
