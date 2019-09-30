package ExcelDataDrivn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelData {

	public static void main(String[] args) throws IOException {
		//file input stream argument 
		FileInputStream fil = new  FileInputStream("C:\\Users\\User\\Desktop\\Book1.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fil);
//get the count of nmber of the sheet 
		int sheetsCount = workbook.getNumberOfSheets();
		for(int i=0; i<sheetsCount; i++) {
			String shetName = workbook.getSheetName(i);
			//System.out.println(shetName);
			if(shetName.equalsIgnoreCase("tet dat")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				///iterate through the sheet 
				Iterator<Row> rows = sheet.iterator();
				//go to the firsst row 
				rows.next();//moving to the first row  
				Row firstRow = rows.next();
				Iterator<Cell> cellData =firstRow.cellIterator();
				int k =  0; 
				while (cellData.hasNext())/// we are cheking if the next row exists
				{
					  /// moving to the e=next row (first time it iwll go to the first cell )
				Cell value = cellData.next();
				if(value.getStringCellValue().equalsIgnoreCase("california")) 
				{
					int column = k;//get the index
					System.out.println(k + "is the clmn");
					
				}
				k++;// increment the k after each while loop					
					
	
				
				}
				System.out.println(k);
		
			
			
		}
	//identify a specific column(first name ) by iterating through the 1st row 
		
 //once the colmn is specifed thne get scann the entire coul then get the data or the row 
		
		
		
		
		
		
	}

	}
}

	
