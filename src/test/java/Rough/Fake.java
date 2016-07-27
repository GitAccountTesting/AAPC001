package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fake {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.aapc.com/login.aspx?r=https://www.aapc.com/index.aspx");
		driver.findElement(By.id("ctl00_body_UserName")).sendKeys("harbans.lale@aapc.com");
		driver.findElement(By.id("ctl00_body_Password")).sendKeys("123456789");
		driver.findElement(By.id("ctl00_body_LoginButton")).click();
		
		
		
		/*driver.findElement(By.xpath("//*[@id='MyAAPCMenuItem']/a")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_MasterPageBodyTag']/div[1]/div/a")).click();
		driver.findElement(By.linkText("Membership")).click();*/
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='aspnetForm']/div[4]/div[4]/div[3]/div[3]/div/div[3]/ul/li[1]/a")));
		
		driver.findElement(By.cssSelector(".textual-link.pre-header-link-icd10>a")).click();
		driver.findElement(By.cssSelector(".textual-link.pre-header-link-blog>a")).click();
		driver.findElement(By.cssSelector(".textual-link.pre-header-link-forum>a")).click();
		driver.findElement(By.cssSelector(".forum.textual-link.pre-header-link-events>a")).click();
		driver.findElement(By.cssSelector(".contactus>a")).click();
		driver.findElement(By.cssSelector(".do-not-hide-search-box")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector(".cart>a>i")).click();
		driver.navigate().back();
		
/*		driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/div[4]/div[3]/div[3]/div/div[3]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/div[4]/div[3]/div[3]/div/div[3]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='aspnetForm']/div[4]/div[4]/div[3]/div[3]/div/div[3]/ul/li[4]/a")).click();
*/
	}

}
