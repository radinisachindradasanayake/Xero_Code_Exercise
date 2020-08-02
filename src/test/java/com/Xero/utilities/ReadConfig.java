package com.Xero.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig() 
	{
		File src = new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		
		catch(Exception e) {
			
			System.out.println("Execption is"+ e.getMessage());
		}
			
	}
	
	public String getApplicationURL() 
	{
		
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() 
	{
		
		String url = pro.getProperty("username");
		return url;
	}


	public String getpassword() 
	{
	
	String url = pro.getProperty("password");
	return url;
	}

	public String getchromepath() 
	{
	
	String url = pro.getProperty("chromepath");
	return url;
	}

	public String getiepath() 
	{
	
	String url = pro.getProperty("iepath");
	return url;
	}

	public String getfirefoxpath() 
	{
		
	String url = pro.getProperty("firefoxpath");
	return url;
	}
	
	//Method to get Excel Path
		public String GetExcelPath()
		{
			String ExcelPath = pro.getProperty("ExcelPath");
			return ExcelPath;
			
		}
		
		public String getorganization() 
		{
		
		String url = pro.getProperty("organization");
		return url;
		}
		
		public String getIndustry() 
		{
		
		String url = pro.getProperty("Industry");
		return url;
		}

}
