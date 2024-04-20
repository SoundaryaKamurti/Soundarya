// 12/3
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//link text	Locates anchor elements whose visible text matches the search value
//partial link text	Locates anchor elements whose visible text contains the search value. 
//If multiple elements are matching, only the first one will be selected.

public class LinkTextAndPartialLinkTextLocatoeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		WebElement forgot = driver.findElement(By.linkText("Forgot your password?"));
//		forgot.click();
		
		WebElement forgot = driver.findElement(By.partialLinkText("pass")); 
		forgot.click();
	}

}
