package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindingElements {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webDriver.chrome.driver","/home/kukks/Selenium Learning/chromedriver");
		System.setProperty("webdriver.chrome.driver","/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement username=driver.findElement(By.id("identifierId"));
		//username.sendKeys("kd.roopak@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("kd.roopak@gmail.com");
		
		//WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		//nextbtn.click();
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("gjjkhgkjj");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, 5);
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[2]/div[2]"))).getText());		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"password\"]/div[2]/div[2]")).getText());	
		
		driver.quit();

	}

}
