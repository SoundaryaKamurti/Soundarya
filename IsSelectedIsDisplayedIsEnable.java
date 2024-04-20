// 13/3/2024
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayedIsEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		
		// isDisplayed method is used to validate element is present or not
		// isEnabled method is used to validate element is enable or disable
		boolean result = username.isDisplayed();
		boolean result1 = username.isEnabled();
		System.out.println(result);
		System.out.println(result1);
		
		boolean pass = password.isDisplayed();
		boolean pass1 = password.isEnabled();
		System.out.println(pass);
		System.out.println(pass1);
		
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("Soundarya");
		}
		else
		{
			System.out.println("Username is not displayed");
		}
		
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("Soundarya");
		}
		else
		{
			System.out.println("Password is not displayed");
		}
	
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		
		// isSelected() method is used to validate checkbox or radio button is already selected or not
		boolean result2 = checkbox.isSelected();
		System.out.println(result2);// returns false because radio checkbox is not selected
		
		
	}

}
