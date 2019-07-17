package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.amazon.in");
	    driver.findElement(By.linkText("Today's Deals")).click();
	    driver.navigate().to("http://www.google.com");
	    driver.close();

	}

}
