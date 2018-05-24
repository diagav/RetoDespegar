package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class GrabaExcel {
	public void escribeExcel(String filePath, String fileName, String sheetName, String[] dataToWrite)
			throws IOException {
	
		File file = new File(filePath + "\\" + fileName);

		FileInputStream inputStream = new FileInputStream(file);

		Workbook libroTrabajo = null;

		libroTrabajo = new HSSFWorkbook(inputStream);
					
		//Variables para el estilo de la celda  
		CellStyle style; 
		style = libroTrabajo.createCellStyle(); 
		style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN1.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		Sheet sheet = libroTrabajo.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		Row row = sheet.getRow(0);

		Row newRow = sheet.createRow(rowCount + 1);

		for (int j = 0; j < row.getLastCellNum(); j++) {

			Cell cell = newRow.createCell(j);

			cell.setCellValue(dataToWrite[j]);
		}
		
		//Se cambia color para el primer registro 
		sheet.getRow(1).getCell(1).setCellStyle(style);

		inputStream.close();

		FileOutputStream outputStream = new FileOutputStream(file);


		libroTrabajo.write(outputStream);

		outputStream.close();
	}

}
