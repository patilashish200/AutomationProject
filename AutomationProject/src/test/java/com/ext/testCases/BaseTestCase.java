package com.ext.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ext.utility.BaseClass;
import com.ext.utility.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTestCase {

	static ExtentReports report;
	static ExtentTest logger; 
	
public static WebDriver driver;
@BeforeTest
@Parameters ({"browserName"})
public static void prerequite(String browser)

{
    report = new ExtentReports("E:\\Mytestreport.html");
   logger = report.startTest("prerequite");
	
	try {
		driver = Utils.OpenBrowser(browser);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	logger.log(LogStatus.INFO, "Browser started");
	
	new BaseClass(driver);
}

@AfterMethod
public void tearDown(ITestResult result)
{
if(result.getStatus()==ITestResult.FAILURE)
{
logger.log(LogStatus.FAIL, "Test Case failed");

}

report.endTest(logger);
report.flush();
}
}
