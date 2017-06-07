package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://deluxe-menu.com/popup-mode-sample.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement img=driver.findElement(By.xpath("//p[2]/img"));
		Actions act=new Actions(driver);
		act.contextClick(img).perform();
	}

}
