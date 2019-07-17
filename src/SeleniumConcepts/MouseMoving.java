package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoving {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.myntra.com");
	    Actions Action = new Actions(driver);
	    WebElement A1 = driver.findElement(By.linkText("Women"));
	    Action.moveToElement(A1).perform();
	    driver.findElement(By.linkText("Heels")).click();
	    Thread.sleep(5000);
	    driver.quit();

	}

}
