package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelHandle
{
    File excelfile= new File("D:\\Configuration\\Spreadsheets\\test.xlsx");
    @Test
	public void ReadExceldata() throws Exception
	{
		FileInputStream fis= new FileInputStream(excelfile);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("First");
		int totalrows=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<totalrows;i++)
		{
			int totalcols=sheet.getRow(i).getPhysicalNumberOfCells();
			for(int j=0;j<totalcols;j++)
			{
				String rowdata= sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(rowdata);
			}
		}
		wb.close();
	}
	
	@Test
	public void WriteExceldata() throws Exception
	{
		FileInputStream fis= new FileInputStream(excelfile);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Second");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue("test");
		int totalrows=sheet.getPhysicalNumberOfRows();
		System.out.println(totalrows);
		FileOutputStream fos= new FileOutputStream(excelfile);
		wb.write(fos);
	    wb.close();
	}
}
