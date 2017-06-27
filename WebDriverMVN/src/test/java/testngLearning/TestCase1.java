package testngLearning;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeSuite
	public void CreateDBConn() {
		System.out.println("Create DB Conn");
	}
	@AfterSuite
	public void CloseDBConn() {
		
		System.out.println("Close DB connection");
	}
	
	@BeforeMethod
	public void  LaunchBrowser(){
	System.out.println("Launching browser");	
	}
	
	@Test(priority=1,groups="high")
	public void doUserReg() {
		System.out.println("Executing User Reg test");
	}
	
	@Test(priority=1,groups="medium")
	public void doLogin() {
		System.out.println("Executing Login test");
	}
	@AfterMethod
	public void CloseBrowser() {
		System.out.println("Closing the browser");
	}

}
