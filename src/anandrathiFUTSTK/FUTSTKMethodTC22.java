package anandrathiFUTSTK;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FUTSTKMethodTC22
{
	
public String getData0() throws Exception 

{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(2);
	
	String data0 = sheet1.getRow(44).getCell(3).getStringCellValue();
	
	System.out.println("Data from Excel Sheet is.:\n" + data0 + "\n");
	
	wb.close();
	
	return data0;
}

public String getData1() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(2);
	
	int data1 = (int) sheet1.getRow(44).getCell(5).getNumericCellValue();
	
	String str = Integer.toString(data1);
	
	System.out.println("Data from Excel Sheet is.:\n" + data1 + "\n");
			
	wb.close();
	
	return str;
}

public String getData2() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(2);
	
	int data2 = (int) sheet1.getRow(44).getCell(9).getNumericCellValue();
	
	String str = Integer.toString(data2);
	
	System.out.println("Data from Excel Sheet is.:\n" + data2 + "\n");
			
	wb.close();
	
	return str;
}

public String getData3() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(2);
	
	int data2 = (int) sheet1.getRow(44).getCell(10).getNumericCellValue();
	
	String str = Integer.toString(data2);
	
	System.out.println("Data from Excel Sheet is.:\n" + data2 + "\n");
			
	wb.close();
	
	return str;
}
}