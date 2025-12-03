package projectPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlacingOrderTestPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Login to application
		driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/index.php");
		//Click on restaurants
		driver.findElement(By.linkText("Restaurants")).click();
		//click on view menu
		driver.findElement(By.linkText("View Menu")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");	
		//click on add to cart button
		driver.findElement(By.xpath("(//input[@value='Add To Cart'])[1]")).click();
		js.executeAsyncScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//div[text()='Free Delivery!']/following-sibling::button[text()='Checkout']")).click();
		//Click on place order
		driver.findElement(By.name("submit")).click();

	}

}
