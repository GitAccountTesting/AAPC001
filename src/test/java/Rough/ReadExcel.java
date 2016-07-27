package Rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	File f=new File("D:\\ram.xlsx");
	FileInputStream fi=new FileInputStream(f);
	Workbook workbook=WorkbookFactory.create(fi);
	Sheet sheet0=workbook.getSheetAt(0);
	/*Row row0=sheet0.getRow(0);
	Cell cellA=row0.getCell(0);
	System.out.println(cellA);*/
	
	for(Row row:sheet0 )
	{
		for(Cell cell:row)
		{
			switch(cell.getCellType())
			{
			case Cell.CELL_TYPE_STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				
				double value=cell.getNumericCellValue();
				String text=BigDecimal.valueOf(value).toPlainString().trim();
				System.out.println(text);
				break;
			case Cell.CELL_TYPE_BLANK:
				System.out.println("Blank Value");
				break;
			}
		}
	}
	fi.close();
}
}
