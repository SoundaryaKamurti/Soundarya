import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIsSelectedIsDisplayedIsEnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		
		boolean res = un.isDisplayed();
		boolean res1 = un.isEnabled();
		System.out.println(res);
		System.out.println(res1);
		
		boolean pass1 = pass.isDisplayed();
		boolean pass2 = pass.isEnabled();
		System.out.println(pass1);
		System.out.println(pass2);
		
		
		if(un.isDisplayed() && un.isEnabled())
		{
			un.sendKeys("Soundarya Kamurti");
		}
		else
		{
			System.out.println("Username is not displayed");
		}
		
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("rssaa2403");
		}
		else
		{
			System.out.println("Password is not displayed");
		}
		
		
	}

}
