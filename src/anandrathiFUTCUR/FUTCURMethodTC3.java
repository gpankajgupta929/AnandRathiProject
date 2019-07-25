package anandrathiFUTCUR;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FUTCURMethodTC3 
{
   public String getData0() throws Exception 

{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	String data1 = sheet1.getRow(6).getCell(3).getStringCellValue();
	
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
	
	int data2 = (int) sheet1.getRow(6).getCell(5).getNumericCellValue();
	
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
	
	double data3 = (double) sheet1.getRow(6).getCell(7).getNumericCellValue();
	
	String str= Double.toString(data3);
	
	System.out.println("Data from Excel Sheet is.:" + data3);
			
	wb.close();
	
	return str;
}

public String getData3() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	int data4 = (int) sheet1.getRow(6).getCell(12).getNumericCellValue();
	
	String str= Integer.toString(data4);
	
	System.out.println("Data from Excel Sheet is.:" + data4);
			
	wb.close();
	
	return str;
}

}