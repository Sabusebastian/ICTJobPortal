package com.LiveTest.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	static XSSFWorkbook Workbook;
	static XSSFSheet Worksheet;
	
	public static String getValues(int RowNum, int ColNum,String ExcelPath, int SheetNum) throws IOException
	{
		FileInputStream Excel=new FileInputStream(ExcelPath);
		Workbook=new XSSFWorkbook(Excel);
		Worksheet=Workbook.getSheetAt(SheetNum);
		
		return Worksheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
		
	}
	
}
