package com.ext.actions;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ext.pageObjects.Practice;
import com.ext.utility.BaseClass;
import com.ext.utility.Log;
import com.google.common.base.Predicate;

public class Practice_Action {
	public static void execute () throws InterruptedException
     {
    	
	/*	Actions	act = new Actions(BaseClass.driver);
		
    	 try {
    		 
    		 Thread.sleep(5000);
			act.moveToElement(Practice.switchTo()).click().perform();
			
			WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
			 wait.until(ExpectedConditions.visibilityOf(Practice.alerts()));
			
			Thread.sleep(5000);
    		act.click(Practice.alerts()).build().perform();
    		
			
			Log.info("Clicking on Alert hyperlink");
			
		} catch (Exception e) {
			Log.error("Unable to click on Alert hyperlink");
			e.printStackTrace();
		}
  */
    	/* try {
			Practice.alertBtn().click();
	
			Log.info("Clicked on button to see alert");
		} catch (Exception e) {
			Log.error("Unable to click button to see alert");
			e.printStackTrace();
		}
    	 
    	 WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, 10);
		 wait1.until(ExpectedConditions.alertIsPresent());
		
    	Alert alt = null;
		try {
			alt = BaseClass.driver.switchTo().alert();
			Thread.sleep(6000);
			
			Log.info("Switched to alert");
			
	       System.out.println("Alert message is "+alt.getText());	
		} catch (Exception e) {
		Log.error("Unable to switch to alert");
			e.printStackTrace();c
		}
         try {
			alt.accept();
			Log.info("Accepted alert. Clicked on OK button");
		} catch (Exception e) {
			Log.error("Unable to accept an error");
			e.printStackTrace();
		}
    */ 
     /*Practice.tabAlertOkCancel().click();
     Thread.sleep(5000);
     Practice.BtnToDisplayConfirmBox().click();
     Thread.sleep(5000);
     Alert alt = BaseClass.driver.switchTo().alert();
     alt.accept();*/
    	 
    /*Practice.tabAlertTextBox().click();
    Thread.sleep(5000);
    	
    Practice.BtnToDisplayPromptBox().click();
    
    Thread.sleep(5000);
    
    Alert alt = BaseClass.driver.switchTo().alert();
    	 
    	System.out.println(alt.getText());
    	
    	alt.sendKeys("Sample text in alert box");
    	alt.accept();*/
    	
		Actions	act = new Actions(BaseClass.driver);
		
   	 try {
   		 
   		 Thread.sleep(5000);
			act.moveToElement(Practice.switchTo()).click().perform();
			
			Thread.sleep(5000);
   		act.click(Practice.windows()).build().perform();
   		
			
			Log.info("Clicking on Windows hyperlink");
			
		} catch (Exception e) {
			Log.error("Unable to click on window hyperlink");
			e.printStackTrace();
		}

		
   	 
		//String parentWinddows = BaseClass.driver.getWindowHandle();
   	/* WebDriverWait wait = new WebDriverWait(BaseClass.driver, 10);
   	 
   	 wait.until(ExpectedConditions.visibilityOf(Practice.windowsClick()));
   	 
   	
		Practice.windowsClick().click();
		
        //Set<String> allwindows=  BaseClass.driver.getWindowHandles(); 
		Thread.sleep(10000);
		
		try {
		//	BaseClass.driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
			
			
			BaseClass.driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "" + Keys.SHIFT + "" + Keys.TAB);
	Log.info("Handling tab");
		
		} catch (Exception e) {
			Log.error("Unbale to click tab");
			e.printStackTrace();
		}
		
	//	BaseClass.driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		*/
  /* BaseClass.driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
   Thread.sleep(3000);
   BaseClass.driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
	*/
   /* String parentWindow = BaseClass.driver.getWindowHandle();
    
     Set <String> allWindows = BaseClass.driver.getWindowHandles();
    
    Iterator<String> I1 =allWindows.iterator();
    
   while(I1.hasNext())
	   
   {
	   String childWindow = I1.next();
	   
	   if(!parentWindow.equals(childWindow))
	   {
		  if( BaseClass.driver.switchTo().window(childWindow).getTitle().equals("Index"))
			  
		  {
			  System.out.println(BaseClass.driver.switchTo().window(childWindow).getTitle());
		  
		  }
		//   System.out.println(BaseClass.driver.switchTo().window(childWindow).getTitle());
		  
		  else
		  {
			  BaseClass.driver.close();
		  }
		 
		   
	   }
		
     }

BaseClass.driver.switchTo().window(parentWindow);	
	}
*/
 
   
   Practice.singleFrame().click();
   int size = BaseClass.driver.findElements(By.tagName("iframe")).size();
   // prints the total number of frames inside outer frame           
                                                                                                     
   System.out.println("Total Frames --" + size);
   BaseClass.driver.switchTo().frame(1);
    int size1 = BaseClass.driver.findElements(By.tagName("iframe")).size();
   // prints the total number of frames inside outer frame           
                                                                                                     
   System.out.println("Total Frames --" + size1);
   BaseClass.driver.switchTo().frame(0); 
   Practice.frameInput().sendKeys("Test"); 
}
}