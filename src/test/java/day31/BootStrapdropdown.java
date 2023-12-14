package day31;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class BootStrapdropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//To find single element
		driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		
		//Get all the items from the dropdown in a variable
		List<WebElement>items=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
//To display the number of items
		System.out.println(items.size());
		//to display the items with name
		for(WebElement itemsname:items)
		{
			System.out.println(itemsname.getText());
			
		}
		//To select multiple options
		
		for(WebElement item:items)
		{
		String	itemtxt=item.getText();
		
			if(itemtxt.equals("Java")||itemtxt.equals("Python"))
					
		 	{
				
				item.click();
				
			}
		}
		
	}

}
