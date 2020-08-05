package com.ext.actions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ext.pageObjects.Register_Page;
import com.ext.utility.Constant;
import com.ext.utility.ExcelUtils;

public class Register_Action {

public static void excecute(int iTestCaseRow, WebDriver driver) throws InterruptedException

{
	String firstName = ExcelUtils.getCellData(iTestCaseRow, Constant.col_FirstName);
	Register_Page.txt_FirstName().sendKeys(firstName);
	
	String lastName = ExcelUtils.getCellData(iTestCaseRow, Constant.col_LastName);
	Register_Page.txt_LastName().sendKeys(lastName);
	
	String address = ExcelUtils.getCellData(iTestCaseRow, Constant.col_Address);
	Register_Page.txt_Address().sendKeys(address);
	
	
	String emailAddress = ExcelUtils.getCellData(iTestCaseRow, Constant.col_EmailAddress);
	Register_Page.txt_EmailAddress().sendKeys(emailAddress);
	
	String phone = ExcelUtils.getCellData(iTestCaseRow, Constant.col_Phone);
	Register_Page.txt_Phone().sendKeys(phone);
	
	
	String gender = ExcelUtils.getCellData(iTestCaseRow,Constant.col_Gender);

	List <WebElement> list = Register_Page.radio_Gender();
	
	for (WebElement w : list)
	{
		if (w.getAttribute("value").equalsIgnoreCase(gender))
		{
			w.click();
		}
		
	}
	
    try {
		String hobbies = ExcelUtils.getCellData(iTestCaseRow,Constant.col_Hobbies);

		List <WebElement> listHob = Register_Page.chbk_Hobbies();
		
		System.out.println(hobbies);
		
		String [] hob =hobbies.split(",");
		System.out.println("No of hobbies "+hob.length);
		
		for (int i=0; i<hob.length; i++ )
		{
		
		for (WebElement w : listHob)
		{
			if (w.getAttribute("value").equalsIgnoreCase(hob[i]))
			{
				if(!w.isSelected())
				{
			
					w.click();
				}
				
			
			}		
		}
		}
	} catch (Exception e7) {
		// TODO Auto-generated catch block
		e7.printStackTrace();
	}
	
		
    
    String language = ExcelUtils.getCellData(iTestCaseRow, Constant.col_Language);
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    List <WebElement> lan = Register_Page.dd_Language();
    
    for (WebElement w : lan)
    {
    	if (w.getAttribute("innerHTML").equalsIgnoreCase(language))
    		
    	{
    		Thread.sleep(2000);
    		jse.executeScript("arguments[1].click();","",w);
    	}
    }
    
   
	try {
		String skill = ExcelUtils.getCellData(iTestCaseRow, Constant.col_Skills);
		
		Select se = new Select (Register_Page.dd_Skill());
		
		
		se.selectByVisibleText(skill);
	   se.getFirstSelectedOption();
	   

	} catch (Exception e5) {
	
		e5.printStackTrace();
	}
	
	
		try {
			String country = ExcelUtils.getCellData(iTestCaseRow, Constant.col_Country);
			
			Select se1 = new Select (Register_Page.dd_Country());
			Thread.sleep(5000);
			
			se1.selectByVisibleText(country);
			
			
		} catch (Exception e4) {
			
			e4.printStackTrace();
		}
	
	
	
	//try {
	//	String seCountry =ExcelUtils.getCellData(iTestCaseRow, Constant.col_SeCountry);
		//Register_Page.dd_SeCountry().sendKeys(seCountry);
		
//	Register_Page.dd_SeCountry().sendKeys(Keys.ENTER);
		
		/*List<WebElement> listCountry = Register_Page.dd_SeCountry();
		System.out.println(listCountry);
		for (WebElement w :listCountry )
		{
			
			if (w.getAttribute("innerHTML").equalsIgnoreCase(seCountry))
			{
				w.click();
			}
		
		}*/
		
	/*	System.out.println(listCountry);
	} catch (Exception e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
	
	*/
	
/*	Register_Page.dd_SeCountry().click();
	//.sendKeys(seCountry);
		*/
		
	try {
		String DOB = ExcelUtils.getCellData(iTestCaseRow, Constant.col_DOB);
		
		String [] allDOB=DOB.split("-");
		
		Select se2 = new Select(Register_Page.dd_Day());
		se2.selectByVisibleText(allDOB[0]);
		
		Select se3 = new Select(Register_Page.dd_Month());
		se3.selectByVisibleText(allDOB[1]);
		
		Select se4 = new Select(Register_Page.dd_Year());
		se4.selectByVisibleText(allDOB[2]);
	} catch (Exception e2) {
		
		e2.printStackTrace();
	}
	
	try {
		String password = ExcelUtils.getCellData(iTestCaseRow, Constant.col_Password);
		Register_Page.txt_Password().sendKeys(password);
	} catch (Exception e1) {
		
		e1.printStackTrace();
	}
	
	try {
		String conpassword = ExcelUtils.getCellData(iTestCaseRow, Constant.col_ConfirmPassword);
		Register_Page.txt_ConfirmPassword().sendKeys(conpassword);
	} catch (Exception e) {
		e.printStackTrace();
	}

	
	Register_Page.btn_Submit().click();
	
	Actions act = new Actions(driver);
	
	
	
}







}
