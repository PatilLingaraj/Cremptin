package com.cremptin.Login;

import org.testng.annotations.Listeners;
import com.cremptin.GenericLib.BaseTest;
import com.cremptin.GenericLib.FileLib;
import com.cremptin.GenericLib.WebDriverCommonLib;
import com.cremptin.pages.SignInPage;

@Listeners(com.cremptin.GenericLib.MyListeners.class)
public class ValidLogin extends BaseTest{

	public void validLoginTest() throws Throwable {
		
		//Open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
		FileLib flib=new FileLib();
		//Login to App
		SignInPage lp=new SignInPage();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), 
				flib.readPropertyData(PROP_PATH, "password"));
		//Verify Home Page is Displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"Home Page");
	}
}
