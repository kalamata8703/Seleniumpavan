package day29;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxes {

	public static void main(String[] args) 
	{
		
try
{
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

//To handle specific checkbox
//driver.findElement(By.xpath("//input[@id='tuesday']")).click();

//To select all multiple checkboxes
 List<WebElement> chkbox =driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
 System.out.println("Total checkboxes "+ chkbox.size());
 
 //To select all checkboxes
 /* for( WebElement checkinput:chkbox)
	  
  {
	  checkinput.click();
  }
 for(int i=0;i<chkbox.size();i++)
 {
	 chkbox.get(i).click();
 }
 
 //To select last 3 checkboxes
 //Total noof checkboxes-3=4
 
 for(int i=4;i<chkbox.size();i++)
 {
	 chkbox.get(i).click();
 }*/
 //select first 3 checkboxes
 for(int i=0;i<=2;i++)
 {
	 chkbox.get(i).click();
 }
 Thread.sleep(5000);
 //Unselect checkboxes that was selected before
 for(WebElement checkbox:chkbox)
 {
	 if(checkbox.isSelected())
	 {
		 checkbox.click();
	 }
 }

}
catch(Exception e) {

	}

}
}
