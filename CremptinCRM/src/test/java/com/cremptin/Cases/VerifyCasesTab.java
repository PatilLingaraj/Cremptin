package com.cremptin.Cases;

import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.Login.ValidLogin;
import com.cremptin.pages.HomePage;

public class VerifyCasesTab extends BaseTest{

	@Test
	public void verifyCasesTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Cases TAb
		HomePage hp=new HomePage();
		hp.clickCasesTab();
		
	}
}
