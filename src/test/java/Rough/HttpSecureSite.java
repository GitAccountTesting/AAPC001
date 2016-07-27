package Rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HttpSecureSite {
	public static void main(String[] args) {
		FirefoxProfile fp=new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		WebDriver driver= new FirefoxDriver(fp);
		driver.get("https://www.aapc.com");
	}

}
