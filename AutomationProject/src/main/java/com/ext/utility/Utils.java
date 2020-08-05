package com.ext.utility;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	static WebDriver driver;
	static WebElement ele;
	
	public static WebDriver OpenBrowser(String sBrowserName) throws InterruptedException
	
	{
		if (sBrowserName.equalsIgnoreCase("FF"))
		{
	    
			
			
			driver = new FirefoxDriver();
			
	    }
		else if (sBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", Constant.chrome_driver);
			driver = new ChromeDriver();
		}
		
		else if (sBrowserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", Constant.ie_driver);
			DesiredCapabilities dCap = new DesiredCapabilities();
			dCap.setCapability( InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			
			driver = new InternetExplorerDriver(dCap);
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constant.App_URL);	
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		
		
		
		
		return driver;

	}	
	
	
	/*public static void fileUpload(String filePath, String fileName )
	
	{
	//Copy the filepath and file name to clip board using StringSelection class
		
		StringSelection sel = new StringSelection(filePath+fileName);
		
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(contents, owner);
		
		
	}
	*/
	
	
	public static void clickOn(WebElement ele,int timeout )
	{
		
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, timeout);
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(ele)));
		ele.click();
		
		// This actually waits and checks if the element in question has been refreshed during the specified timeout and additionally waits for the element to become clickable.
		
	}
	
		
		
}
