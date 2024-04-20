//24/3/2024
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// the WebDriver is directed to wait until a certain condition occurs before proceeding with executing the code.
public class ExplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		
		//1.firstly we need to create webDriverwait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//2. we will use until method of the webDriverwait class to implement the conditions of expected class
		WebElement username = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("Soundarya");
		
		WebElement password = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
		password.sendKeys("Soundarya123");
		
		WebElement login = driver.findElement(By.id("u_0_b"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		

	}

}
