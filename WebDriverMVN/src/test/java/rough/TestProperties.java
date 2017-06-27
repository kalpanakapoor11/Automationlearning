package rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.MonitoringMail;
import utilities.TestConfig;

public class TestProperties {
	
	public static WebDriver driver;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static MonitoringMail mail=new MonitoringMail();
	
	
	
	public static void captureScreenShot() throws IOException {
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("/home/kukks/Selenium Learning/Screenshots/error.jpg"));
		
	}

	public static void main(String[] args) throws IOException, AddressException, MessagingException {
		
		try {
		Properties OR=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/OR.properties");
		OR.load(fis);
		log.debug("OR properties loaded");
		System.out.println(OR.getProperty("usernameXpath"));
		
		Properties Config=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Properties/Config.properties");
		Config.load(fis);
		log.debug("config properties loaded");
		System.out.println(Config.getProperty("testsiteurl"));
		
		if(Config.getProperty("browser").equals("Firefox")) {
			driver=new FirefoxDriver();
		}else if(Config.getProperty("browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/Executables/chromedriver");
			driver=new ChromeDriver();
			log.debug("Chrome launched");
		}else if(Config.getProperty("browser").equals("ie")) {
			System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
			driver=new ChromeDriver();
	}

		driver.get(Config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("Implicitwait")), TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(OR.getProperty("usernameXpath"))).sendKeys("kd.roopak@gmail.com");
		driver.findElement(By.id(OR.getProperty("NextbtnId"))).click();
		driver.findElement(By.name(OR.getProperty("password"))).sendKeys("Abcdef1234#");
		//driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		
		
		driver.findElement(By.xpath(OR.getProperty("Submitbtn"))).click();
		log.debug("Test done");
		driver.quit();
		}catch(Throwable t) {
			
			captureScreenShot();
			log.debug(t.getMessage());
			mail.sendMail(TestConfig.server,TestConfig.from , TestConfig.to, TestConfig.subject, t.getMessage(), TestConfig.attachmentPath, TestConfig.attachmentName);

			
		}
		
}}
