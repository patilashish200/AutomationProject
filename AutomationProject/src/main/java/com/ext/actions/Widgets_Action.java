package com.ext.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.ext.pageObjects.Widgets;
import com.ext.utility.BaseClass;
import com.ext.utility.Log;

public class Widgets_Action {

public static void  execute() throws InterruptedException, AWTException

{
	Actions act = new Actions(BaseClass.driver);
	
	Thread.sleep(4000);
	act.moveToElement(Widgets.link_more()).click().perform();
	
	Thread.sleep(2000);
	
	act.click(Widgets.link_FileUpload()).build().perform();
	
//	act.click(Widgets.link_Accordian()).build().perform();
	
	
	/*Widgets.link_Colapsible2().click();
	Thread.sleep(3000);
	
	
	Boolean text = Widgets.link_ColapsibleText().getText().contains("In this Automation tool, each and every functionality will be achieved by Single line code. i.e. Selecting a Value from dropdown, Switching between windows and Drag and Drop functionality etc...");
	
	Assert.assertTrue(text,"Text is not matching");
	
 String accordianText = Widgets.link_ColapsibleText().getText();
 System.out.println(accordianText);*/
 
	/*act.click(Widgets.link_DatePicker()).build().perform();
	Thread.sleep(3000);
	
	
	try {
		JavascriptExecutor jse = (JavascriptExecutor)BaseClass.driver;
		
	  jse.executeScript("document.getElementById('datepicker1').value='05/12/1987'");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	Widgets.btn_Browse().click();
	
	
	
	
/*String firstName;
try {
	firstName = BaseClass.driver.findElement(By.tagName("body")).getText();
	System.out.println(firstName);
} catch (Exception e) {
	Log.error("Unable toget first name");
	
	e.printStackTrace();
}*/
	
	Thread.sleep(50000);
	
/*Robot robo = new Robot();
 robo.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(50000);
 robo.keyRelease(KeyEvent.VK_DOWN);
	
 Thread.sleep(50000);
 robo.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(50000);
 robo.keyRelease(KeyEvent.VK_ENTER);*/
	
	
	/*FirefoxProfile profile = new FirefoxProfile();
	
	profile.setPreference("browser.download.dir", "E:\\Downloads");
	profile.setPreference("browser.download.folderList", 2);
	*/
	
	
	
	
}

}
