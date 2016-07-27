package Rough;
import Rough.DabeerExcel;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.math.BigDecimal;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;


	public class DabeerExcel 
	{

		//public static String path="D:\\ecclipse\\Guru99Test\\GURU99_DATA.xlsx";
		
		public static File file=null;
		public static FileInputStream fis=null;
		public static XSSFWorkbook book=null;
		public static XSSFSheet sheet= null;
		public static int row;
		public static int cell;
		public String data=null;
		
		
		public DabeerExcel(String path) throws Exception
		{
			file = new File(path);
			fis= new FileInputStream(file);
			book= new XSSFWorkbook(fis);
		}
		
		public String read_Login(String name, int row, int cell)
		{
			sheet= book.getSheet(name);
			data=sheet.getRow(row).getCell(cell).getStringCellValue();
	       /*row=sheet.getPhysicalNumberOfRows();
			cell= sheet.getRow(row).getPhysicalNumberOfCells();*/
			return data;
		}
		
		public int get_Row(int sheetnumber)
		{
			sheet= book.getSheetAt(sheetnumber);
			 row=sheet.getPhysicalNumberOfRows();
	       /*row=sheet.getPhysicalNumberOfRows();
			cell= sheet.getRow(row).getPhysicalNumberOfCells();*/
			return row;
		}
		public int get_Cell(int sheetnumber)
		{
			sheet= book.getSheetAt(sheetnumber);
			cell=sheet.getRow(0).getPhysicalNumberOfCells();
	       /*row=sheet.getPhysicalNumberOfRows();
			cell= sheet.getRow(row).getPhysicalNumberOfCells();*/
			return cell;
		}
		public String alphaNumeric(int sheetnumber,int rows, int cols)
		{
			sheet= book.getSheetAt(sheetnumber);
		
			
			if(sheet.getRow(rows).getCell(cols).getCellType()==Cell.CELL_TYPE_STRING)
			{
			
				data=sheet.getRow(rows).getCell(cols).getStringCellValue();
				
			}
			else if(sheet.getRow(rows).getCell(cols).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				  double d=sheet.getRow(rows).getCell(cols).getNumericCellValue();
				
				   data= BigDecimal.valueOf(d).toPlainString().trim();
			}
			return data;
		}
		
		public static void  screenshot(WebDriver driver,String status) throws Exception
		{
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./ScreenShot/" + status +".png"));
		}
		
	}


