package com.cremptin.Activities;

import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.Login.ValidLogin;
import com.cremptin.pages.HomePage;

public class VerifyActivitiesTab extends BaseTest{

	@Test
	public void verifyActivitesTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Accounts TAb
		HomePage hp=new HomePage();
		hp.clickActivitiesTab();
		
		
		
}
}
