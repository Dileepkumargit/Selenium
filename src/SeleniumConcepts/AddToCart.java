package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AddToCart {
    
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit .SECONDS);
	    driver.get("https://www.amazon.in/Van-Heusen-Relaxed-Cotton-50001_Charcoal_Medium/dp/B01LWKEIE9/ref=sr_1_5?s=apparel&ie=UTF8&qid=1545056024&sr=1-5&keywords=shorts");
	    /*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shorts");
	    driver.findElement(By.cssSelector("input[type='submit']")).click();
	    driver.findElement(By.xpath(".//*[@id='result_4']/div/div[4]/div[1]/a/h2")).click();
	    Thread.sleep(7000);
	    System.out.println("chose the size");*/
	    WebElement size =  driver.findElement(By.name("dropdown_selected_size_name"));
	 	Select s2 = new Select(size);
	 	s2.selectByVisibleText("Small");

	
	   
	}
}
