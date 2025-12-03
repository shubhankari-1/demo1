package projectPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseMenus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//login to application
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/index.php");
		//Click  on restaurants
		driver.findElement(By.xpath("(//a[@class='nav-link active'])[2]")).click();
		//click on menus
		driver.findElement(By.linkText("View Menu")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		//Browse the different menus
		driver.navigate().back();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//a[@class='btn btn-purple'])[2]")).click();
		js.executeScript("window.scrollBy(0,500)");
		

	}

}
