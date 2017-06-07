package testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTabAndPopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for(WebElement frame:frames) {
			System.out.println(frame.getAttribute("id"));
		}*/
		System.out.println("printing first window id");
		Set<String> winid=driver.getWindowHandles();
		Iterator<String> iterate=winid.iterator();
		String first_window=iterate.next();
		System.out.println(first_window);
		driver.switchTo().window(first_window);
		
		driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
		System.out.println("printing second window id");
		winid=driver.getWindowHandles();
		iterate=winid.iterator();
		first_window=iterate.next();
		String second_window=iterate.next();
		System.out.println(second_window);
		driver.switchTo().window(second_window);
	
		driver.findElement(By.xpath("html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/p[3]/a")).click();
		System.out.println("printing third window id");
		winid=driver.getWindowHandles();
		iterate=winid.iterator();
		first_window=iterate.next();
		second_window=iterate.next();
		String third_window=iterate.next();
		System.out.println(third_window);
		driver.switchTo().window(third_window);
		System.out.println(driver.getTitle().contains("JetPrivilege HDFC Bank World Chip Debit Card"));
		System.out.println("done");
		driver.quit();
		
		
	}

}
