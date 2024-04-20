// 30/3/2024
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		//4. doubleclick - it will double click on the given webelement
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
//		action.doubleClick(button).perform();
		
		// Selenium provides an easy way to drag a web element from one part of the site and drop it at another.
		// drag and Drop
		WebElement dragAndDrop = driver.findElement(By.linkText("Drag and Drop"));
		dragAndDrop.click();
		
		WebElement drag = driver.findElement(By.id("dragdiv"));
		WebElement drop = driver.findElement(By.id("dropdiv"));
//		action.dragAndDrop(drag, drop).perform();
		action.dragAndDropBy(drag, 100, 100).perform();

	}

}
