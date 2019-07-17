package AmazonAdToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AddToCart.AddinitemstoCart;
import Helper.BrowserFactory;
import LoginPage.LoginPageNew;
import ShopByCategory.AmazonCategory;
import VerifyHomePage.Verifyvaldid;

public class verifyshopbycategory {
	
	@Test
	public void ShopByCategory()
	{
		
		WebDriver driver=BrowserFactory.startBrowser("chrome", "http://www.amazon.in");
		
		AmazonCategory by_category= PageFactory.initElements(driver, AmazonCategory.class);
		by_category.ShopByCategory();
		
	}

}
