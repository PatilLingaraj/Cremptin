package com.cremptin.Products;

import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.Login.ValidLogin;
import com.cremptin.pages.HomePage;

public class VerifyProductsTab extends BaseTest{

	@Test
	public void verifyProductsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Products TAb
		HomePage hp=new HomePage();
		hp.clickProductsTab();
	}
}
