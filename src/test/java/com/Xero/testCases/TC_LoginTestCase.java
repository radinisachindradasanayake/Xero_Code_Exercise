package com.Xero.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Xero.pageObject.LoginPage;
import com.Xero.utilities.ExcelDataConfig;

public class TC_LoginTestCase extends BaseClass {

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
		
	//Login using properties file	
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setpassword(password);
		logger.info("Entered password");
		lp.setlogin();
		logger.info("Entered login button");
		if(driver.getTitle().equals("Xero"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
/*	//Login using Excel file
		ExcelDataConfig ExcelDataConfig = new ExcelDataConfig();
		logger.info("This Testcase runs using EXcel Data Reader");
		driver.get(ExcelDataConfig.getData(0,1,0));
		logger.info("URL is Opened");
		
		LoginPage LoginPage1=new LoginPage(driver);
		
		String Email = ExcelDataConfig.getData(0, 1, 1);
		LoginPage1.setUserName(Email);		
		logger.info("Entered Email Successfully");
		
		String Password = ExcelDataConfig.getData(0, 1, 2);
		LoginPage1.setpassword(Password);
		logger.info("Entered Password Successfully");
		
		LoginPage1.setlogin();
		logger.info("Click on Login Button Successfully");
		
		if (driver.getTitle().equals("Xero"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			captureScreen(driver,"LoginTest" );
			Assert.assertFalse(false);
			logger.info("Login Test Failed");
		}
		}
		*/
	}
}

