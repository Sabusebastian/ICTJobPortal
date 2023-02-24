package com.LiveTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation1 {

	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter your name']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@placeholder='Enter your mobile phone']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@placeholder='Enter email']")
	private WebElement EMail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(xpath="//button[@name='submit']")
	private WebElement Submit;
	
	public Automation1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddName(String EnterName)
	{
		Name.sendKeys(EnterName);
	}
	public void AddPhone(String phone2) 
	{
		Phone.sendKeys(phone2);
	}
	public void AddEmail(String EnterEmail) 
	{
		
		EMail.sendKeys(EnterEmail);
	}
	public void AddPassword(String EnterPassword) 
	{
		Password.sendKeys(EnterPassword);
	}
	public void AddAddress(String EnterAddress) 
	{
		Address.sendKeys(EnterAddress);
	}
	public void ClickSubmit() 
	{
		Submit.click();
	}	
}
