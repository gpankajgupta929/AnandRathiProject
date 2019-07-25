package testing;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test1Method {
	public String getData0() throws Exception {
		File loc = new File("C:\\Anand Rathi Test Data.xlsx");

		FileInputStream fis = new FileInputStream(loc);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		double data0 = (double) sheet1.getRow(56).getCell(0).getNumericCellValue();

		String str = Double.toString(data0);

		System.out.println("Data from Excel Sheet is.:" + data0);

		wb.close();

		return str;
	}
}
