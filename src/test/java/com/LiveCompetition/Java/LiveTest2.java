package com.LiveCompetition.Java;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.LiveTest.Pages.Automation1;
import com.LiveTest.Pages.Automation2;
import com.LiveTest.Pages.Automation3;
import com.LiveTest.Pages.Automation4;

public class LiveTest2 {
	
	WebDriver driver = LiveBeforeTest.getInstance().getDriver();
	
Automation1 AutObj;
Automation2 Aut2Obj;
Automation3 Aut3Obj;
Automation4 Auto4Obj;
	
	@Test(priority=2)
	public void Automation2Test() throws InterruptedException
	{
		Aut2Obj=new Automation2(driver);
		Aut2Obj.SelectGender();
		Aut2Obj.SelectTuesDay();
		Aut2Obj.SelectFriday();

	}
	
}
