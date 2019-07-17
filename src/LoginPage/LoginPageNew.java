package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageNew {
	
	WebDriver driver;
	
	public LoginPageNew(WebDriver driver) 
	{
		this.driver=driver;
	}
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement click;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy (id="signInSubmit")
	WebElement signinbutton;
	
	public void LoginAmazon(String userid , String pass)
	{
		username.sendKeys(userid);
		click.click();
		password.sendKeys(pass);
		signinbutton.click();
		
	}

}
