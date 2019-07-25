package anandrathiFUTCUR;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FUTCURMethodTC1 
{
	public String getData() throws Exception 
	
	{
		File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(1);
		
		String data0 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println("URL from Excel Sheet is.:\n" + data0 + "\n");
		
		wb.close();
		
		return data0;
	}
	
public String getData1() throws Exception 
	
	{
		File loc = new File("C:\\Anand Rathi Test Data.xlsx");
		
		FileInputStream fis = new FileInputStream(loc);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(1);
		
		String data1 = sheet1.getRow(0).getCell(2).getStringCellValue();
		
		System.out.println("User ID from Excel Sheet is.:\n" + data1 + "\n");
		
		wb.close();
		
		return data1;
	}

public String getData2() throws Exception 

{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);

	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	String data2 = sheet1.getRow(0).getCell(3).getStringCellValue();
	
	System.out.println("User Password from Excel Sheet is.:\n" + data2 + "\n");
	
	wb.close();
	
	return data2;
}

public String getData3(boolean isSecond) throws Exception 

{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	String data1 = sheet1.getRow(0).getCell(4).getStringCellValue();
	
	System.out.println("Security Answer from Excel Sheet is.:\n" + data1 + "\n");
	
	if(isSecond)
	{
       String shNm = wb.getSheetName(1);
       System.out.println("Excel Sheet Name.:\n" + shNm + "\n");
	}
	
	wb.close();
	
	return data1;
}

public String getData4() throws Exception 

{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	String data2 = sheet1.getRow(2).getCell(3).getStringCellValue();
	
	System.out.println("Data from Excel Sheet is.:\n" + data2 + "\n");
	
	wb.close();
	
	return data2;
}

public String getData5() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	int data3 = (int) sheet1.getRow(2).getCell(5).getNumericCellValue();
	
	String str= Integer.toString(data3);
	
	System.out.println("Data from Excel Sheet is.:\n" + data3 + "\n");
			
	wb.close();
	
	return str;
}

public String getData6() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	double data4 = (double) sheet1.getRow(2).getCell(7).getNumericCellValue();
	
	String str= Double.toString(data4);
	
	System.out.println("Data from Excel Sheet is.:\n" + data4 + "\n");
			
	wb.close();
	
	return str;
}

public String getData7() throws Exception 
{
	File loc = new File("C:\\Anand Rathi Test Data.xlsx");
	
	FileInputStream fis = new FileInputStream(loc);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(1);
	
	int data4 = (int) sheet1.getRow(2).getCell(12).getNumericCellValue();
	
	String str= Integer.toString(data4);
	
	System.out.println("Data from Excel Sheet is.:" + data4 + "\n");
			
	wb.close();
	
	return str;
}
}