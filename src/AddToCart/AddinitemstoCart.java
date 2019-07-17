package AddToCart;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddinitemstoCart {
	
	WebDriver driver;
	
	public AddinitemstoCart(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id ="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(css="input[type='submit']")
	WebElement clcik;
	
	@FindBy(xpath="//li[@id='result_1']")
	WebElement item;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	public void AmazonAddtocart(String itemName) throws InterruptedException
	{
		search.sendKeys(itemName);
		clcik.click();
		Facets facet1 = new Facets(driver);
		List<String> ABrands= facet1.getBrands();
		System.out.println(ABrands.toString());
    	String facet = ABrands.get(new Random().ints(0,ABrands.size()-1).findFirst().getAsInt());
    	System.out.println(facet);
    	facet1.SelectBrand(facet);

    	Thread.sleep(5000);
		item.click();
		WebElement size =  driver.findElement(By.id("native_dropdown_selected_size_name"));
	 	Select s2 = new Select(size);
	 	s2.selectByIndex(2);
		addtocart.click();
	}

}
