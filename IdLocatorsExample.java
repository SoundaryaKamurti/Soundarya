// 11/3/2024
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Locates elements whose ID attribute matches the search value
public class IdLocatorsExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		
		// to find the element by using id locators firstly we need to create a reference variable of webElement 
		//interface and need to use below syntax
		
		WebElement username =  driver.findElement(By.id("email"));		
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.id("u_0_b"));

		
		//sendkeys method is used to enter the value in textbox
		username.sendKeys("Soundarya@gmail.com");
		password.sendKeys("Soundarya24");
		
		// click method is used to click on any button, radio button checkbox or link
		login.click();
	}

}
