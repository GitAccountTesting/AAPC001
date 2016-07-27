package Rough;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadString {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\FileRecordsOfSuccessfulMethods.txt");
		FileReader fr=new FileReader(file);
		BufferedReader Br=new  BufferedReader(fr);
		String line=null;
		while ((line=Br.readLine())!= null) 
{
		System.out.println(line);
			
		}
		
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet0=workbook.createSheet("FirstSheet");
	Row row0=sheet0.createRow(0);
	Cell cellA=row0.createCell(0);
	Cell cellB=row0.createCell(1);
	cellA.setCellValue("First Cell");
	cellB.setCellValue("Second value");
	File file1=new File("D:\\ram.xlsx");
	FileOutputStream fos=new FileOutputStream(file1);
	workbook.write(fos);
	 
	}

}
