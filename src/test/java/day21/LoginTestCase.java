package day21;
//import org.openqa.selenium.WebDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

   /*URL: https://www.demoblaze.com/index.html
    
    * Test case
---------
1) Launch browser 
2) open URL: https://www.demoblaze.com/index.html
3) click on login link
4) enter user name & password
5) click on login button
6) validate logout link present on home page.
7)Validate username is displayed afterlogin
8) close browser.*/




public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// WebDriver driver=null;
		System.out.println("Enter the browser (chrome/Edge):");
		
		Scanner sc=new Scanner(System.in);
	String Browsername=	sc.next();
	WebDriver driver=null;
		//1.Launch browser
		//WebDriver driver =new ChromeDriver();
		
		//using Switch statement
		switch(Browsername)
		
		{
			case  "chrome" : driver=new ChromeDriver();
			break;
			case  "edge" : driver=new EdgeDriver();
			break;
			
			default :System.out.println("Invalid browser");
		}
		
		//2.open URL
		try {
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(3000);
		//To maximaze window
		
		driver.manage().window().maximize();
		
		//3.Click on login link
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		
		//4. Enter user name & password
		//driver.findElement(By.id("loginusername")).sendKeys("swathi12345");
		
		
		driver.findElement(By.id("loginusername")).sendKeys("swathi12345");
		driver.findElement(By.id("loginpassword")).sendKeys("1234");
		
		
		//4) enter user name & password
			//	driver.findElement(By.id("loginusername")).sendKeys("pavanol");
				//driver.findElement(By.id("loginpassword")).sendKeys("test@123");
				
		
		
		 //5.Click on login button
				
				driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
				Thread.sleep(3000);

	//	driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
				
				//6.Validate logoutlink on homepage
			//boolean status=	driver.findElement(By.id("logout2")).isDisplayed();
				
				boolean status=driver.findElement(By.id("logout2")).isDisplayed();
			
			//Thread.sleep(3000);
			System.out.println(status);
			if(status==true) 
			{
				System.out.println("Testing passed");
			}
			
			else
			{
				System.out.println("Testing failed");
			}
			
		
		//Validate username is displayed afterlogin
		
		 
	String Text=	driver.findElement(By.id("nameofuser")).getText();
		System.out.println(Text);
		if(Text.contains("swathi12345"))
		{
			System.out.println("username is successfully displayed");
		}
		else
		{
			System.out.println("username not displayed");
		}
		driver.quit();
		
		
	}
		
		
		catch (Exception e)
		{
			
		}
		
	

	}

}
