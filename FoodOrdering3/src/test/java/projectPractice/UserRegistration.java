package projectPractice;

import java.time.Duration;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserRegistration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Login to application
		driver.get("http://49.249.28.218:8081/AppServer/domain.html#E-Commerce");
		String parentWindow = driver.getWindowHandle();
		//Click on particular website
		WebElement foodOrdering = driver.findElement(By.linkText("Online_Food_Ordering_System"));
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 1000).perform();
		act.scrollToElement(foodOrdering).perform();
		act.click(foodOrdering).perform();
		Set<String> allWindow = driver.getWindowHandles();
		for (String window : allWindow) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
			
		}
		//Click on register
		 driver.findElement(By.linkText("Register")).click();
		 Thread.sleep(3000);
		 //Enter all the details
		 
		 
		 driver.findElement(By.name("username")).sendKeys("rama");
		 driver.findElement(By.name("firstname")).sendKeys("rama");
		 driver.findElement(By.name("lastname")).sendKeys("hn");
		 driver.findElement(By.name("email")).sendKeys("abcde@gmail.com");
		 driver.findElement(By.name("phone")).sendKeys("1234567891");
		 driver.findElement(By.name("password")).sendKeys("abc123");
		 driver.findElement(By.name("cpassword")).sendKeys("abc123");
		 act.scrollByAmount(0, 800).perform();
		
		 
		 driver.findElement(By.xpath("//input[@class='btn theme-btn']")).click();
		 driver.quit();
		 
		 

	}

}
