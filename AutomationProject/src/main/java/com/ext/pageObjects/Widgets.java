package com.ext.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ext.utility.BaseClass;
import com.ext.utility.Log;

public class Widgets  extends BaseClass{

	
	static WebElement ele;
	public Widgets(WebDriver driver) {
		super(driver);
	}

public static WebElement link_Widgets()
{
	
	ele = driver.findElement(By.xpath("//a[@href='Widgets.html']"));
	
	return ele;	
}
public static WebElement link_Accordian()
{
	
	ele = driver.findElement(By.xpath("//a[@href='Accordion.html']"));
	
	return ele;	
}
public static WebElement link_DatePicker()
{
	
	ele = driver.findElement(By.xpath("//a[@href='Datepicker.html']"));
	
	return ele;	
}

public static WebElement link_Colapsible2()
{
	
	ele = driver.findElement(By.xpath("//a[@href='#collapse2']"));
	
	return ele;	
}

public static WebElement link_ColapsibleText()
{
	
	ele = driver.findElement(By.xpath("//*[@id='collapse2']/div"));
	
	return ele;	
}

public static WebElement text_datePicker()
{
	
	ele = driver.findElement(By.xpath("//input[@id='datepicker1']"));
	
	return ele;	
}
public static WebElement link_more()
{
try {
	ele=driver.findElement(By.xpath("//*[text()='More']"));
	
	Log.info("Found Switch To Menu");
} catch (Exception e) {
	Log.error("Unable to found More menu");
	e.printStackTrace();
}
return ele;	
}

public static WebElement link_dynamicData()
{	
	try {
		ele =driver.findElement(By.xpath("//a[@href='DynamicData.html']"));
		Log.info("Found Alerts submenu");
	} catch (Exception e) {
		Log.error("Unable to find Dynamic data sub menu");
		e.printStackTrace();
	}
	return ele;
	
}

public static WebElement btn_getdynamicData()
{	
	try {
		ele =driver.findElement(By.xpath("//*[@id='save']"));
		Log.info("Found button");
	} catch (Exception e) {
		Log.error("Unable to find Dynamic data button");
		e.printStackTrace();
	}
	return ele;
	
}
public static WebElement btn_download()
{	
	try {
		ele =driver.findElement(By.xpath("//a[text()='Download']"));
		Log.info("Found button");
	} catch (Exception e) {
		Log.error("Unable to find Download button");
		e.printStackTrace();
	}
	return ele;
	
}

public static WebElement link_FileDownload()
{	
	try {
		ele =driver.findElement(By.xpath("//a[@href='FileDownload.html']"));
		Log.info("Found Alerts submenu");
	} catch (Exception e) {
		Log.error("Unable to find Dynamic data sub menu");
		e.printStackTrace();
	}
	return ele;
	
}
public static WebElement link_FileUpload()
{	
	try {
		ele =driver.findElement(By.xpath("//a[@href='FileUpload.html']"));
		Log.info("Found File Upload submenu");
	} catch (Exception e) {
		Log.error("Unable to find File Upload sub menu");
		e.printStackTrace();
	}
	return ele;
	
}

public static WebElement btn_Browse()
{	
	try {
		ele =driver.findElement(By.xpath("//input[@id='input-4']"));
		Log.info("Found Browse button");
	} catch (Exception e) {
		Log.error("Unable to find Browse button");
		e.printStackTrace();
	}
	return ele;
	
}




}
