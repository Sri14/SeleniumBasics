package firstSession;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumStuff {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.co.uk/");
		
		driver.manage().deleteAllCookies(); //deletes cookies for window
		driver.manage().window().maximize(); // Maximise the page

		String actualTitle = driver.getTitle();
	
		String exptectedTitle = "Google";
		
		Assert.assertEquals(exptectedTitle, actualTitle); // check expected vs actual - this case is for title
	}
}
