//  12/3
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//	Locates elements matching a CSS selector
public class CSSLocatorsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		 // 1. by using tag and class name(.)
		WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
//		
//		//2. by using tag and id(#)
		WebElement pass = driver.findElement(By.cssSelector("input#pass"));
//		
		un.sendKeys("soundarya");
		pass.sendKeys("soundarya");
//		
//		// 3. by using tag and attribute
//		WebElement un = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
//		
//		// 4. by using tag, class(.) and attributes([])
//		WebElement pass = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
//		
//		un.sendKeys("Soundarya");
//		pass.sendKeys("Soundarya");
//		
////		// 5. by using tag, id and attributes
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
//		login.click();
		
		// below 3 are not method but it will use with above methods(13/3/2024)
		//6. by using starts with - it will find the locators based on starting character
//		WebElement un = driver.findElement(By.cssSelector("input[name^='ema']"));
//		un.sendKeys("Soundarya");
//		
//		// 7.by using ends with - it will find the locators based on ending character
//		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
//		pass.sendKeys("Soundarya");
//		
//		// 8. by using the contains - it will find the locators based on character which is present or not
//		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
//		login.click();
	}

}
