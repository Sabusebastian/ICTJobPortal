package com.LiveTest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation2 {

	WebDriver driver;
	
	@FindBy(id="male")
	private WebElement Gender;
	
	@FindBy(id="tuesday")
	private WebElement Tuesday;
	
	@FindBy(id="friday")
	private WebElement Friday;
	
	public Automation2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SelectGender()
	{
		Gender.click();
	}
	public void SelectTuesDay() throws InterruptedException
	{
		Thread.sleep(5000);
		Tuesday.click();
	}
	public void SelectFriday() throws InterruptedException
	{
		Thread.sleep(5000);
		Friday.click();
	}
}
