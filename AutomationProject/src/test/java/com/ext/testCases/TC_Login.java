package com.ext.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ext.actions.Login_Action;
import com.ext.utility.Constant;
import com.ext.utility.ExcelUtils;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(com.ext.utility.Listener.class)
public class TC_Login extends BaseTestCase{
//public static WebDriver driver;

public int iTestCaserow;
	  
	  /*public static void main(String args[])
	  {
		  TC_Login tc1 = new TC_Login();
		  try {
			tc1.startTC();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  tc1.TC_Login1();
	  }
	  */
 @BeforeClass
   public void beforeMethod() throws IOException
    
 {
	/*String sTestCaseName = 	this.getClass().getSimpleName();
	System.out.println("Test Case Name is "+sTestCaseName);
	   
	ExcelUtils.setExcelFile(Constant.file_Path,Constant.file_Name ,Constant.sheetName);

	iTestCaserow = ExcelUtils.getRowNum(sTestCaseName, Constant.col_TCname);
	System.out.println("Test Case Row No "+iTestCaserow);
	
*/	/*driver = Utils.OpenBrowser(iTestCaserow);
	new BaseClass(driver);
	*/
}
   
@Test(testName="TestCaseName is TC_Login1")
public void  TC_Login1()
{
	System.out.println("This is test case1 syso");
	logger = report.startTest("TC_Login1");
/*	logger = report.startTest("TC_Login1");
	
	Login_Action.excecute(iTestCaserow);
	
	logger.log(LogStatus.INFO, "Logged in status");
*/
}
@Test

	public void TC_Login2()
{
	logger = report.startTest("TC_Login2");
//System.out.println("Im inside TC_Login2");
	//Assert.assertTrue(false);
	//logger.log(LogStatus.INFO, "Logged in test case 2 status");
	
}
}