package play;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//waits for 5 seconds if the element is not visible and its lasts for all sessions
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.google.co.uk");
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("q")));
		driver.findElement(By.id("q")).sendKeys("Hello");

	}

}
