package Excelfilebasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelreader {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
				
				
			
		String xFile = "C:\\Users\\user\\Documents\\Testdatasheetwb.xlsx";
		
		FileInputStream fis = new FileInputStream(xFile);
		
	     Workbook wb = WorkbookFactory.create(fis);
	    Sheet  sh = wb.getSheet("Sheet1");
	    
//	    rows cnt
	    int rowscnt = sh.getLastRowNum();
	    System.out.println("rowscnt="+rowscnt);
	    
//	    coloum cnt
	    
	    int clmscnt = sh.getRow(0).getLastCellNum();
	    System.out.println("clmscnt="+clmscnt);
	    
	 // Read data from row, cell -  0,0 
	    String data00 = sh.getRow(0).getCell(0).toString();
	    System.out.println("data00="+data00);
	    
	 // Read data from row, cell -  0,1 --Qty
	    String data01 =  sh.getRow(0).getCell(1).toString(); 
	    System.out.println("data01="+data01);
	    

		// HW Read daat from 0,2 - Price
	    String data02 = sh.getRow(0).getCell(2).toString();
	    System.out.println("data02="+data02);
	    
//	    	// Read data from 1,0
	    String data10 = sh.getRow(1).getCell(1).toString();
	    System.out.println("data10="+data10);
	    
	 // Read data from 1,1
	    String data11 =  sh.getRow(1).getCell(1).toString();
	    System.out.println("data11="+data11);
	    
	    // Read data from 1,2
	    String data12 =  sh.getRow(1).getCell(2).toString();
	    System.out.println("data12="+data12);
	    
//	    // HW read  all rowsdata - from first column?
	    String allrowsdataclm = sh.getRow(0).getCell(0).toString();
	    System.out.println("allrowsdataclm="+allrowsdataclm);
	    
	  //HW  Read all rows  from 2nd columns ?
	    
	    
	    
	}

}
