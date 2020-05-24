import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunHeadless {

	public static void main(String[] args) throws Exception {
		
		
		//running chrome headless
		//user class provided ChromeOPtions 
		//addArguments("headless")
		//pass the chromeOPtions reference variable into ChromeDriver
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions driver1 = new ChromeOptions();
		driver1.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(driver1);
		
		driver.get("https://www.google.co.uk");
		System.out.println("*******open browser********");
		driver.findElement(By.name("q")).sendKeys("Manchester");
		Thread.sleep(2000);
		System.out.println("***************typed manchester***************");
		
		driver.quit();
		System.out.println("**********closed Browser************");
	}

}
