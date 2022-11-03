package com.xlread.row.colm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask {

	public Map<String, LinkedHashMap<Integer,String>> getColValue(String fileName, String sheetName) throws IOException {
		Map<String, LinkedHashMap<Integer,String>> a = new LinkedHashMap<String,LinkedHashMap<Integer,String>>();
		LinkedHashMap<Integer,String> hashMap = new LinkedHashMap<Integer,String>();
		File file = new File(System.getProperty("user.dir") + "\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(0);
		int k=1;
		for(int i=0;i<row.getPhysicalNumberOfCells();i++) {
			
			Cell cell = row.getCell(i);
			String string = cell.toString();
			
			for(int j=1;j<sheet.getPhysicalNumberOfRows();j++) {
				
			String string2 = String.valueOf(sheet.getRow(j).getCell(i));
			//System.out.println(string2);
			if(k<sheet.getPhysicalNumberOfRows()) {
			hashMap.put(i,string2);
k++;
			}
			//System.out.println(hashMap);
			a.put(string,hashMap);

			
			}
			
		}
		return a;	
	}

	public static void main(String[] args) throws IOException {
		
		
		ExcelTask excelTask = new ExcelTask();
	Map<String, LinkedHashMap<Integer, String>> colValue = excelTask.getColValue("Test\\AdaptinOrderTask", "AdaptinTestData");
		System.out.println(colValue);

	}

}
