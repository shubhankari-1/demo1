package frameWorktestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.PropertyFileReader;

public class LoginToApplication {

	public static void main(String[] args) {
		PropertyFileReader data=new PropertyFileReader();
		String browser = data.getProperty("browser");
		String username = data.getProperty("username");
		String password = data.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Open the browser
		driver.get(browser);
		//Login to application
		driver.findElement(By.linkText("Login")).click();
		//Enter username and password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		//click on login
		driver.findElement(By.id("buttn")).click();
		driver.quit();
		
		

	}
	
}
