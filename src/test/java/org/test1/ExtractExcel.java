package org.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExtractExcel {
public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\jegan\\eclipse-workspace\\MavenSample\\Excel\\Book1.xlsx");
	FileInputStream stream=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Siva");
	Row r = s.getRow(4);
	Cell c = r.getCell(1);
	String st = c.getStringCellValue();
	if(st.equals("Excel 2010")) {
		c.setCellValue("Computer");
	}
	FileOutputStream o=new FileOutputStream(loc);
	w.write(o);
	System.out.println("Wrote Succesfully");
	
}
}
