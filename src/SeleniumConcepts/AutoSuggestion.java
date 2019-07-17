package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("List_ib")).sendKeys("any");
		driver.findElement(By.xpath("//b[contains(text(),Jackson)]")).click();

	}

}
