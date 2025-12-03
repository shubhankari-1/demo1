package projectPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAddToCartButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Open the browser
	    driver.get("http://49.249.28.218:8081/AppServer/Online_Food_Ordering_System/login.php");
		//login to application
		driver.findElement(By.linkText("Login")).click();
		//Enter username and password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Jyothi H.N.");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sanjyo@123");
		//click on login
		driver.findElement(By.id("buttn")).click();
		//click on home button
		driver.findElement(By.xpath("(//li[@class='nav-item'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(5);
        //click on order now button
        driver.findElement(By.xpath("(//a[text()='Order Now'])[1]")).click();
        //Click on add to cart button
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.xpath("(//input[@value='Add To Cart'])[1]")).click();
        js.executeScript("window.scrollBy(0,500)");
        
        
        
        
	}

}
