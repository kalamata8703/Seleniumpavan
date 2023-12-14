package day21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


/*Test Case

1) Launch browser( chrome)
2) open URL
	https://opensource-demo.orangehrmlive.com/
3) Provide username - Admin
4) Provide password - admin123
5) Click on login button
6) Verify dashboard page display
7) close browser
*/
public class AssignmentLoginTestCase {
	

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the Browsername (Chrome/Edge) : ");
		
		Scanner sc=new Scanner(System.in);
    String Browsername=sc.next();
    WebDriver driver=null;
	
		
		//1.Launch browser
		//WebDriver driver=new ChromeDriver();
    
    switch(Browsername)
    {
    case "Chrome": driver=new ChromeDriver();
              break;
    case "Edge": driver=new EdgeDriver();
               break;
               default: System.out.println("Invalid broser");
    }
		try
		{
		//2.open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		//3.click on login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		
		//4.verify dashboard display
		
//	String Text=	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]")).getText();
		
	
boolean status=	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).isDisplayed();
		//System.out.println(Text);
		System.out.println(status);
		
		if(status==true) 
		{
			
			System.out.println("Dashboard is displayed");
		}
		else
		{
			System.out.println("Dashboard not displayed");
		}
		
		//7.close browser
		driver.quit();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		

		
		

	}

}
