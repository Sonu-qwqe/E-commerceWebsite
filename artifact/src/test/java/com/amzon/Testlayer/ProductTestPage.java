package com.amzon.Testlayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.pageLayer.ChildBrowserPDP;
import com.amazon.pageLayer.HomePageTestSearch;
import com.amazon.pageLayer.Productpage;
import com.amazon.utility.Utility;

public class ProductTestPage extends TestBase
{
	@Test
	public void verifyRatingFunctionalityisWorking() throws InterruptedException
	{
		HomePageTestSearch hom_obj = new HomePageTestSearch(driver);
		hom_obj.click_onsearch("realme");
		Productpage rating_obj= new Productpage(driver);
		rating_obj.clickonrateing();
		rating_obj.clickonsortFilter();
		rating_obj.clickonHightoLow();
		rating_obj.click_on_Productrealme();
		
		ChildBrowserPDP addtocart_obj= new ChildBrowserPDP(driver);
	
		JavascriptExecutor scroll= (JavascriptExecutor)driver;
		scroll.executeScript("scroll(200,500)");
		Thread.sleep(2000);
		
		Utility obj= new Utility();
		obj.parentProductTitle();
		obj.childbrowser();
		obj.comparebothtitle();
		Thread.sleep(3000);
		addtocart_obj.clickonAddToCartButton();
		Thread.sleep(2000);
		obj.getCartSubTitle();
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
