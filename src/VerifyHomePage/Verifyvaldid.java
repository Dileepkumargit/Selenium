package VerifyHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import LoginPage.LoginPageNew;

public class Verifyvaldid {
	
	@Test
	public void checkvalidid()
	{
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.amazon.in/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&switch_account=");
		
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		login_page.LoginAmazon("thupatidileep@gmail.com", "dileep335");
		driver.quit();
	}

}
