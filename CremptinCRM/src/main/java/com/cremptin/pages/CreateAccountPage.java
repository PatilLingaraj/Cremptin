package com.cremptin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cremptin.GenericLib.BaseTest;

public class CreateAccountPage {

	@FindBy(xpath = "//img[@title='Account Name Lookup']")
	 private WebElement accountNameButton;
	
	public CreateAccountPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickAccountNameButton()
	{
		accountNameButton.click();
	}
	
	
	
	
	
	
}
