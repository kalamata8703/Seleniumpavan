package day24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Xpathlocators {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		//get the url
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='imgs/galaxy_s6.jpg']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add to cart")).click();
		

	}

}
