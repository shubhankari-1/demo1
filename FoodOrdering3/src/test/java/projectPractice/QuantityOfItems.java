package projectPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuantityOfItems {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Login to application
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/index.php");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("username")).sendKeys("Jyothi H.N.");
		driver.findElement(By.name("password")).sendKeys("sanjyo@123");
		driver.findElement(By.id("buttn")).click();
		//Click on my orders
		driver.findElement(By.linkText("My Orders")).click();
		//Get the text
		WebElement text = driver.findElement(By.xpath("//td[@data-column=\"Quantity\"]/parent::tr"));
		System.out.println(text.getText());
		

	}

}
