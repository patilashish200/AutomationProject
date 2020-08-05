package com.ext.actions;

import java.sql.ResultSet;

import org.openqa.selenium.WebElement;

import com.ext.pageObjects.Login_Page;
import com.ext.utility.BaseClass;
import com.ext.utility.Constant;
import com.ext.utility.ExcelUtils;
import com.ext.utility.Log;
import com.ext.utility.Utils;

public class Login_Action{

static String sUserName;
static String sEmail;
static String sPassword;
public static void excecute(int iTestCaseRow)

{
			try {
				sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.col_UserName);
				//System.out.println("user name value "+sUserName);
			//	Log.info("Username from TestData is " +sUserName);
			} catch (Exception e) {
				Log.info(" Unable to get Username from TestData ");
				e.printStackTrace();
			}
			
			/*try {
				
				while (rs.next()) {
				System.out.println("Result set value in exceute methiid is "+rs);
				System.out.println("Password value in execute method is "+rs.getString("Passw"));
				}
			//	while (rs.next()) {
				Login_Page.userName_txt().sendKeys(rs.getString("Passw"));
				System.out.println("Username from execute from Login_Action "+rs.getString("Passw"));
			//	}
	*/
			Login_Page.userName_txt().sendKeys(sUserName);
			/*	Log.info("Entering username into Username text box ");
			} catch (Exception e) {
				Log.info(" uNable to enter username into Username text box ");
				e.printStackTrace();
			}*/
			
			
			/*try {
				Login_Page.signIn_btn().click();
				Log.info("Clicked on Sign In button");
			} catch (Exception e) {
				Log.info("Unable to click on Sign In button");
				e.printStackTrace();
			}*/
			
			WebElement ele1 = Login_Page.signIn_btn();
			
			Utils.clickOn(ele1, 10);
			
			
			
	
/*	try {
		Login_Page.Login_btn().click();
		Log.info("Clicked on Sign In button ");
	} catch (Exception e1) {
		Log.error("Unable to click on Sign In button ");
		e1.printStackTrace();
	}

try {
	
	sEmail = ExcelUtils.getCellData(iTestCaseRow, Constant.col_Email);
	Log.info("Email from Testdata is "+sEmail);
} catch (Exception e) {
	e.printStackTrace();
	Log.error("Unable to get Email from Testdata");
}

try {
	Login_Page.Email_txt().sendKeys(sEmail);
	Log.info("Entered Email ");
} catch (Exception e) {
	Log.error("Unable to enter Email");
	e.printStackTrace();
}


try {
	sPassword =ExcelUtils.getCellData(iTestCaseRow,Constant.col_Password1);
	Log.info("Password from Testdata is "+sPassword);
} catch (Exception e) {
	Log.error("Unable to get password from testdata ");
	e.printStackTrace();
}

try {
	Login_Page.Password_txt().sendKeys(sPassword);
	Log.info("Entered Password");
} catch (Exception e1) {
	// TODO Auto-generated catch bloc
Log.error("Unable to enter password");
	e1.printStackTrace();
}

try {
	Login_Page.Enter_btn().click();
	Log.info("Clicked on Enter button");
} catch (Exception e) {
 Log.error("Unable to click on Enter button");
	e.printStackTrace();
}

*/
	
}

}
