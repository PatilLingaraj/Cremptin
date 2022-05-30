package com.cremptin.Campaigns;

import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.Login.ValidLogin;
import com.cremptin.pages.HomePage;

public class VerifyCampaignsTab extends BaseTest{

	@Test
	public void verifyCampaignsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on campaigns TAb
		HomePage hp=new HomePage();
		hp.clickCampaignsTab();
		
	}
}
