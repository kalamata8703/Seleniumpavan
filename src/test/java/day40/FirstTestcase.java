package day40;

import org.testng.annotations.Test;

/*
 * open the application
 * 2)Login
 * 3)Logout
 * 
 */



public class FirstTestcase {
	
	@Test(priority=30)
	
	void openApp()
	{
		
		System.out.println("opening application");
	}
	@Test(priority=20)
	void login()
	{
		System.out.println("Login to application");
		
	}
	@Test(priority=1)
	
	void logout()
	{
		System.out.println("logout application");
	}

}
