// 18/3/2024

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Alert in Selenium is a message/notification box that notifies the user about some information or 
//asks for permission to perform a certain kind of operation. It may be used for warning purposes as well.
public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		// to maximize the window we can use below code
		driver.manage().window().maximize();
		
		// to maximize the window we can use below code
//		driver.manage().window().minimize();
		
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		button.click();
////		
//		// 1. to get the text from alert box we will use getText method
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
////		
////		// 2. to accept the alert we can use accept method
//		driver.switchTo().alert().accept();
		
		// -----------------------------------------------------------------------------------------------------------------
//		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		button.click();
//		
//		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//		button1.click();
//		
//		// 3. to dismiss the alert we can use dismiss method
//		driver.switchTo().alert().dismiss();
		
		//------------------------------------------------------------------------------------------------------------------
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button1.click();
		Thread.sleep(3000);  // in real time we cannot use the Thread.sleep because we have to reduce time in real time
		
		// 4. to enter the text value in alert we can use sendKeys method
		driver.switchTo().alert().sendKeys("Soundarya");
		driver.switchTo().alert().accept();
//		
		
	}

}
