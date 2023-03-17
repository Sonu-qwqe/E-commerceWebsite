package com.amazon.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		String str = "chrome";
		
		
		if(str.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		
		else if (str.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		
		}
		else
		{
			System.out.println("Please Provide correct browser name");
		}
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	
	@AfterMethod
	public void teardrown() throws InterruptedException
	{
		//driver.quit();
		Thread.sleep(3000);
		//driver.close();
	}
	
}
