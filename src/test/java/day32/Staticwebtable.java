package day32;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Staticwebtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Find total number of rows in a table and find total number of columns
 int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
System.out.println("Total rows " + rows);
 int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
System.out.println("Total columns " + columns);
		
//Read the specific row and columns
 String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[3]")).getText();
 System.out.println(bookname);
 
 //Read all the data from the table or read from rows and columns
 for(int r=2;r<=rows;r++)
 {
	 for(int c=1;c<=columns;c++) 
	 {
		 String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();//to pass a values in a xpathvariable the syntax
System.out.print(values + "  ");//To print in table format

	 }
	 System.out.println( );
 }
 
 
 //Get the data based on condition
 //Get the booknames whose author is mukesh
 
 for(int r=2;r<=rows;r++)
 {
	 for(int c=1;c<=columns;c++)
	 {
		 String Authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
		 //to pass a values in a xpathvariable the syntax
      //System.out.println(values1);
      if(Authorname.equals("Mukesh"))
      {
			String bookname1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			System.out.println(bookname+"       "+Authorname);
		}
					
	}
	
	
	//6) find total price of all the books
	int total=0;
	for(int r1=2;r1<=rows;r1++)
	{
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
		total=total+Integer.parseInt(price);
	}
	
	System.out.println("Total price of books:"+ total);  //7100

}
}
      

    	  
		 
	 
 

 

	}


