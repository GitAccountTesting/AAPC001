package Rough;

import java.io.IOException;

public class MyExcelRead {
	
	
	public static void main(String[] args) throws IOException {
		
		MyExcelReaderFILE excel=new MyExcelReaderFILE("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\target\\test-classes\\properties\\TestData.xlsx");

        System.out.println(excel.getRowCount("Logintest"));
        System.out.println(excel.getColumnCount(("Logintest")));
        int rows=excel.getRowCount("Logintest");
		int columns=excel.getColumnCount("Logintest");
		System.out.println(rows);
		System.out.println(columns);
	     Object[][] data=new Object[rows-1][columns];
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				data[i-2][j]=excel.getCellData("Logintest", j, i);
				System.out.println(data[i-2][j]);
			}
			//System.out.println("");
		}
        
}

}
