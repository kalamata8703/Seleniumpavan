package day27;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[text()='Alert']")).click();
		//driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		Thread.sleep(2000);
	Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
	
		
		/*how to handle javascript Alert
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();*/
		
		//How to handle Confirmation Alert
		
/*Alert alert=driver.switchTo().alert();
 System.out.println(alert.getText());
alert.dismiss();*/
		
		//How to handle PromptAlert
		
		//Alert alert=driver.switchTo().alert();
alert.sendKeys("Welcome");
System.out.println(alert.getText());
alert.accept();



	}

}
