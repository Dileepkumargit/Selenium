package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	 static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		driver.get(url);
		return driver;
	}

}
