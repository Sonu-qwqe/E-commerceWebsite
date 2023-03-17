package com.amazon.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.amazon.TestBase.TestBase;

public class Utility extends TestBase
{
	static String title1;
	static String title2;
	public static  void screenshot(String filename) throws IOException
	{
		String path = "C:\\Users\\Acer\\Documents\\SONU\\GIT AND GITHUB\\GitHub file\\E-commerceWebsite\\artifact\\Screenshots";
		TakesScreenshot sr = (TakesScreenshot)driver;
		File desc = sr.getScreenshotAs(OutputType.FILE);
		File src = new File(path,filename +"png");
		FileHandler.copy(desc, src);
		
	}
	public static  void parentProductTitle()
	{
	 title1 = driver.findElement(By.xpath("//span[contains(text(),'realme GT 2 Pro (Paper Green 12GB RAM+256GB Storag')]")).getText();
		System.out.println("get the parent title::"+title1);
	}
	
	public static void childbrowser() throws InterruptedException
	{
		Set<String>str = driver.getWindowHandles();
		
		ArrayList jk = new ArrayList(str);
		
		driver.switchTo().window((String)jk.get(1));
		
		String title2 =driver.getTitle();
		
		System.out.println("child browser title:::"+title2);
		
		
		
		Thread.sleep(2000);
	
	}
	
	public void comparebothtitle()
	{
		if(title1==title2)
		{
			System.out.println("The product page and childpage is same::: "+ title1==title2);
		}
		else
		{
			System.out.println("the product page is not same ");
		}
	}
	
	public void getCartSubTitle()
	{
	String cart = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-base attach-primary-atc-confirm-box']//div[@class='a-fixed-left-grid-col a-col-right']//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println(cart);
			
		
	}
	
	
	
	

}
