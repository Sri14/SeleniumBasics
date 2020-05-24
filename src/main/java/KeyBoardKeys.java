import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardKeys {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		ChromeOptions driver1 = new ChromeOptions();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.uk");
		
		driver.findElement(By.name("q")).sendKeys(Keys.SHIFT," manchester");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
		
	}

}
