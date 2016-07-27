package Pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

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

import Utility.TestConfig;
import Utility.monitoringMail;
import base.Page;

public class PurhaseMedicalBook extends Page {
	Actions action=new Actions(driver);
public void purchasebook() throws AddressException, MessagingException, InterruptedException
{
	
	Actions action=new Actions(driver);

	WebDriverWait wait=new WebDriverWait(driver, 20l);
	WebElement store =driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right.desktop-menu>li>a[title='Book Store']"));

	  List<WebElement>webelements=new ArrayList<WebElement>();
	  webelements.add(store);
	  
	wait.until(ExpectedConditions.visibilityOfAllElements(webelements));
  
	action.moveToElement(store).perform();
	driver.findElement(By.linkText("2016 Coding Books")).click();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	driver.findElement(By.xpath("//*[@id='tab2016']/div[1]/div[1]/div/div[2]/div[2]/a/span")).click();
	
	js.executeScript("window.scrollBy(0,200)");
	driver.findElement(By.xpath(".//*[@id='ctl00_Body_ucBookPanel_aAddtoCart']")).click();
	Thread.sleep(10000);
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(scrfile, new File("d:\\TransactionSnapshot\\first.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	monitoringMail mail=new monitoringMail();
	mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName, TestConfig.reportPath);
	
	
	
	
	
	
	
	/*WebDriverWait wait=new WebDriverWait(driver, 20l);
	WebElement store =driver.findElement(By.cssSelector(".nav.navbar-nav.navbar-right.desktop-menu>li>a[title='Book Store']"));

	  List<WebElement>webelements=new ArrayList<WebElement>();
	  webelements.add(store);
	  
	wait.until(ExpectedConditions.visibilityOfAllElements(webelements));
  
	action.moveToElement(store).perform();
	driver.findElement(By.linkText("2016 Coding Books")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)");
	driver.findElement(By.cssSelector("#ctl00_Body_ctl00_thmBundleItem']")).click();
	driver.findElement(By.cssSelector("#ctl00_Body_ucBookPanel_aAddtoCart")).click();
	driver.findElement(By.id("ctl00_body_btnContinue_input")).click();
	monitoringMail mail=new monitoringMail();
	mail.sendMail(TestConfig.server, TestConfig.from,TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(scrfile, new File("d:\\TransactionSnapshot\\first.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/

}
}
