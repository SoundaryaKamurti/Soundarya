// 15/3/2024
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//The checkbox is a Web element that is used for the selection of one or multiple options
public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//to click on the single checkbox we need to find  out the element and need to click on it
//		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
//		checkbox1.click();
//		
//		
//		// to check the checkbox is already selected or not we need to use below logic.
//		if (checkbox1.isSelected())
//		{
//			System.out.println("checkbox is selected by default");
//		}
//		else
//		{
//			checkbox1.click();
//		}

		
		// To select the multiple checkbox in single code we will use below method
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size = checkboxes.size();
		System.out.println(size);
		
		// if you have multiple elements and you want to perform operation on specific index you can use get method
//		checkboxes.get(0).click();
		
//		for(int i = 0;i<size;i++)
//		{
//			checkboxes.get(i).click();
//		}
		
		
		// dynamically click on the checkbox if value is matched
		for(int i = 0;i<size;i++)
		{
			// getAttribute method is used to fetch the value of elements attribute as per given key
			String value = checkboxes.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("movies"))  // equalsIgnoreCase-->ignore the small case & capital case, (means if we give 'cricket' in small case but it will ignore small case value and take capital 'Cricket'.
			{
				checkboxes.get(i).click();
			}
		}
	}

}
