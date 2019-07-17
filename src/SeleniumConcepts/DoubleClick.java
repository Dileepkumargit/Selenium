package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.google.in");
	    Thread.sleep(5000);
	    Actions action = new Actions(driver);
	    WebElement ele = driver.findElement(By.linkText("Images"));
        //used doubleClick(element) method to do double click action
        action.doubleClick(ele).build().perform();
        //driver.quit();
	}

}
