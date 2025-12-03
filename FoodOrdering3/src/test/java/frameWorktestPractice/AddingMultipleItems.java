package frameWorktestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.PropertyFileReader;

public class AddingMultipleItems {

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
		//Enter username and password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		//click on login
		driver.findElement(By.id("buttn")).click();
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
        js.executeScript("window.scrollBy(0,500)");
        WebElement value = driver.findElement(By.xpath("//div[@class='price-wrap text-xs-center']"));
        System.out.println(value.getText());
        System.out.println("hello world");
		 System.out.println("hello world1");
        driver.quit();

	}

}

