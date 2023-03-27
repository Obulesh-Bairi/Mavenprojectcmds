package ExcelreadfileGenericmethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.bcel.generic.RETURN;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import net.bytebuddy.asm.Advice.Return;

public class Excelreader1 {

	private static int cellNum;
	private static int rowNum;





	private static String xlFile;
	
	public static int  rowscnt(String xlFile, String sheet1) throws IOException
	{
		// creat workbook var
		
		FileInputStream fis = new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);
		int rowscnt = wb.getSheet(sheet1).getLastRowNum();
		System.out.println("rowscnt="+rowscnt);
		return rowscnt;
	}
	
	//rowscnt
	
	public static int columscnt(String xlFile,String Sheet1) throws EncryptedDocumentException, IOException
	{
		//ctreat wb var
		FileInputStream fis = new FileInputStream(xlFile);
		Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(Sheet1);
		 int columscnt = sh.getRow(0).getLastCellNum();
		 System.out.println("columscnt="+columscnt);
		 return columscnt;
		
	}
	// data read
	public static String readDataFromExcel(String xlFile, String Sheet1, int rowsNum, int columsNum) throws EncryptedDocumentException, IOException
	{
		// workbook var
		FileInputStream fis = new FileInputStream(Sheet1);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet1);
		String Data = sh.getRow(rowNum).getCell(cellNum).toString();
		return Data;
		
	}
	
	
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
			String xlFile = "C:\\Users\\user\\eclipse-workspace\\MyMavenProjectFromCmd\\Book1wb.xlsx";
			int cnt = rowscnt(xlFile,"Sheet1");
			System.out.println("cnt="+cnt);
			
			cnt = getrowscnt(xlFile,"createusers");
			System.out.println("cnt="+cnt);
			
			int clmscnt = getcolumscnt(xlFile,"Sheet1");
			System.out.println("clmscnt="+clmscnt);
			
			clmscnt = getcolumscnt(xlFile, "createusers");
			System.out.println("clmscnt="+clmscnt);
			
			// Read Data 
			String data00 = readDataFromExcel(xlFile, "Sheet1", 0, 0);
			System.out.println("data00="+ data00);// data00=ProductName

			data00 = readDataFromExcel(xlFile, "Sheet1", 0, 1);
			System.out.println("data01="+ data00);// data01=Qty

			data00 = readDataFromExcel(xlFile, "Sheet1", 0, 2);
			System.out.println("data02="+ data00);// data02=Price

			data00 = readDataFromExcel(xlFile, "Sheet1", 1, 0);
			System.out.println("data10="+ data00);
			
}
private static int getrowscnt(String xlFile2, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

private static int getcolumscnt(String xlFile2, String string) {
		// TODO Auto-generated method stub
		return 0;
	}

//
//	private static  int  getcolumscnt(String xlFile, String string) {
//		return cellNum;
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static int getrowscnt(String xlFile, String string) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	public static int SheetExcit(String xlFile,String Sheet) throws IOException
//	{
//		FileInputStream fis = new FileInputStream(xlFile);
//		 Workbook wb = WorkbookFactory.create(xlFile);
//		 int indexno = wb.getSheetIndex(Sheet);
//		 
//		 System.out.println("For Sheet="+Sheet+ ",indexno="+indexno);
//		 if(indexno>=0)
//		 {
//			 System.out.println("Sheet="+Sheet+"is Exsit");
//		 }
//		 else
//		 {
//			 System.out.println("Sheet="+Sheet+"is not Exsit.please check excel file");
//		 }
//		return indexno;
//		
	//}
	
		
}