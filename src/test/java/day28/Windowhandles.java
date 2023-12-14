package day28;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//To get multiple windowids 
		
		//Approach 1
		Set<String> winhandles=driver.getWindowHandles();
		//To get the windowids individually we use arrayList or for loop----Collections
		/*List<String> ids=new ArrayList(winhandles);//this will convert from set collections to arraylist
		String Parentid=ids.get(0);
		String Childid=ids.get(1);
		//using switchto method we can switch between the windows
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());  */
		
		
		//Approach 2
		for(String winids:winhandles)
		{
		String title	=driver.switchTo().window(winids).getTitle();
		System.out.println(title);
		if(title.contains("OrangeHRM"))
		{
	      System.out.println(driver.getCurrentUrl());
		
		}
		
		}
		
		 

	}
}



