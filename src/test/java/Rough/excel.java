package Rough;

import Utility.ExcelReader;

public class excel {
	public static ExcelReader excel=new ExcelReader("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\src\\test\\resources\\properties\\AAPCTestData.xlsx");
	
	public static void main(String[] args) {
		
		getData();
		
	
	}
	public static void getData()
	{
		
		int rows=excel.getRowCount("LoginTest");
		int columns=excel.getColumnCount("LoginTest");
		System.out.println(rows);
		System.out.println(columns);
	     Object[][] data=new Object[rows-1][columns];
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				data[i-2][j]=excel.getCellData("LoginTest", j, i);
				
				System.out.print(data[i-2][j]+" ");
			}
			System.out.println("");
		}
		
	//	Object[][] data=new Object
		
		
		
		//return data[][];
	}

}
