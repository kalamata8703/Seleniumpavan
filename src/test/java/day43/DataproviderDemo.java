package day43;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {
	
	
	WebDriver driver;
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		
	}
@Test(dataProvider="dp")
void testLogin(String email,String pwd) throws InterruptedException
{
	driver.get("https://demo.nopcommerce.com/login");
	 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
	 driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	 	Thread.sleep(2000);	
	 String exp_title="nopCommerce demo store";
	 String act_title=driver.getTitle();
	 
	 Assert.assertEquals(act_title, exp_title);
}
@AfterClass
void tearDown()
{
	driver.quit();
}

@DataProvider(name="dp",indices= {0,1})
Object[][] loginData()
{
	Object data[][]= { {"abc@gmail.com","abc123"},
			{"pavanol@gmail.com","test123"},
			{"abc@gmail.com","abc"}
	};
	return data;
	}
}


