package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Navigationalmethods {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		//navigate() method
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//2type
		URL url=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(url);
		
		driver.getCurrentUrl();
		driver.navigate().to("https://demo.nopcommerce.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		
		

	}

}
