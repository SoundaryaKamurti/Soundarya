// 12/3/2024
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Locates elements whose class name contains the search value
public class ClassNameLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.className("inputtext"));  // if both have same classname 2nd classname will be print in 1st search box.
		WebElement password = driver.findElement(By.className("inputtext")); // username and password get  both in one search box because of we take the password as classNAme(inputtext)
		
		username.sendKeys("Soundarya");
		password.sendKeys("Soundarya123");
		
		

	}

}
