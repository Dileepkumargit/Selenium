package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.mymarriage.com");
	    WebElement Facet = driver.findElement(By.id("community"));
	    Select s1 = new Select(Facet);
	    //s1.selectByIndex(2);
	   	s1.selectByValue("Jain");
	   	Actions action = new Actions(driver);
	   	WebElement A = driver.findElement(By.linkText("Login"));
	    action.contextClick(A).perform();
	    action.doubleClick(A).perform();
	   	Thread.sleep(5000);
	   	driver.quit();


	}

}
