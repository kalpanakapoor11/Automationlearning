package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestResizable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/resources/demos/resizable/default.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement resizable=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(resizable,200, 200).perform();
		
		driver.quit();
		
	

	}

}
