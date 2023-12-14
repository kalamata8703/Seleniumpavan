package day32;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignmentstaticwebtables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//option[@value='Paris']")).click();
		driver.findElement(By.xpath("//option[@value='Buenos Aires']")).click();
		
driver.findElement(By.xpath("//input[@type='submit']")).click();

//To find total rows and columns in a table
 int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
System.out.println("Total rows "+ rows);
int columns=driver.findElements(By.xpath("//table[@class='table']//thead//th")).size();
System.out.println("Total columns "+ columns);

//

		
		
		
}
}