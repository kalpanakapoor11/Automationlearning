package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestEnterButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("kd.roopak");
		driver.findElement(By.xpath(".//*[@id='initialView']/div[2]")).click();		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		driver.findElement(By.xpath(".//*[@id='identifierId']")).click();
		act.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span"))).click().perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		
		

	}

}
