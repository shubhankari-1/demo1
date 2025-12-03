package frameWorktestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.PropertyFileReader;

public class QuantityOfItems {

	public static void main(String[] args) {
		PropertyFileReader data=new PropertyFileReader();
		String browser = data.getProperty("browser");
		String username = data.getProperty("username");
		String password = data.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Login to application
		driver.get(browser);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("buttn")).click();
		//Click on my orders
		driver.findElement(By.linkText("My Orders")).click();
		//Get the text
		WebElement text = driver.findElement(By.xpath("//td[@data-column=\"Quantity\"]/parent::tr"));
		System.out.println(text.getText());
		driver.quit();
	}

}
