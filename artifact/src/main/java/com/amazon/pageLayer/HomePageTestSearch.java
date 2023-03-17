package com.amazon.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTestSearch 
{
   
	public HomePageTestSearch(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//======================================================
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement click_onsearch;
	//======================================================
	
	public void click_onsearch(String realme)
	{
		click_onsearch.click();
		click_onsearch.sendKeys(realme+Keys.ENTER);
	}
	
	
}





















