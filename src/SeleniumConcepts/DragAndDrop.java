package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	   // driver.switchTo().frame(0);
	    Actions action = new Actions(driver);	
	   // WebDriverWait wait = new WebDriverWait(driver, 5);
	  //  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
	    WebElement sourceLocator = driver.findElement(By.cssSelector("#div1"));
	    WebElement targetLocator = driver.findElement(By.cssSelector("#div2"));
       
 	 	action.dragAndDrop(sourceLocator, targetLocator).build().perform();

	}

}
