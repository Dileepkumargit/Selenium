package ShopByCategory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AmazonCategory {
	
	WebDriver driver;
	
	public AmazonCategory(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[@id='nav-link-shopall']")
	
	WebElement category;
	
	@FindBy(linkText="Men's Fashion")
	WebElement mens;
	
	@FindBy(linkText="Clothing")
	WebElement cloths;
	
	public void ShopByCategory()
	{
		category.click();
		Actions m1 =new Actions(driver);
		m1.moveToElement(mens);
		mens.click();
		Actions cl=new Actions(driver);
		cl.moveToElement(cloths);
		cloths.click();
	}
	

}
