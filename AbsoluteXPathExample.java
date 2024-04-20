// 14/3/2024
//Absolute XPath: Begins from the root of the HTML document and specifies the complete path to the element. 
//It's not as flexible and can break if the page structure changes.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Absolute XPath: Begins from the root of the HTML document and specifies the complete path to the element. 
//It's not as flexible and can break if the page structure changes.
public class AbsoluteXPathExample { 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[1]/input"));  //absolute xpath start with (/)
		username.sendKeys("Soundarya");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[2]/input"));
		password.sendKeys("Soundarya");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[3]/label/input"));
		login.click();
	}

}
