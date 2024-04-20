//  12/3
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sound");
		Thread.sleep(1000);

		// to clear the populated text in the textbox we need to use clear method
		username.clear();
		
		WebElement text = driver.findElement(By.tagName("h1"));
		
		// to fetch the value of particular element we can use gettext method
		String value = text.getText();
		System.out.println(value);
	}

}
