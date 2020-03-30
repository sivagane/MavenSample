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

public class WriteExcel {
public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\jegan\\eclipse-workspace\\MavenSample\\Excel\\Siva.xlsx");
	FileOutputStream o=new FileOutputStream(loc);
	Workbook w=new XSSFWorkbook();
    Sheet s = w.createSheet("Siva");
    Row r = s.createRow(4);
    Cell c = r.createCell(2);
    c.setCellValue("Write");
    
    w.write(o);
    System.out.println("Wrote Successfully");
    
}
}
