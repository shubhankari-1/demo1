package frameWorktestPractice;

import java.io.FileNotFoundException;


import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utility.ExcelUtility;

public class UserRegistration {
	

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException {
		ExcelUtility excel1=new ExcelUtility();
		String browser = excel1.ToGetDataFromExcel("Usrreg", 1, 0);
		
		excel1.ToGetDataFromExcel("Usrreg", 1, 1);
		
		excel1.ToGetDataFromExcel("Usrreg", 1, 2);
		
		excel1.ToGetDataFromExcel("Usrreg", 1, 3);
		
		excel1.ToGetDataFromExcel("Usrreg", 1, 4);
		
		excel1.ToGetDataFromExcel("Usrreg", 1, 5);
		
		excel1.ToGetDataFromExcel("Usrreg", 1, 6);
		
		excel1.ToGetDataFromExcel("Usrreg", 1, 7);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Login to application
		driver.get(browser);
		Actions act=new Actions(driver);
		
		//Click on register
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(2000);
		 
		 //Enter all the details
		 driver.findElement(By.name("username")).sendKeys("hama");
		 driver.findElement(By.name("firstname")).sendKeys("rama");
		 driver.findElement(By.name("lastname")).sendKeys("hn");
		 driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
		 driver.findElement(By.name("phone")).sendKeys("1234567891");
		 driver.findElement(By.name("password")).sendKeys("abc123");
		 driver.findElement(By.name("cpassword")).sendKeys("abc123");
		 act.scrollByAmount(0, 800).perform();
		 driver.findElement(By.xpath("//input[@class='btn theme-btn']")).click();
		 driver.quit();
		
		
		
		
		
		 
		

	}

}
