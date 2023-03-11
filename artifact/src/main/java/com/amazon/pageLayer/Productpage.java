package com.amazon.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage
{
	
	public Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this );
	}
	
	@FindBy(xpath="//i[contains(@class,'a-icon a-icon-star-medium a-star-medium-4')]")
	private WebElement click_on_rateing;
	
	@FindBy(xpath="//span[contains(text(),'Sort by:')]")
	private WebElement click_on_sortFilter;
	
	@FindBy(xpath="//a[@id='s-result-sort-select_2']")
	private WebElement click_on_HightoLow;
	
	@FindBy(xpath="//span[contains(text(),'realme GT 2 Pro (Paper Green 12GB RAM+256GB Storag')]")
	private WebElement click_on_Productrealme;
	
	
	
	
	
	public void clickonrateing()
	{
		click_on_rateing.click();
	}
	public void clickonsortFilter()
	{
		click_on_sortFilter.click();
	}
	public void clickonHightoLow()
	{
		click_on_HightoLow.click();
	}
	public void click_on_Productrealme ()
	{
		click_on_Productrealme.click();
	
	}

	
	
	
	
	
	
	
	
	
	
}
