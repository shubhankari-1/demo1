package frameWorktestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.PropertyFileReader;

public class Browsemenus {

	public static void main(String[] args) throws InterruptedException {
		PropertyFileReader data=new PropertyFileReader();
		String browser = data.getProperty("browser");
		String username = data.getProperty("username");
		String password = data.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//login to application
		driver.get(browser);
		driver.findElement(By.linkText("Login")).click();
		//Enter username and password
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		//click on login
		driver.findElement(By.id("buttn")).click();
		Thread.sleep(3000);
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
		WebElement menu = driver.findElement(By.linkText("Pink Spaghetti Gamberoni"));
		System.out.println(menu.getText());
		WebElement menu1 = driver.findElement(By.linkText("Crispy Chicken Strips"));
		System.out.println(menu1.getText());
		WebElement menu2 = driver.findElement(By.linkText("Lemon Grilled Chicken And Pasta"));
		System.out.println(menu2.getText());
		System.out.println("hello");
		System.out.println("hello world");
		driver.quit();
	}

}
