import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\FireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
				
		WebElement username =  driver.findElement(By.id("email"));		
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("u_0_b"));

		
		
		username.sendKeys("Soundarya@gmail.com");
		password.sendKeys("Soundarya24");
		
		
		login.click();

	}

}
