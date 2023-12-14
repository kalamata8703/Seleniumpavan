package day31;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
       
        //Capturing the webelement storing in a variable
   WebElement   dropdown = driver.findElement(By.id("country"));
   //using Select class constructor passing the parameters
   Select drpdwn=new Select(dropdown);
   
   //select option from dropdown
   
   //drpdwn.selectByVisibleText("Germany");
   //drpdwn.selectByValue("UnitedStates");
   //drpdwn.selectByIndex(5);
   
   //Total numberof options
 List<WebElement>option = drpdwn.getOptions();
 System.out.println("Total number of options " + option.size());
 
 //To display options we use forloop
 for(int i=0;i<option.size();i++) 
 {
	
	System.out.println(option.get(i).getText());
	
	
 }
 //using enhanced for loop
 for(WebElement opt:option)
 {
	 System.out.println(opt.getText());
 }

	}

}
