/*package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Page;

//public class LandingPage extends Page {
	
	


	//public LandingPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Actions action=new Actions(driver);// Why i can't put this line in Page class so that i have not to put in all classes.
	
	public Membership gotoProfile() throws IOException
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".login.active.last>a")));
		driver.findElement(By.xpath(OR.getProperty("MyAAPC"))).click();
		//AllLinks();
		driver.findElement(By.xpath(OR.getProperty("ClosePopup"))).click();
		//logMessage("2.Go To profile is working fine");
		return new Membership();
	}
	
	//public WebElement gotoMenu(String Menu) throws IOException
	{
	//	WebElement menu = driver.findElement(By.linkText(Menu));
		
		return menu;
	}
	
	public LandingPage MECNRSLinks() throws IOException
	{
		
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Membership")))).perform();
		driver.findElement(By.linkText(OR.getProperty("Membership"))).click();
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Education")))).perform();
		driver.findElement(By.linkText(OR.getProperty("Education"))).click();
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Certification")))).perform();
		driver.findElement(By.linkText(OR.getProperty("Certification"))).click();
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Networking")))).perform();
		driver.findElement(By.linkText(OR.getProperty("Networking"))).click();
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Resources")))).perform();
		driver.findElement(By.linkText(OR.getProperty("Resources"))).click();
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Store")))).perform();
		driver.findElement(By.linkText(OR.getProperty("Store"))).click();
		driver.findElement(By.id(OR.getProperty("Logo"))).click();
		//logMessage("3. MECNRSLinks is working fine");
		//AllLinks();
		return this;
	}
	
	public LandingPage IBFEPSCLinks() throws InterruptedException, IOException
	{	 	 	
		driver.findElement(By.cssSelector(((OR.getProperty("ICD-10"))))).click();
		driver.findElement(By.cssSelector((OR.getProperty("Blog")))).click();
		driver.findElement(By.cssSelector((OR.getProperty("Forum")))).click();
		driver.findElement(By.cssSelector((OR.getProperty("Events")))).click();
		driver.findElement(By.cssSelector((OR.getProperty("ContactUs")))).click();
		driver.findElement(By.cssSelector((OR.getProperty("Search")))).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector((OR.getProperty("Cart")))).click();
		driver.navigate().back();
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Membership")))).perform();
		//logMessage("IBFEPSCLinks method is working fine");
		System.out.println("JAI SHIRI RAM");
		
		
		driver.quit();
		//logMessage("ibfp is working");
		return this;
		
	}
	
	//public Membership gotoMembership() throws IOException
	{
		action.moveToElement(driver.findElement(By.linkText(OR.getProperty("Membership")))).perform();
		driver.findElement(By.linkText(OR.getProperty("Membership"))).click();
		//return new Membership();
	}


}


*/