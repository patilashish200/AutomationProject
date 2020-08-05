package com.ext.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ext.utility.BaseClass;
import com.ext.utility.Log;

public class Login_Page2 extends BaseClass{

	public static WebElement ele;
	
	public Login_Page2(WebDriver driver)
	{
     super(driver);

	}
	
	
	/*@FindBy(id= "email")
	public static WebElement userName_txt;
	
	 
	@FindBy(id="enterimg") 
	public static WebElement signIn_btn;
	*/
	
	public static WebElement userName_txt()
	
	{
			try {
				ele = driver.findElement(By.id("email"));
				Log.info("Username text box is found on Login page");
			
			} catch (Exception e) {
				
				Log.info("Username text box is NOT found on Login page");
				e.printStackTrace();
			}
			return ele;
	}
	
	
	
	
	
	
     public static WebElement signIn_btn()
	
	{
		try {
			ele = driver.findElement(By.id("enterimg"));
			Log.info("Sign In button is found on Login page");
		} catch (Exception e) {
			Log.info("Sign In button is NOT found on Login page");
			e.printStackTrace();
		}
		return ele;
	}
	
public static WebElement Login_btn()

{
	try {
		ele = driver.findElement(By.id("btn1"));
		Log.info("Login button is found on Login page");
	} catch (Exception e) {
		Log.info("Login button is NOT found on Login page");
		e.printStackTrace();
	}
	return ele;
}


public static WebElement Email_txt()

{
	
		try {
			ele = driver.findElement(By.xpath("//input[@ng-model='Email']"));
			Log.info("Email text box is found on Login page");
		
		} catch (Exception e) {
			
			Log.info("Email text box is NOT found on Login page");
			e.printStackTrace();
		}
		return ele;
}

public static WebElement Password_txt()

{
	
		try {
			ele = driver.findElement(By.xpath("//input[@ng-model='Password']"));
			Log.info("Password text box is found on Login page");
		
		} catch (Exception e) {
			
			Log.info("Password text box is NOT found on Login page");
			e.printStackTrace();
		}
		return ele;
}

public static WebElement Enter_btn()

{
	
		try {
			ele = driver.findElement(By.xpath("//img[@id='enterbtn']"));
			Log.info("Enter button is found on Login page");
		
		} catch (Exception e) {
			
			Log.info("Enter button is NOT found on Login page");
			e.printStackTrace();
		}
		return ele;
}

public static WebElement ErrorMsg()
{
	
	try {
		ele = driver.findElement(By.xpath("//label[@id='errormsg']"));
		Log.info("Found error message on Login Page");
	} catch (Exception e) {
		Log.error("Not found error ");
		e.printStackTrace();
	}
	
	return ele;
	
}



}
