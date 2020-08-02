package com.Xero.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Xero.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String ExcelPath = readconfig.GetExcelPath();
	public String username = readconfig.getUsername();
	public String password = readconfig.getpassword();
	public String Industry = readconfig.getIndustry();
	public String organization = readconfig.getorganization();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void steup() 
	{
		
		String br="chrome";
		logger=Logger.getLogger("Xero");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		if(br.equals("chrome"))
		
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getfirefoxpath());
			driver=new FirefoxDriver();
		}
		
		else if(br.equals("ie"))
			
		{
			System.setProperty("webdriver.ie.driver", readconfig.getiepath());
			driver=new InternetExplorerDriver();
		}
		
		driver.get(baseURL);
		
	}
	
	/*@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	*/
	
	//Method to capture the screenshots
    public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
