package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://gmail.com");
		driver.navigate().to("http://gmail.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String Actual_title=driver.getTitle();
		String Expected_title="Gmail";
		System.out.println(Actual_title.length());
		
		if(Actual_title.equals(Expected_title)){
			
			System.out.println("Test case pass");
		}else
			System.out.println("Test case fail");
		
		driver.quit();
		
		

	}

}
