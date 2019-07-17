package SeleniumConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	
	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
	 	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.flipkart.com");
	    //String handle = driver.getWindowHandle();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ESCAPE);
	   // driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();
	    //driver.findElement(By.className("_2AkmmA _29YdH8")).click();
	    driver.findElement(By.linkText("Contact Us")).click();
	    Set handles = driver.getWindowHandles();
	    handles.size();
	    System.out.println("Handles");
	    for (String handle1 : driver.getWindowHandles()) {
	    	 
        	System.out.println(handle1);
        	
        	driver.switchTo().window(handle1);
        
        	}
	    for(String handle2 : driver.getWindowHandles())
	    {
	    	System.out.println(handle2);
	        driver.switchTo().window(handle2);
        	driver.close();
	    }	
	}

}
