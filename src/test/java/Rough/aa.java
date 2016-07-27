package Rough;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aa {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.aapc.com/loginasmember/");
	WebDriverWait wait=new WebDriverWait(driver, 10l);
	Actions action=new Actions(driver);
	WebElement store =driver.findElement(By.linkText("Store"));
	  WebElement books2016=driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/div[3]/div[3]/div[5]/ul/li[6]/div/ul[1]/li/ul/li[2]/a"));
	/*  List<WebElement>webelements=new ArrayList<WebElement>();
	  webelements.add(store);
	  webelements.add(books2016);
	wait.until(ExpectedConditions.visibilityOfAllElements(webelements));
  */
	
	//wait.until(ExpectedConditions.visibilityOf(books2016));
	action.moveToElement(store).moveToElement(books2016).perform();;
}
}
