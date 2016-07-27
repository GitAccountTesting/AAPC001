package Pages;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.CommonUtility;
import base.Page;

public class HomePage extends Page {

	public LandingPage doLogin(String username, String password) throws IOException {
		driver.findElement(By.id(OR.getProperty("username"))).sendKeys(username);
		driver.findElement(By.id(OR.getProperty("password"))).sendKeys(password);
		driver.findElement(By.id(OR.getProperty("loginbutton"))).click();

	return new LandingPage();
	}

	

	
	public Membership goToMembership()
	{
		driver.findElement(By.linkText("Membership"));
		return new Membership();
	}
}















/*
 * public void HomePageLinks() { CommonUtility obj = new CommonUtility();
 * CommonUtility.ClickByLink("Membership").click();
 * CommonUtility.ClickByLink("Education").click();
 * CommonUtility.ClickByLink("Certification").click();
 * CommonUtility.ClickByLink("Networking").click();
 * CommonUtility.ClickByLink("Resources").click();
 * CommonUtility.ClickByLink("Store").click();
 * CommonUtility.ClickByLink("ICD-10").click();
 * CommonUtility.ClickByLink("Blog").click();
 * CommonUtility.ClickByLink("Forum").click();
 * CommonUtility.ClickByLink("Events").click(); CommonUtility.ClickByLink(
 * "Contact Us").click();
 * CommonUtility.ClickByCSS(".do-not-hide-search-box>i").click();
 * CommonUtility.ClickByCSS(".cart>a>i").click();
 * 
 * }
 */
