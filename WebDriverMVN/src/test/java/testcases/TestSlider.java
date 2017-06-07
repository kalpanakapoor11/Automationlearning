package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSlider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/resources/demos/slider/default.html");
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath(".//*[@id='slider']/span")));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		WebElement mainSlider=driver.findElement(By.xpath(".//*[@id='slider']"));
		int width=mainSlider.getSize().width/2;
		
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(slider, width, 0).perform();
	
		
		driver.quit();

	}

}
