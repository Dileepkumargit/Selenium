package SeleniumConcepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ReadExcel {
	@Test
	public void abhibus (String email, String password) throws IOException{
        //I have placed an excel file 'Test.xlsx' in my D Driver 
		FileInputStream fis = new FileInputStream("D:\\CSC\\Documents\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
      
        System.out.println(sheet.getRow(0).getCell(0));
        System.setProperty("webdriver.chrome.driver", "E:\\chrormeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com");
        driver.findElement(By.id("source")).sendKeys(email);
     	

	}

}
