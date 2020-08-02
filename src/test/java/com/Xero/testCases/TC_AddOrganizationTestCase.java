package com.Xero.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Xero.pageObject.AddOrgPage;
import com.Xero.pageObject.LoginPage;
import com.Xero.pageObject.RegisterPage;
import com.Xero.utilities.ExcelDataConfig;

public class TC_AddOrganizationTestCase extends TC_LoginTestCase {

	
	@Test
	//using properties file
	public void TC_AddOrganizationTestCase() throws IOException, InterruptedException{
		
		AddOrgPage Op = new AddOrgPage(driver);
		Op.organisation_name(organization);
		logger.info("Entered organization");
		
		Op.organisation_name(Industry);
		logger.info("Entered Industry");
		
		
		
		
		
	}
	
	//using Excel file
	/*public void TC_AddOrganizationTestCase() throws IOException, InterruptedException
	{
		AddOrgPage Rpage=new AddOrgPage(driver);
		ExcelDataConfig ExcelDataConfig = new ExcelDataConfig();
		
		String oName = ExcelDataConfig.getData(1, 1, 1);
		Rpage.organisation_name(oName);		
		logger.info("Entered organization Successfully");
		
		String oIndustry = ExcelDataConfig.getData(1, 1, 3);
		logger.info("Entered industry Successfully");
		
		
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
		}*/
	}

