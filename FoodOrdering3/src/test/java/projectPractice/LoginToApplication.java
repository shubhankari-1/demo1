package projectPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApplication {

	public static void main(String[] args) {
		
	    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Open the browser
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/login.php");
		//Login to application
		driver.findElement(By.linkText("Login")).click();
		//Enter username and password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Jyothi H.N.");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sanjyo@123");
		//click on login
		driver.findElement(By.id("buttn")).click();
		

	}

}
