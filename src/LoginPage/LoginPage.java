package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
		
		WebDriver driver;
		
		By username = By.id("ap_email");
		By click    = By.id("continue");
		By password = By.id("ap_password");
		By signinbutton = By.id("signInSubmit");
		
		public LoginPage(WebDriver driver)
		{
			this.driver = driver;
		}
		public void typeusername()
		{
			driver.findElement(username).sendKeys("thupatidileep@gmail.com");
		}
		public void clickoncontinue()
		{
			driver.findElement(click).click();
		}
		public void typepassword()
		{
			driver.findElement(password).sendKeys("dileep335");
		}
		public void clickonsigninbutton()
		{
			driver.findElement(signinbutton).click();
		}

	}
