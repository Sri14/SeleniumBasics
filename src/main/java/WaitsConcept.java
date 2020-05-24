import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsConcept {

	public static void main(String[] args) throws InterruptedException {
		// implicit waits - wait if the element is not found and applies to all elements in code.
		// explicit waits - only for a particular element 
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.get("https://google.co.uk");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("asadsasdsa")));
		//Thread.sleep(5000);
		driver.findElement(By.id("asadsasdsa")).click();
		
		
	}

}
