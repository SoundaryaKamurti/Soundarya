// 14/3/2024
// Relative XPath: Starts from a specific element and navigates through the DOM(Document Object Model) hierarchy to locate the desired element.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Relative XPath: Starts from a specific element and navigates through the DOM hierarchy to locate the desired element.
public class RelativeXPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		// 1. using simple XPath method by using tag and attributes
		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));  // 1st way
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));  //  //input[@type='password']
		WebElement login = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));   // 2nd way - while using double quotes we should add \  (input or *--it selected all)
		
		
		// 2.using and condition(using multiple tags with and condition)
//		WebElement un = driver.findElement(By.xpath("//input[@class='inputtext' and @id='email']"));   //both condition should be true 
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass' and @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
		
		//3. using or condition
//		WebElement un = driver.findElement(By.xpath("//input[@class='inputtext' or @id='email']"));   //both condition should be true 
//		WebElement pass = driver.findElement(By.xpath("//input[@name='pass' or @tabindex='2']"));
//		WebElement login = driver.findElement(By.xpath("//input[@value='Log In' or @type='sub']"));	
//		
		
		// 4. using contains method
//		WebElement un = driver.findElement(By.xpath("//input[contains(@name,'ma')]"));   // sub value present or not
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@type,'wor')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@value, 'g I')]"));
		
		// 5.using starts-with method
//		WebElement un = driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));   //check first value present or not
//		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@type,'pass')]"));
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@value, 'Log')]"));
//		
		un.sendKeys("Soundarya");
		pass.sendKeys("Soundarya");
		login.click();
		
		//6. using text method
//		WebElement link = driver.findElement(By.xpath("//*[text()='Bank Project']"));
//		link.click();
	}

}
