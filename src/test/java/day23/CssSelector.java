package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class CssSelector {

	public static void main(String[] args) {
		
		//To launch browser
		WebDriver driver=new ChromeDriver();
		//To get the url
		
	driver.get("https://demo.nopcommerce.com");
	
	driver.manage().window().maximize();
	
	//tag #id
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
	//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
	
	//tag .class
	//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
//	driver.findElement(By.cssSelector(".button-1")).click();
	
	//tag []attribute
	//driver.findElement(By.cssSelector("[name=q]")).sendKeys("Tabs");
	
	
	//tag .(class) [ ]attribute
	
	driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("tabs");
	
	

	
		
		

	}

	

}
