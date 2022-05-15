package com.pure.roxy.normandy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver driver;
	
	public static WebDriver getdriver()
	{
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
}
