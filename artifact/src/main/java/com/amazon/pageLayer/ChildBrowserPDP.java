package com.amazon.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildBrowserPDP 
{
	public ChildBrowserPDP(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//======================================================
	
	@FindBy(xpath="(//div[@class='a-accordion-inner accordion-row-content'])[2]//input[@id='add-to-cart-button']")
	private WebElement click_onAddToCart_Button;
	
	
	//======================================================
	
	
	public void clickonAddToCartButton()
	{
		click_onAddToCart_Button.click();
	}
	
	
	
	

}
