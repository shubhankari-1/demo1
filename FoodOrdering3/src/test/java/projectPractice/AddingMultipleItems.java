package projectPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingMultipleItems {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Login to application
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/index.php");
		//Click on restaurants
		driver.findElement(By.xpath("(//a[@class='nav-link active'])[2]")).click();
		//Click on view menu
		driver.findElement(By.linkText("View Menu")).click();
		//Adding multiple items to cart
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.xpath("(//input[@value='Add To Cart'])[1]")).click();
        js.executeScript("window.scrollBy(0,600)");
        driver.findElement(By.xpath("(//input[@value='Add To Cart'])[2]")).click();

	}

}
