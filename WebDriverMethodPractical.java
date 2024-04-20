//   8/3/2024
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractical {

	public static void main(String[] args) {
		
		        //This method will help you to set the browser path which we need to use to run the automation script
				System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
					
				//to create chromedriver object we need to create webdriver interface reference variable and need to create object for browser
				// webdriver is a interface--> interface cannot create object but here we create reference object of chromedriver
				WebDriver driver = new ChromeDriver(); 
				
				//1. get()-- this method will help you to open the any URL
				driver.get("https://www.amazon.in/");
				
				//3. to get the title of  current opened url we can use get title method
//				String title = driver.getTitle();
//				System.out.println(title);
//				
//				//4. to get the currently opened url we can use to get current url method
//				String url = driver.getCurrentUrl();
//				System.out.println(url);
//				
//				//5.to get the source code of opened url we can use this method to get page source
				String source = driver.getPageSource();
				System.out.println(source);
				
				//2. to close the current URL we need to use close method
//				driver.close();  //close currently opened url
//				
//				//6. to close the all the opened url we need to use quit method
//				driver.quit();  //close the multiple url(tabs)
			
		
	}

}
