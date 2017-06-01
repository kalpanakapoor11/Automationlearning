package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/kukks/Selenium Learning/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).sendKeys("Dansk");
		WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]"));
		Select sel =new Select(dropdown);
		//sel.selectByVisibleText("Dansk");
		sel.selectByValue("hi");
		//System.out.println(sel.getOptions().size());
		//0 to length-1, list - size-1
		
		/*List<WebElement> value=driver.findElements(By.tagName("Option"));
		System.out.println("Total value are: "+value.size());
		for(int i=0;i<value.size();i++) {
			System.out.println("value is: "+value.get(i).getText());
		}
		System.out.println("print all the links on the page-----");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			System.out.println("Links is: "+link.getText()+"url is: "+link.getAttribute("href"));
		}*/
		
		WebElement section= driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
		List<WebElement> All_link=section.findElements(By.tagName("a"));
		System.out.println(All_link.size());
		for(WebElement link:All_link) {
			System.out.println("Links is: "+link.getText()+"url is: "+link.getAttribute("href"));
		}
		
		
		
		driver.quit();
		
		

	}

}
