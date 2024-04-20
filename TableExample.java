// 21/3/2024
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seed\\Automation_Project\\Software\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		driver.manage().window().maximize();
		
		// to fetch the columns from the table  we will use the below code
//		List<WebElement> columns  = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		int size = columns.size();
//		System.out.println("Total no of columns are: "+size);
//		
//		for(int i=0; i<size; i++)
//		{
//			String columnName = columns.get(i).getText();
//			System.out.println(columnName);
//			if(columnName.equalsIgnoreCase("Company"))
//			{
//				System.out.println("We have column name as per requirement..");
//			}
//		}
		
		System.out.println("------------------------------------------------------");
		// to fetch the row from the table  we will use the below code
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size1 = rows.size();
		System.out.println("Total no of rows are: "+size1);
		
		for(int i=0; i<size1; i++)
		{
			String rowName = rows.get(i).getText();
			System.out.println(rowName);
		}
		
		//to fetch the cell data we will use the below code
		System.out.println("---------------------------------------------------------");
		WebElement cellData = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[5]/td[1]"));  // td/tr starts from 1 not 0
		System.out.println(cellData.getText());
	}

}
