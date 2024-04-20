// 16/3/2024
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		Select select = new Select(country);
		
		//1. Select by visible text(selectByVisibleText - It is used to select an option based on the text over the option.)
//		select.selectByVisibleText("CHINA");

		//2. Select by value(selectByValue - It is used to select an option based on its 'value' attribute.)
//		select.selectByValue("BERMUDA");
		
		//3. select by index
		select.selectByIndex(5);
	}

}
