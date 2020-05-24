package firstSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Threads {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("batchautomation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.close();
//		driver.quit();

//a[@title='Contacts']

//*[@id="navmenu"]/ul/li[4]/a

//Elements are very dynamic – 

//a[contains(text(),’Pipeline’)]
//a[starts-with(@title, 'Pip')]

	}

}
