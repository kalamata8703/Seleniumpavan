package day22;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


/*Open application "https://www.demoblaze.com/index.html"

1) Total number of links & print them
2) Total number of images
3) Click on Any product link using linkText /partialLinkText

*/

public class LocatorsAssignment {

	public static void main(String[] args) {
		
		//Launch browser
		
		WebDriver driver=new ChromeDriver();
		
	//Get the URL
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.findElement(By.linkText("")).click();
		
		//Total number of links and print them
		
		
	List<WebElement >Totallinks	=driver.findElements(By.className("nav-link"));
	System.out.println(Totallinks.size());
	List<WebElement> Totalimages	=driver.findElements(By.tagName("img"));
	System.out.println(Totalimages.size());

	//driver.findElement(By.linkText("\"prod.html?idp_=4\"")).click();
	}

}
