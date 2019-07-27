package com.abc.mainpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Logout;

public class MagentoTest {

	@Test
	public void magentoTest() {

		WebDriver chrome = new FirefoxDriver();

		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String url = "http://www.magento.com";
		chrome.get(url);

		Home home = new Home(chrome);
		home.clickOnMyAccount();

		Login login = new Login(chrome);
		login.typeEmail("nitinmanjunath1991@gmail.com");
		login.typePassword("Welcome123");
		login.clickOnLogin();

		Logout logout = new Logout(chrome);
		logout.clickOnLogout();

		chrome.quit();

	}

}
