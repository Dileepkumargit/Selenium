package SeleniumConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FailedTesstcase<Scenario> {
  @Test
  public void f() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jabong.com");
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Robot a1 = new Robot();
      a1.keyPress(KeyEvent.VK_ESCAPE);
      driver.findElement(By.id("search")).sendKeys("Shirts");
      driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
      driver.findElement(By.id("men")).click();
      driver.findElement(By.id("#ALCOTT")).click();
      driver.findElement(By.xpath("//*[@data-product-id='4755972']")).click();
      driver.findElement(By.xpath("//*[@data-size='40']")).click();
      driver.findElement(By.id("add-to-cart")).click();
	  
  }
  
}
