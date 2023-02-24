package com.LiveCompetition.Java;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.LiveTest.Pages.Automation1;
import com.LiveTest.Pages.Automation2;
import com.LiveTest.Pages.Automation3;
import com.LiveTest.Pages.Automation4;
import com.LiveTest.Utility.ExcelUtilities;

public class LiveTest{
		
	Automation1 AutObj;
	Automation2 Aut2Obj;
	Automation3 Aut3Obj;
	Automation4 Auto4Obj;
	
	WebDriver driver = LiveBeforeTest.getInstance().getDriver();
	
	@Test(priority=1)
	public void Automation1Test1() throws IOException, InterruptedException
	{
		AutObj=new Automation1(driver);
				
		String Name=ExcelUtilities.getValues(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx", 0);
		String Phone=ExcelUtilities.getValues(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx", 0);
		String EMail=ExcelUtilities.getValues(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx", 0);
		String Password=ExcelUtilities.getValues(0, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx", 0);
		String Address=ExcelUtilities.getValues(0, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtility.xlsx", 0);

		AutObj.AddName(Name);
		AutObj.AddPhone(Phone);
		AutObj.AddEmail(EMail);
		AutObj.AddPassword(Password);
		AutObj.AddAddress(Address);
		AutObj.ClickSubmit();
		
		System.out.println("Sabu");
		System.out.println("sample");
		
	}

	

}
