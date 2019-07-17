package VerifyHomePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LoginPage.LoginPage;

public class VerifyHomePage {
	
	@Test
	public void Verifyvaliduserid(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
		
		LoginPage login = new LoginPage(driver);
		
		login.typeusername();
		login.clickoncontinue();
		login.typepassword();
		login.clickonsigninbutton();
		
		driver.quit();
			
	}
}
