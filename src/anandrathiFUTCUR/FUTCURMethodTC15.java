package anandrathiFUTCUR;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FUTCURMethodTC15 
{
   public String getData0() throws Exception 

{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	String data1 = sheet1.getRow(34).getCell(3).getStringCellValue();
	
	System.out.println("Data from Excel Sheet is.:" + data1);
	
	wb.close();
	
	return data1;
}

public String getData1() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	int data2 = (int) sheet1.getRow(34).getCell(5).getNumericCellValue();
	
	String str= Integer.toString(data2);
	
	System.out.println("Data from Excel Sheet is.:" + data2);
			
	wb.close();
	
	return str;
}

public String getData2() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	int data3 = (int) sheet1.getRow(34).getCell(10).getNumericCellValue();
	
	String str= Integer.toString(data3);
	
	System.out.println("Data from Excel Sheet is.:" + data3);
			
	wb.close();
	
	return str;
}
}