package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Page;

public class Membership extends Page {
	
	Actions action=new Actions(driver);
	
public void mouseoverMembership()
{
	WebElement element=driver.findElement(By.linkText("Education"));
	action.moveToElement(element).perform();;
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
