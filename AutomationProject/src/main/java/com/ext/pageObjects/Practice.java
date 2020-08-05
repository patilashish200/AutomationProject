package com.ext.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ext.utility.BaseClass;
import com.ext.utility.Log;


public class Practice extends BaseClass {
	

	public Practice(WebDriver driver) {
		super(driver);
		
	}

static WebElement ele;
	
	
public static WebElement switchTo()
{
try {
	ele=driver.findElement(By.xpath("//*[text()='SwitchTo']"));
	
	Log.info("Found Switch To Menu");
} catch (Exception e) {
	Log.error("Unable to found Swicth to menu");
	e.printStackTrace();
}
return ele;	
}

public static WebElement alerts()
{	
	try {
		ele =driver.findElement(By.xpath("//a[@href='Alerts.html']"));
		Log.info("Found Alerts submenu");
	} catch (Exception e) {
		Log.error("Unable to find Alerts sub menu");
		e.printStackTrace();
	}
	return ele;
	
}

public static WebElement alertBtn()
{
	
	try {
		ele=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Log.info("Found  alert button");

	} catch (Exception e) {
		Log.error("Unable to find  Alert button");
		e.printStackTrace();
	}
	return ele;
	
}
	public static WebElement tabAlertOkCancel()
	{
		ele=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		
		return ele;
}

	public static WebElement BtnToDisplayConfirmBox()
	{
		ele=driver.findElement(By.xpath("//*[@id='CancelTab']/button"));
		
		return ele;
}	
	public static WebElement tabAlertTextBox()
	{
		ele=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		
		return ele;
}	
	public static WebElement BtnToDisplayPromptBox()
	{
		ele=driver.findElement(By.xpath("//*[@id='Textbox']/button"));
		
		return ele;
}	
	
	public static WebElement windows()
	{
		
		ele =driver.findElement(By.xpath("//a[@href='Frames.html']"));
		return ele;
		
	}
	
	public static WebElement windowsClick()
	{
		
		ele =driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		return ele;
		
	}

	public static WebElement frameInput()
	
	{
		
		ele=driver.findElement(By.xpath("//input[@type='text']"));
		return ele;
	
	}
	
public static WebElement singleFrame()
	
	{
		
		ele=driver.findElement(By.xpath("//a[@href='#Multiple']"));
		return ele;
	
	}
	

}
