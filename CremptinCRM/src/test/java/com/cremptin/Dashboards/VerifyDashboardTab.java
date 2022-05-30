package com.cremptin.Dashboards;

import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.Login.ValidLogin;
import com.cremptin.pages.HomePage;

public class VerifyDashboardTab extends BaseTest{
	
	@Test
	public void verifyDashboardTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Dashboard TAb
		HomePage hp=new HomePage();
		hp.clickDashboardTab();
}
}
