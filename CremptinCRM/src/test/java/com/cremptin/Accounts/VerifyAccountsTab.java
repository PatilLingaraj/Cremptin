package com.cremptin.Accounts;

import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.GenericLib.WebDriverCommonLib;
import com.cremptin.Login.ValidLogin;
import com.cremptin.pages.AccountsPage;
import com.cremptin.pages.HomePage;

public class VerifyAccountsTab extends BaseTest{

	@Test
	public void verifyAccountsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Accounts TAb
		HomePage hp=new HomePage();
		hp.clickAccountsTab();
		
		//verify accounts text is displayed
		AccountsPage ap=new AccountsPage();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(ap.getAccountsTextAddress(),
				"Accounts Text");
		
		
		
	}
	
	
}
