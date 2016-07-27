package Rough;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksByLoop {

	public static List<WebElement> listoflinks;
	public static WebDriver driver = new FirefoxDriver();
	
	public static WebElement getElementwithIndex(By by, int index)
	{
		listoflinks = driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right")).findElements(By.tagName("a"));
          return listoflinks.get(index);
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.aapc.com/");
		listoflinks = driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right")).findElements(By.tagName("a"));
		int linkcount = listoflinks.size();
		System.out.println(linkcount);
		

		for (WebElement linkelement : listoflinks) {

			String linktext = linkelement.getText();
			

			if (!(linktext.isEmpty())) {
				System.out.println(linktext);
			
			
          linkelement.click();
          driver.navigate().back();
			
		listoflinks = driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right")).findElements(By.tagName("a"));
			}
		/*
		for(int i=0;i<linkcount;i++)
		{
			WebElement abc=listoflinks.get(i);
			abc.click();
			//System.out.println("jahdh"+listoflinks.get(i+1).getText());
			driver.navigate().back();
			//listoflinks = driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right")).findElements(By.tagName("a"));

		}*/
		/*for(int i=0;i<linkcount;i++)
		{
			getElementwithIndex(By.tagName("a"), i).click();
			driver.navigate().back();
		}*/

	}
}
}
