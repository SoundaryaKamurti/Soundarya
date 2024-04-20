//3/4/2024
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class TakeAScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		
		// firstly we are creating reference of TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// calling getScreenshots method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		// Move the file into new destination folder
		File destFile = new File("D:\\Seed\\Automation_Project\\images\\error.png");
		
		// we will copy the screenshot into destination folder
		Files.copy(srcFile, destFile);
		

	}

}
