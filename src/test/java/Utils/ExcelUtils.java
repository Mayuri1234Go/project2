package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName) {
		try {
		 workbook = new XSSFWorkbook(excelPath);
	    sheet = workbook.getSheet(sheetName);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.print(e.getMessage());
			System.out.print(e.getCause());
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		getRowCount();
		getCellData();	
	}
	
public static void getCellData() {
	
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(1).getCell(2));
		System.out.println(value);
		
}
	public static void getRowCount()  {
					int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.print("The no of rows is:" +rowCount);
	}}		
	

