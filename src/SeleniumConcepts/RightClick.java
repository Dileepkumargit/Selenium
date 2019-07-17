package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.naukri.com");
	    WebElement A1 = driver.findElement(By.linkText("MORE"));
	    Actions Action = new Actions(driver);
	    Action.contextClick(A1).sendKeys("t");
	    //Action.click().build().perform();
	    Thread.sleep(5000);
	    //driver.quit();

	}

}
