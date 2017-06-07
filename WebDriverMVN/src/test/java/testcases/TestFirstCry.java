package testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestFirstCry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ProfilesIni list=new ProfilesIni();
		//FirefoxProfile profile= list.getProfile("default");
		
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.firstcry.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Set<String> winid=driver.getWindowHandles();
		Iterator<String> iterate=winid.iterator();
		String first_window=iterate.next();
		driver.switchTo().window(first_window);
			
		driver.switchTo().frame("iframe_Login");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("kd.roopak");
		//driver.switchTo().window(first_window);
		driver.switchTo().defaultContent();
		
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for(WebElement frame:frames) {
			System.out.println(frame.getAttribute("id"));
		}
		driver.quit();
		
		
		
	}

}
