package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver chrome;
	By myAccount = By.linkText("My Account");
	
	public Home(WebDriver chrome) {
		this.chrome = chrome;
	}



	public void clickOnMyAccount() 
	{
		chrome.findElement(myAccount).click();
	}
	

}
