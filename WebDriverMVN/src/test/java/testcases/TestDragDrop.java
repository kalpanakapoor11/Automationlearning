package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement draggable=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();
		
		//driver.quit();

	}

}
