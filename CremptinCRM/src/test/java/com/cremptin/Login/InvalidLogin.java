package com.cremptin.Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.GenericLib.FileLib;
import com.cremptin.pages.SignInPage;

@Listeners(com.cremptin.GenericLib.MyListeners.class)
public class InvalidLogin extends BaseTest{

	@Test
	public void validLoginTest() throws Throwable {
		
		//Open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
		FileLib flib=new FileLib();
		//Login to App
		SignInPage lp=new SignInPage();
		
		for(int i=0;i<=5;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			String password = flib.readExcelData(EXCEL_PATH, "Invalid", i, 1);
			lp.login(username, password);
			
		}
		
		//Verify Home Page is Displayed
//		WebDriverCommonLib wlib=new WebDriverCommonLib();
//		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
//		wlib.verify(wlib.getPageTitle(),
//				flib.readPropertyData(PROP_PATH, "homeTitle"),
//				"Home Page");
	}
}
