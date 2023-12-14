package day26;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//get(url)
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle()
	//System.out.println("Title of the webpage  " + driver.getTitle());
	
	//getCurrentUrl()
	System.out.println("Title of currentpage" +driver.getCurrentUrl());
	
	//getPagesource()
	//System.out.println("page source" +driver.getPageSource());
	
	
	//getWindowhandle()
	//System.out.println("current window id "+ driver.getWindowHandle());
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
	//System.out.println("mulitiple window ids " +driver.getWindowHandles());
	
 Set<String> winhandle	=driver.getWindowHandles();
 
 for( String win:winhandle)
 {
	 System.out.println(win);
 }

	}

}
