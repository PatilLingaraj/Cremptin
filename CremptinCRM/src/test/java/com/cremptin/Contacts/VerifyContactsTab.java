package com.cremptin.Contacts;

import org.testng.annotations.Test;

import com.cremptin.GenericLib.BaseTest;
import com.cremptin.GenericLib.WebDriverCommonLib;
import com.cremptin.Login.ValidLogin;
import com.cremptin.pages.ContactsPage;
import com.cremptin.pages.HomePage;

public class VerifyContactsTab extends BaseTest{

	@Test
	public void verifyContactsTabTest() throws Throwable {
		//login to app and verify home page
		ValidLogin vl=new ValidLogin();
		vl.validLoginTest();
		
		//Click on Contacts TAb
		HomePage hp=new HomePage();
		hp.clickContactsTab();
		
		//verify contacts text
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		ContactsPage cp=new ContactsPage();
		wlib.elementDisplayed(cp.getContactsTextAddress(), "Contacts Text");
	}
}
