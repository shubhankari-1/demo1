package frameWorktestPractice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.PropertyFileReader;

public class ClickOnAddToCartButton {

	public static void main(String[] args) throws InterruptedException {
		PropertyFileReader data=new PropertyFileReader();
		String browser = data.getProperty("browser");
		String username = data.getProperty("username");
		String password = data.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Open the browser
	    driver.get(browser);
		//login to application
		driver.findElement(By.linkText("Login")).click();
		//Enter username and password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		//click on login
		driver.findElement(By.id("buttn")).click();
		//click on home button
		driver.findElement(By.xpath("(//a[@class='nav-link active'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(5);
        //click on order now button
        driver.findElement(By.xpath("(//a[text()='Order Now'])[1]")).click();
        //Click on add to cart button
        js.executeScript("window.scrollBy(0,800)");
        driver.findElement(By.xpath("(//input[@value='Add To Cart'])[1]")).click();
        js.executeScript("window.scrollBy(0,500)");
        WebElement total = driver.findElement(By.xpath("//div[@class='price-wrap text-xs-center']"));
        System.out.println(total.getText());
        driver.quit();
	}

}
