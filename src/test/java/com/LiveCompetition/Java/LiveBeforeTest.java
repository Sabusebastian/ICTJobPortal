package com.LiveCompetition.Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiveBeforeTest {
    private static LiveBeforeTest instance;
    private WebDriver driver;

    public static Properties prop=null;
    
    private LiveBeforeTest() {
        // Initialize the web driver and login to the application
    	
    	prop=new Properties();
		FileInputStream propertyFile = null;
		try {
			propertyFile = new FileInputStream("D:\\Eclipse-java\\Selenium\\LiveCompetition\\src\\test\\resources\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(propertyFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver= new ChromeDriver();
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
    }

    public static LiveBeforeTest getInstance() {
        if (instance == null) {
            instance = new LiveBeforeTest();
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
