package day20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*Testcase1
1.Launch the browser
2.Open the URL https://www.opencart.com/
3.Verify  the title  "OpenCart - Open Source Shopping Cart Solution"*/


public class Firsttestcase {

	public static void main(String[] args) {
		
		//1.Launch the browser
		
		ChromeDriver driver=new ChromeDriver();//default constructor is invoked automatically launch the browser/
		
	//	EdgeDriver driver=new EdgeDriver();
		
		
		//2.open the URL
		
		driver.get("https://www.opencart.com/");
		//3.Verify  the title  "OpenCart - Open Source Shopping Cart Solution"*/
	String actualtitle=	driver.getTitle();
if(actualtitle.equals("OpenCart - Open Source Shopping Cart Solution"))
{
	System.out.println("TestPassed");
}
else
{
	System.out.println("Test Failed");
}
driver.quit();
	

	}
	

}
