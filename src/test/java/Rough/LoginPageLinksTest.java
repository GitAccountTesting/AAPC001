package Rough;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LandingPage;
import Utility.CommonUtility;
import base.Page;

public class LoginPageLinksTest {
	HomePage home;
	LandingPage lp;
	@Test(dataProvider="getLinksSheetdata")
	public void doLoginTest(String ExcelLink1,String ExcelLink2) throws IOException
	{   lp=new LandingPage();
		System.out.println(ExcelLink1+""+ExcelLink2);
	/*	lp.gotoMouseOver(ExcelLink1);
		lp.gotoMenu(ExcelLink1).click();
		lp.gotoMouseOver(ExcelLink1).gotoMenu(ExcelLink2).click();*/
		
	}
	@DataProvider
	public static Object[][] getLinksSheetdata()
	{
		return CommonUtility.getData("LinksTestSheet");
	}
}
