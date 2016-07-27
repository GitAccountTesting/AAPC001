package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utility.CommonUtility;
import base.Page;

public class LandingPage extends Page {
	
	
	public void HomelinksByCSS() {
		CommonUtility.FindAllLinksText(".nav.navbar-nav.navbar-right");
	}
	
}


