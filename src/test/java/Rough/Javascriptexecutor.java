package Rough;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.ScreenshotListener;

public class Javascriptexecutor {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
	driver.get("https://www.aapc.com");
		Actions action=new Actions(driver);
		
			WebDriverWait wait=new WebDriverWait(driver, 10l);
			WebElement store =driver.findElement(By.linkText("Store"));

			  List<WebElement>webelements=new ArrayList<WebElement>();
			  webelements.add(store);
			  
			wait.until(ExpectedConditions.visibilityOfAllElements(webelements));
		  
			action.moveToElement(store).perform();
			driver.findElement(By.linkText("2016 Coding Books")).click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1200)");
			driver.findElement(By.xpath("//a[@href='icd-10-books.aspx#tab2016']")).click();
			driver.findElement(By.id("ctl00_Body_ctl01_aAddtoCart")).click();
			driver.findElement(By.id("ctl00_body_btnContinue_input")).click();
			Thread.sleep(20000);
			File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrfile, new File("d:\\TransactionSnapshot\\Second.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


