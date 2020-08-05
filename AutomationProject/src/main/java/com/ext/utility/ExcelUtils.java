package com.ext.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	/*public static void main(String args[]) throws FileNotFoundException
	{
		ExcelUtility.setData();
	}*/
	public static  XSSFWorkbook wb;
	public static HSSFWorkbook wb1;
	public static Sheet sh;
	public static Cell cell;
public static void setExcelFile( String filePath, String fileName ,String sheetName) throws IOException

{    
// File file = new File (filePath+"\\"+fileName);
	FileInputStream fis = new FileInputStream(filePath+"\\"+fileName);
//  String fileName = file.getName();
//	long size =file.length();
	
	//FileReader fis = new FileReader(filePath+"\\"+fileName);
  
	System.out.println("Im inside setExcelsheet method" +filePath +fileName +sheetName);
 
 String fileExtention = fileName.substring(fileName.indexOf("."));
	System.out.println("Exteention Name is"+fileExtention);

  if (fileExtention.equalsIgnoreCase(".xlsx"))
	  
  {
  wb =new XSSFWorkbook(fis);
  

 sh= wb.getSheet(sheetName);
  
	System.out.println("Im inside the .xlsx method");
  
  }
  else 
  {
	 wb1= new HSSFWorkbook(fis);
	 sh=wb1.getSheet(sheetName);
  }
}
 public static String getCellData(int irowNum, int icolNum)
 {
	 
//	 System.out.println("Im inside getCellData method");
  cell= sh.getRow(irowNum).getCell(icolNum);
  
  DataFormatter formatter = new DataFormatter();
  String cellValue = formatter.formatCellValue(cell);
  
  
  // String cellValue= cell.getStringCellValue();
   System.out.println("Cell value is "+cell);
	return cellValue;
	

 }

public static int getRowNum(String value, int colNum)
{
	int i;
	int totalRow =sh.getLastRowNum();
	System.out.println(totalRow);
	for (i=1; i<totalRow; i++)
	{
	if (ExcelUtils.getCellData(i,colNum).equalsIgnoreCase(value))
	{
		System.out.println("im inside getRowNum method");
		break;	
	} 
	}

	return i;

}
}
