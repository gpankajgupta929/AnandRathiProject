package testing;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class URLMethod {
	public String getData0() throws Exception

	{
		File loc = new File("C:\\Anand Rathi Test Data.xlsx");

		FileInputStream fis = new FileInputStream(loc);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(1);

		String data1 = sheet1.getRow(0).getCell(4).getStringCellValue();

		System.out.println("Data from Excel Sheet is.:" + data1);

		wb.close();

		return data1;
	}
}
