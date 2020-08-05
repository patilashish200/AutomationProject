package com.ext.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ext.utility.BaseClass;

public class Register_Page extends BaseClass {

	static WebElement ele;
	
public Register_Page(WebDriver driver) {
		super(driver);
		
	}

/*@FindBy(xpath="//input[@ng-model='FirstName']")
public static WebElement txt_FirstName;


@FindBy(xpath="//input[@ng-model='LastName']")
public static WebElement txt_LastName;

@FindBy(xpath="//*[@ng-model='Adress']")
public static WebElement txt_Address;


@FindBy(xpath="//input[@ng-model='EmailAdress']")
public static WebElement txt_EmailAddress;
*/



public static WebElement txt_FirstName()
{
	
	try {
		ele=driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return ele;
		
}

public static WebElement txt_LastName()
{
	ele=driver.findElement(By.xpath("//input[@ng-model='LastName']"));
	return ele;
}
public static WebElement txt_Address()
{
	ele=driver.findElement(By.xpath("//*[@ng-model='Adress']"));
	return ele;
	
}
public static WebElement txt_EmailAddress()
{
	ele=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	return ele;
	
}
public static WebElement txt_Phone()
{
	ele=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	return ele;
	
	
}

public static List<WebElement> radio_Gender()
{
	List <WebElement> ele1=driver.findElements(By.xpath("//input[@type='radio']"));
	return ele1;
	
}

public static List<WebElement> chbk_Hobbies()
{
	List <WebElement> ele2=driver.findElements(By.xpath("//input[@type='checkbox']"));
	return ele2;
	
}
public static List<WebElement> dd_Language()
{
	List <WebElement> ele3=driver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li/a"));

	return ele3;
	
}

public static WebElement dd_Skill()
{
	ele=driver.findElement(By.xpath("//select[@id='Skills']"));

	return ele;
	
	
}

public static WebElement dd_Country() throws InterruptedException
{
	Thread.sleep(10000);
	ele=driver.findElement(By.xpath("//select[@id='countries']"));
	return ele;
	
	
}

public static WebElement dd_SeCountry()
{
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	jse.executeScript("scrollBy(0,250);");
	
//	WebDriverWait wait = new WebDriverWait(driver, 20);
    ele=driver.findElement(By.xpath("//ul[@id='select2-country-results']//li"));
 // wait.until(ExpectedConditions.visibilityOf(ele));
	System.out.println("se country values " +ele);
	
	return ele;
	
	
}

public static WebElement dd_Year()
{
	ele=driver.findElement(By.xpath("//*[@id='yearbox']"));
	return ele;
	
}
public static WebElement dd_Month()
{
	ele=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	return ele;
	
	
}

public static WebElement dd_Day()
{
	ele=driver.findElement(By.xpath("//*[@id='daybox']"));
	return ele;
	
	
}

public static WebElement txt_Password()
{
	ele=driver.findElement(By.xpath("//*[@id='firstpassword']"));
	return ele;
	
}

public static WebElement txt_ConfirmPassword()
{
	ele=driver.findElement(By.xpath("//*[@id='secondpassword']"));
	return ele;
	
}

public static WebElement btn_Submit()
{
	ele=driver.findElement(By.xpath("//button[@id='submitbtn']"));
	return ele;
	
}
public static WebElement txt_msg()

{
	
	ele=driver.findElement(By.xpath("//*[@ng-if='EmailExists']"));
	return ele;
	
}

public static WebElement tble_name()
{
	ele=driver.findElement(By.xpath("//div[@class='ui-grid-cell ng-scope ui-grid-coluiGrid-0006']/div"));
	return ele;
	
}
}
