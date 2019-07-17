package SeleniumConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Clender {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        
		driver.get("http://www.abhibus.com");
		driver.findElement(By.id("source")).sendKeys("Bangalore");
		driver.findElement(By.id("destination")).sendKeys("Proddatur");
	    driver.findElement(By.id("datepicker1")).click();
	    driver.findElement(By.linkText("16")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Search")).click();
			
	}
}


