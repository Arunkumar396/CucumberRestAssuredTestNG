package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	
	public static void getData() throws IOException {
		int k = 0;
		int coloumn = 0;
		
		FileInputStream file = new FileInputStream(Constants.TEST_INPUT_FILE_LOCATION);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		int sheets = workbook.getNumberOfSheets();
		
		for(int i=0; i<=sheets; i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("mobile")){
				 
				XSSFSheet sheetName = workbook.getSheetAt(i);
				
			Iterator<Row> row =	sheetName.iterator();
			
			 Row firstRow = row.next();
			 Iterator<Cell> cell = firstRow.cellIterator();
			  
			 while(cell.hasNext()) {
				 
				Cell value = cell.next();
			
				if(value.getStringCellValue().equalsIgnoreCase("Mobile Name")) {
					
					  coloumn=k;  
					
				}
				
				k++;
			
			 }
				
				                 
			}
			             
			           
		}
	}

}
