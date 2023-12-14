package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {

	public static void main(String[] args) {
		
		//Launch the browser
		
		WebDriver driver=new ChromeDriver();
		
		//Get the url
		 driver.get("https://demo.opencart.com");
		 
		 //To maximize the window
		 driver.manage().window().maximize();
		 
		 //Name locator
		 
		 driver.findElement(By.name("search")).sendKeys("Tablets");
		 
		 //id locator
boolean	status	= driver.findElement(By.id("logo")).isDisplayed();

System.out.println(status);

//LinkText and partial LinkText

driver.findElement(By.linkText("Tablets")).click(); //preferred
//driver.findElement(By.partialLinkText("tabl")).click(); //not preferred

  List<WebElement>  headerLinks  =driver.findElements(By.className("list-inline-item"));
  System.out.println("Number of Headerlinks :" + headerLinks.size());
  
  List<WebElement> links= driver.findElements(By.className("nav-item"));
  System.out.println("Number of links:" + links.size());
  
  //To find total number of links in the webpage and print the name of the links
  //Tagname
  
  List<WebElement> totallinks= driver.findElements(By.tagName("a"));
  System.out.println(totallinks.size());
  
  for( WebElement links1:totallinks)
  {
	  System.out.println(links1.getText());
  }
  
  //To find total images in the webpage
//List<WebElement>  images=driver.findElements(By.tagName("img"));
//System.out.println("Total images"  +images.size());
  
  List<WebElement> images=driver.findElements(By.tagName("img"));		
	System.out.println("Number of images:"+images.size()); //18;
	
	driver.close();
  
  }
  
  
	

		 
		 
		
		
	}

