package com.ext.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{

	public void onFinish(ITestContext arg0) {
		Reporter.log(" All Test Cases completed - onFinish " +arg0.getName() );
		
	}

	public void onStart(ITestContext arg0) {
		Reporter.log("All Test Cases started- onStart " +arg0.getName() );
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	
	public void printResultStatus(ITestResult result)
	
	{
		Reporter.log("Test case Name "+result.getName());
		Reporter.log("Resides under test class "+result.getTestClass());
		
		String status = null;
		switch(result.getStatus())
		{
		case ITestResult.SUCCESS:
		status = "Pass";
		break;	
		
		case ITestResult.FAILURE:
		status= "Failed";
		break;
		
		case ITestResult.SKIP:
		status = "Skipped";
		break;
			
		}

		Reporter.log("Test Case Status is "+status);
	}
	
	
	public void onTestFailure(ITestResult arg0) {
		printResultStatus(arg0);
		
	}

	public void onTestSkipped(ITestResult arg0) {
		printResultStatus(arg0);
	}

	public void onTestStart(ITestResult arg0) {
		Reporter.log("Test Case started " +arg0.getName() +arg0.getTestName());	
	
	}

	public void onTestSuccess(ITestResult arg0) {
		printResultStatus(arg0);
		
	}

}
