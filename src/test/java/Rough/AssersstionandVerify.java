package Rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssersstionandVerify {
	public static void main(String[] args) {
		String ExpectedResult="Medical Coding - Medical Billing - Medical Auditing - AAPC";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.aapc.com");
		String str= driver.getTitle();
		System.out.println(str);
		Assert.assertEquals(str, ExpectedResult);
		
		System.out.println("everything is fine");
		driver.manage().deleteAllCookies();
	}

}
