package firstSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame("mainpanel"); // check the frame tag in HTML (inspect the page)
		
		driver.findElement(By.xpath("//a[@title='Companies']")).click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
