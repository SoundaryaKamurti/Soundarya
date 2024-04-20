// 12/3 h.w.--->facebook(csslocators)
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCSSLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
//		WebElement un = driver.findElement(By.cssSelector("input[data-testid='royal_email']"));   // by using tag & attribute
//		WebElement pass = driver.findElement(By.cssSelector("input#pass"));  // by using tag & id
		
//		WebElement un = driver.findElement(By.cssSelector("input[type='text'][name='email']"));  //by using tag & attribute
//		WebElement pass = driver.findElement(By.cssSelector("input[type='password'][data-testid='royal_pass']"));  // by using tag & attribute
		
//		un.sendKeys("Soundarya Kamurti");
//		pass.sendKeys("");
//		
//		WebElement login = driver.findElement(By.cssSelector("button[type='submit'][data-testid='royal_login_button']"));  //by using tag & attribute
//		login.click();
		
		// -----------------------------------------------------------------------------------------------
		
		// it will use with above methods
				WebElement un = driver.findElement(By.cssSelector("input[name^='ema']"));
		un.sendKeys("Soundarya Kamurti");
		
		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("rssaa2403");
		
		WebElement login = driver.findElement(By.cssSelector("button[type*='bm"));
		login.click();	
		
		
	}

}
