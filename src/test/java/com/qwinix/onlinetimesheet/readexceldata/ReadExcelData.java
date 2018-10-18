package com.qwinix.onlinetimesheet.readexceldata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		//Specify ExcelSheet Path
		File testData = new File("./ReadExcel/mystoreexcel.xlsx"); 
		FileInputStream fis = new FileInputStream(testData);
		
		//XSSF will load the entire ExcelSheet
		XSSFWorkbook data = new XSSFWorkbook(fis);
		
		//here it will read values from ExcelSheet 
		XSSFSheet sheet1 =  data.getSheetAt(0);// here At index refers at which index the sheet is located.Its loaded the specific Sheet
		
		//here which specifies which row and column is using
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is" + data0);
	}

}
