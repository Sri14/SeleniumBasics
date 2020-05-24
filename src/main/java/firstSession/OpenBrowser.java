package firstSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

		
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); // chrome driver setup using webdriver manager
		WebDriverManager.firefoxdriver().setup(); // fire fox setup using webdriver manager
		
	//	System.setProperty("webdriver.chrome.driver", "/Users/sankara.tatavarty/Downloads/chromedriver"); 
		// This is the old way where you download the chromedriver and set a location
		// Instead use WebDriverManager
		
		//WebDriver driver = new FirefoxDriver(); // this is to run on firefox
		WebDriver driver = new ChromeDriver(); // this is to run on chrome
		
//		driver.get("https://www.facebook.com"); // get is used to website you want visit. (URL you want to visit)
//		driver.findElement(By.id("email")).sendKeys("hello");
//		driver.findElement(By.id("pass")).sendKeys("kwhqe");
		// Element identification:
		//on browser enable developer tools and search for element
		// use ID when ever there is one available. 
		//	use class when ever there is one available
		// if not use xpath to identify elements.
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
	
		
		}

}
