package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GrabaExcel {
	public void writeExcel(String filePath, String fileName, String sheetName, String[] dataToWrite)
			throws IOException {
	
		// Create an object of File class to open xlsx file
		File file = new File(filePath + "\\" + fileName);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		Workbook guru99Workbook = null;

		// Find the file extension by splitting file name in substring and getting only
		// extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file
		if (fileExtensionName.equals(".xlsx")) {

			// If it is xlsx file then create object of XSSFWorkbook class

			// ESTA LINEA LA PUSE EN COMENTARIO YO PUES NO ME FUNCIONA
			// guru99Workbook = new XSSFWorkbook(inputStream);

		}

		// Check condition if the file is xls file

		else if (fileExtensionName.equals(".xls")) {

			// If it is xls file then create object of XSSFWorkbook class

			guru99Workbook = new HSSFWorkbook(inputStream);
			
		}
		
		//OJO 
		CellStyle style; 
		style = guru99Workbook.createCellStyle(); 
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN1.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		
		// Read excel sheet by sheet name

		Sheet sheet = guru99Workbook.getSheet(sheetName);

		// Get the current count of rows in excel file

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		// Get the first row from the sheet

		Row row = sheet.getRow(0);

		// Create a new row and append it at last of sheet

		Row newRow = sheet.createRow(rowCount + 1);

		// Create a loop over the cell of newly created Row

		for (int j = 0; j < row.getLastCellNum(); j++) {

			Cell cell = newRow.createCell(j);

			// Fill data in row
			cell.setCellValue(dataToWrite[j]);

		}
		
		//SE CAMBIA COLOR
		sheet.getRow(1).getCell(1).setCellStyle(style);

		// Close input stream

		inputStream.close();

		// Create an object of FileOutputStream class to create write data in excel file

		FileOutputStream outputStream = new FileOutputStream(file);

		// write data in the excel file

		guru99Workbook.write(outputStream);

		// close output stream

		outputStream.close();

	}

//	public static void main(String... strings) throws IOException {
//
//		// Create an array with the data in the same order in which you expect to be
//		// filled in excel file
//
//		String[] valueToWrite = { "Mr. E", "Noida" };
//
//		// Create an object of current class
//
//		GrabaExcel objExcelFile = new GrabaExcel();
//
//		// Write the file using file name, sheet name and the data to be filled
//
//		objExcelFile.writeExcel(System.getProperty("user.dir") + "\\src\\excelExportAndFileIO", "ExportExcel.xlsx",
//				"ExcelGuru99Demo", valueToWrite);
//
//	}

}
