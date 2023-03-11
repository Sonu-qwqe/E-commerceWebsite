package com.amzon.Testlayer;

import org.testng.annotations.Test;

import com.amazon.TestBase.TestBase;
import com.amazon.pageLayer.HomePageTestSearch;

public class HomepageTest extends TestBase
{
	@Test
	public void verifyTheHomeFunctionality()
	{
		HomePageTestSearch hom_obj = new HomePageTestSearch(driver);
		hom_obj.click_onsearch("realme");
	}
	
	
	
	
}
