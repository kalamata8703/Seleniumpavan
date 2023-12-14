package day41;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotationsbeforeclass {
	
	@BeforeClass
	public void login() 
	{
		
	System.out.println("login successful");	
	}
	@Test
	public void search()
	{
		System.out.println("Search enter....");
	}
	@Test
	public void advancedSearch() 
	{
		System.out.println("welcome to advanced search");
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logout successful"); 
	}

}
