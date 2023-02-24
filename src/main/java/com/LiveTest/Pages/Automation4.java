package com.LiveTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation4 {

	WebDriver driver;
	
	@FindBy(xpath="//label[@for= '2years']")
	private WebElement Year;
	
	@FindBy(xpath="//label[@for= 'selenium']")
	private WebElement Selenium;
		
	@FindBy(xpath="//label[@for= 'testng']")
	private WebElement TestNG;
	
	
	public Automation4(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void PickYear()
	{
		Year.click();
	}
	
	public void PickSelenium()
	{
		Selenium.click();
	}
	public void PickTestNG()
	{
		TestNG.click();
	}
	
}
