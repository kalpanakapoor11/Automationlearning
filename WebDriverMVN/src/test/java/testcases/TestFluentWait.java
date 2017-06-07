package testcases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestFluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("identifier")).sendKeys("kd.roopak");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(30, TimeUnit.SECONDS)
								.pollingEvery(5,TimeUnit.SECONDS)
								.withMessage("User defined message after timeout")
								.ignoring(NoSuchElementException.class);
		//WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierNext1"))).click();	
		//driver.quit();
		
								
								
	}

}
