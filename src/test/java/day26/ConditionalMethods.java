package day26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//isDisplayed
		// boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		// System.out.println("logo status " + status);
		
//or
	WebElement	status= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	System.out.println("logo status " + status.isDisplayed());
	
	//is Enabled
boolean	sta=driver.findElement(By.name("q")).isEnabled();
System.out.println(sta);



	
	}

}
