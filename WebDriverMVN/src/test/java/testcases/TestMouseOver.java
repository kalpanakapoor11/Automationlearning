package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestMouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement menu=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a"));
	
		Actions act=new Actions(driver);
		act.moveToElement(menu).perform();
		driver.findElement(By.linkText("Shirts")).click();
		
		
	

	}

}
