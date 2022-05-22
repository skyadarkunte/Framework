package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class excelUtil {

	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH="C:\\Users\\manis\\eclipse-workspace\\Framework\\src\\main\\java\\resources\\Data.xlsx";
	
	public static  Object[][] getData(String sheetName) {
		   FileInputStream file =null;
		   try {
		     	file = new FileInputStream (TESTDATA_SHEET_PATH);
		     	}catch (FileNotFoundException e){
		     		e.printStackTrace();
		     } catch (IOException e)  {
		     	e.printStackTrace();
		     }
		   try {
			   book = WorkbookFactory.create(file);
		   		} catch (EncryptedDocumentException e) {
		   			e.printStackTrace();
		   		} catch (IOException e) {
		   			e.printStackTrace();
		   		}
		   sheet=book.getSheet(sheetName);
		   Object[][] data = new Object[sheet.getLastRowNum()][ sheet.getRow(0).getLastCellNum()];
		   
//		   System.out.println(sheet.getLastRowNum());
//		   System.out.println(sheet.getRow(0).getLastCellNum());
		   for (int i=0;i<sheet.getLastRowNum();i++)
		   {
			   for (int k =0; k<sheet.getRow(0).getLastCellNum();k++)
			   {
				   data[i][k]=sheet.getRow(i+1).getCell(k).toString();
//				   System.out.println(sheet.getRow(i+1).getCell(k).toString());
				   
			   }
		   }
		   
		   return data;
		   
	}
	
 
    	
    
    

}


