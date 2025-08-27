package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static void main(String[] args) throws IOException {
		 FileInputStream filePath = new FileInputStream("C:\\path\\to\\TestData.xlsx");
	        XSSFWorkbook excelFile = new XSSFWorkbook(filePath);
	        XSSFSheet sheet = excelFile.getSheet("Sheet1");

	        int totalRows = sheet.getLastRowNum(); // Last row index
	        int totalCols = sheet.getRow(0).getLastCellNum(); // Total columns in first row

	        for (int i = 0; i <= totalRows; i++) {
	            XSSFRow row = sheet.getRow(i);
	        
	            for (int j = 0; j < totalCols; j++) {
	                XSSFCell cell = row.getCell(j);
	                if (cell != null) {
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "   ");
	                            break;
	                        case NUMERIC:
	                            System.out.print(cell.getNumericCellValue() + "   ");
	                            break;
	                        case BOOLEAN:
	                            System.out.print(cell.getBooleanCellValue() + "   ");
	                            break;
	                        default:
	                            System.out.print("   "); // Blank cell
	                    }
	                }
	            }
	            System.out.println(); // New line after each row
	        }
	            excelFile.close();
		        filePath.close();
	        }

	        
	}
