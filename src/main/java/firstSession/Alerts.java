package firstSession;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize(); // maximize the browser window
		driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		Thread.sleep(2000); // wait for  2 seconds

		Alert pop = driver.switchTo().alert(); // Alert class for handlings pop ups.

		
		String mes = pop.getText();
		//System.out.println(mes);
		Assert.assertEquals(mes, "Please enter a valid user name"); // to verify the actual with expected

		pop.accept(); // clicks on OK
		//pop.dismiss(); // clicks x symbol
		driver.quit(); // quits the browser

	}

}
