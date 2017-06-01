package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAuthenticationAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://grcdev:nearlythere@getproactiv.ca.stg01.grdev.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
																																																																																																																																																	}

}
