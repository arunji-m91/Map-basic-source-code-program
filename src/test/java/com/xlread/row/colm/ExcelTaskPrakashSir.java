package com.xlread.row.colm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTaskPrakashSir {
	
	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir")+"\\Test\\AdaptinOrderTask.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("AdaptinTestData");
		Map<String,String> col = new LinkedHashMap<String,String>();
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			Cell cell = sheet.getRow(i).getCell(0);
			String keyString = cell.toString();
			Cell cell2 = sheet.getRow(i).getCell(1);
			String valueString = cell2.toString();
			col.put(keyString, valueString);
		}
		Set<Entry<String,String>> entrySet = col.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		//System.out.println(entry);
		}
	}

}
