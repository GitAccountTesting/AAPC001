package Rough;

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

public class LandingPage extends Page {
	
	

	Actions action=new Actions(driver);// Why i can't put this line in Page class so that i have not to put in all classes.
	public WebElement gotoMenu(String Menu) throws IOException
	{
		WebElement menu = driver.findElement(By.linkText(Menu));
		
		return menu;
	}
	public WebElement gotoMenuByXpath(String Menu) throws IOException
	{
		WebElement menu = driver.findElement(By.xpath(Menu));
		
		return menu;
	}
	public LandingPage gotoMouseOver(String Menu) throws IOException
	{
		WebElement webelement=driver.findElement(By.linkText(Menu));
		action.moveToElement(webelement).perform();;
		return this;
	}
	
	
}


