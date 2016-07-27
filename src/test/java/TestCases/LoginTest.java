package TestCases;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;

import Pages.PurhaseMedicalBook;
import Utility.CommonUtility;

public class LoginTest {

	@Test(priority = 0, dataProvider = "getLoginSheetdata")
	public void LoginPageTest(String ExcelUsername, String ExcelPassword)
			throws IOException, AddressException, MessagingException, InterruptedException {
		HomePage home = new HomePage();

		/*
		 * System.out.println(ExcelUsername + " " + ExcelPassword);
		 * home.doLogin(ExcelUsername, ExcelPassword); //home.HomePageLinks();
		 * home.HomelinksByCSS();
		 */
		home.doLogin(ExcelUsername, ExcelPassword).HomelinksByCSS();
		home.goToMembership().mouseoverMembership();
		PurhaseMedicalBook obj = new PurhaseMedicalBook();
		obj.purchasebook();
	}

	@DataProvider
	public Object[][] getLoginSheetdata() {
		return CommonUtility.getData("LoginTestSheet");
	}
}

/*
 * 
 * 
 * USE LESS CODE
 * 
 * @Test( dataProvider="LoginTestSheet") public void clickLoginLinksTest(String
 * ExcelLink1,String ExcelLink2) throws InterruptedException, IOException {
 * 
 * lp.gotoMouseOver(ExcelLink1); lp.gotoMenu(ExcelLink1).click();
 * lp.gotoMouseOver(ExcelLink1).gotoMenu(ExcelLink2).click();
 * System.out.println(ExcelLink1+" "+ExcelLink2); }
 * lp.gotoMouseOver("Membership").gotoMouseOver("Renew");
 * lp.gotoMenu("Renew").click(); lp.gotoMouseOver("Membership").gotoMouseOver(
 * "Membership Benefits"); lp.gotoMenu("Membership Benefits").click();
 * lp.gotoMouseOver("Membership").gotoMouseOver("Membership Savings");
 * lp.gotoMenu("Membership Savings").click(); lp.gotoMouseOver("Education");
 * lp.gotoMouseOver("Education").gotoMenuByXpath(
 * "//*[@id='aspnetForm']/div[3]/div[3]/div[3]/div[3]/div/div[5]/ul/li[2]/div/ul[1]/li/a"
 * ).click(); lp.gotoMouseOver("Education").gotoMenu("Medical Coding").click();
 * lp.gotoMouseOver("Education").gotoMenu("Medical Billing").click();
 * lp.gotoMouseOver("Education").gotoMenu("Auditing").click();
 * lp.gotoMouseOver("Education").gotoMenu("Medical Documentation").click();
 * lp.gotoMouseOver("Education").gotoMenu("Compliance").click();
 * lp.gotoMouseOver("Education").gotoMenu("Exam Preparation").click();
 * lp.gotoMouseOver("Education").gotoMenu("CPC Exam Training").click();
 * lp.gotoMouseOver("Education").gotoMenu("CIC Exam Training").click();
 * lp.gotoMouseOver("Education").gotoMenu("CRC Exam Training").click();
 * lp.gotoMouseOver("Education").gotoMenu("CPB Exam Training").click();
 * lp.gotoMouseOver("Education").gotoMenu("CPMA Exam Training").click();
 * lp.gotoMouseOver("Education").gotoMenu("CPCO Exam Training").click();
 * lp.gotoMouseOver("Education").gotoMenu("CPPM Exam Training").click();
 * lp.gotoMouseOver("Education").gotoMenu("CPC Virtual Review Course").click();
 * lp.gotoMouseOver("Education").gotoMenu("Other Courses").click();
 * lp.gotoMouseOver("Education").gotoMenu("CEUs").click();
 * lp.gotoMouseOver("Education").gotoMenu("Webinars").click();
 * lp.gotoMouseOver("Education").gotoMenu("Conferences").click();
 * lp.gotoMouseOver("Education").gotoMenu("Courses").click();
 * lp.gotoMouseOver("Education").gotoMenu("Local Chapters").click();
 * lp.gotoMouseOver("Education").gotoMenuByXpath(
 * "//*[@id='aspnetForm']/div[3]/div[3]/div[3]/div[3]/div/div[5]/ul/li[2]/div/ul[3]/li/ul/li[7]/a"
 * ).click(); lp.gotoMouseOver("Education").gotoMenu("CEU Tracker").click();
 * lp.gotoMouseOver("Education").gotoMenuByXpath("//a[@title='CEU Vendors']"
 * ).click(); lp.gotoMouseOver("Education").gotoMenu("Exam Preparation"
 * ).click(); lp.gotoMouseOver("Education").gotoMenu("ICD-10").click();
 * lp.gotoMouseOver("Education").gotoMenu("Risk Adjustment / HCC").click();
 * lp.gotoMouseOver("Education").gotoMenu("Evaluation & Management (E/M)"
 * ).click(); lp.gotoMouseOver("Education").gotoMenu("Anatomy").click();
 * lp.gotoMouseOver("Education").gotoMenu("Medical Terminology").click();
 * lp.gotoMouseOver("Education").gotoMenu("VIEW ALL TOPICS").click();
 * 
 * 
 * //From here i have to start again
 * 
 * 
 * lp.gotoMouseOver("Education").gotoMenu("Educational Partnership").click();
 * lp.gotoMouseOver("Education").gotoMenu("Schools").click();
 * lp.gotoMouseOver("Education").gotoMenu("Businesses").click();
 * lp.gotoMouseOver("Education").gotoMenu("Individuals").click();
 * lp.gotoMouseOver("Education").gotoMenu("Become a Certified Instructor"
 * ).click();
 * 
 * 
 * 
 * 
 * //System.out.println(username+" "+pass);
 */
