package day20;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*1) Launch browser (chrome)
2) Open URL  https://demo.nopcommerce.com/
3) Validate title should be   "nopCommerce demo store"
4) close page
*/
public class Secondtestcase {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		String actual_title=driver.getTitle();
		if(actual_title.equals("nopCommerce demo store"))
		{
			System.out.println("Test passed");
		}
		else 
		{
			
			System.out.println("Test failed");
			
			
		}
		
		driver.close();
		
	}

}
