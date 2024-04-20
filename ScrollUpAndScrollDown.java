
// 2/4/2024
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to scroll down we need to give positive value
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 500)");
		
		// to scroll up we need to give negative value
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, -500)");

	}

}
