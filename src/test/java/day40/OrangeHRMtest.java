package day40;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import org.testng.annotations.Test;

/*Launch the browser and open URl "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
 * Check logo presence
 * login
 * closeapp
 * 
 */

public class OrangeHRMtest {
	WebDriver driver;
	
	@Test(priority=1)
	void openApp() 
	{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	@Test(priority=2)
	void testLogo() 
	{
		
 boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
System.out.println(status);
 
		
	}
	@Test(priority=3)
	void loginTest() 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Test(priority=4)
	void closeTest()
	{
		driver.close();
	}

}
