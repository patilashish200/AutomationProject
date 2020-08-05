package com.ext.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ext.actions.Register_Action;
import com.ext.utility.BaseClass;
import com.ext.utility.Constant;
import com.ext.utility.ExcelUtils;

public class TC_Register extends BaseTestCase{

  public int iTestCaseRow;
	@BeforeClass
     
  public void startTestCase()
  
  {
	 String sTestCaseName = this.getClass().getSimpleName();
	
	 try {
		ExcelUtils.setExcelFile(Constant.file_Path, Constant.file_Name, Constant.sheetName1);
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
	iTestCaseRow = ExcelUtils.getRowNum(sTestCaseName, Constant.col_TCname);
	 
  }
     @Test
     
     public void TC1_Register() throws InterruptedException
     {
    	 Register_Action.excecute(iTestCaseRow,BaseClass.driver);
     }


}
