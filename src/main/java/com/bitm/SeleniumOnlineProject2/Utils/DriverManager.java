package com.bitm.SeleniumOnlineProject2.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverManager {
	
	//Static block 
	static {
		System.setProperty("webdriver.chrome.driver", "E:\\Selinium\\chromedriver.exe");	
	}
	
	public static WebDriver driver = new ChromeDriver();
	
	
	private DriverManager(){
		
	}
	
	

}
