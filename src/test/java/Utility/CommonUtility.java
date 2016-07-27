package Utility;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import Rough.excel;
import base.Page;

public class CommonUtility extends Page{

Actions action=new Actions(driver);
public void movetoElementbyLinkText(String Element1, String Element2)
{
	
	  WebElement store =driver.findElement(By.linkText(Element1));
	  WebElement books2016=driver.findElement(By.linkText(Element2));
		action.moveToElement(store).moveToElement(books2016);
		
}
	public static Object[][]  getData(String sheetname)
	{
		
		int rows=excel.getRowCount(sheetname);
		int columns=excel.getColumnCount(sheetname);
		System.out.println(rows);
		System.out.println(columns);
	     Object[][] data=new Object[rows-1][columns];
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				data[i-2][j]=excel.getCellData(sheetname, j, i);
				
			}
			//System.out.println("");
		}
		return data;
	}
	public static WebElement ClickByLink(String Link)
	{
		WebElement linkElement=Page.driver.findElement(By.linkText(Link));
		return linkElement;
	}
	public static WebElement ClickByXpath(String xpath)
	{
		WebElement linkElement=Page.driver.findElement(By.xpath(xpath));
		return linkElement;
	}
	public static WebElement ClickByCSS(String CSS)
	{
		WebElement linkElement=Page.driver.findElement(By.cssSelector(CSS));
		return linkElement;
	}
	
	public static void FindAllLinksText(String CSSLink)
	{
	List<WebElement> listoflinks=driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right")).findElements(By.tagName("a"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://www.aapc.com/");
	listoflinks = driver.findElement(By.cssSelector(CSSLink)).findElements(By.tagName("a"));
	int linkcount = listoflinks.size();
	System.out.println(linkcount);

	for (WebElement linkelement : listoflinks) {

		String linktext = linkelement.getText();
		

		if (!(linktext.isEmpty())) {
			System.out.println(linktext);
		}
		
      
	}
	for(int i=0;i<linkcount;i++)
	{
		WebElement abc=listoflinks.get(i);
		String linktext=listoflinks.get(i).getText();
		if(linktext=="Blog")
		{
			abc=listoflinks.get(i+1);
		}
	
		abc.click();
		driver.navigate().back();
		listoflinks = driver.findElement(By.cssSelector(CSSLink)).findElements(By.tagName("a"));

	}
	
	}
}

