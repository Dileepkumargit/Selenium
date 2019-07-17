package AmazonAdToCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AddToCart.AddinitemstoCart;
import Helper.BrowserFactory;

public class ItemsAddToCart {
	
	@Test
	public void adtocart() throws InterruptedException
	{
        WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.amazon.in");
		
        AddinitemstoCart addto_cart= PageFactory.initElements(driver, AddinitemstoCart.class);
        addto_cart.AmazonAddtocart("shirts");
        addto_cart.AmazonAddtocart("jeens");
        //addto_cart.AmazonAddtocart("mobiles");
        driver.close();
		
	}
	

}
