import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadConfig {

	public static void main(String[] args) throws IOException {

		//create a .properties file
		// give key value pairs
		// create an object of Properties
		// Create an object of FileInputStream and pass the path of the porperties file
		// prop.load(path)
		// start using prop.getPretperty(key)
		// In properties file you can store the element identifiers 

		String myproject = System.getProperty("user.dir");
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(myproject+"/config1.properties");
		prop.load(ip);
		
		String user = prop.getProperty("username");
		System.out.println(user);
		
		//String myWebsite = prop.getProperty("url");
		
		
		String userField = prop.getProperty("userField");
		System.out.println(userField);
		System.out.println(prop.getProperty("url"));
		
		String passwordBox = prop.getProperty("passwordBox");
				
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		//driver.findElement(By.id(userField)).sendKeys(user);
		driver.findElement(By.id("email")).sendKeys("kjaHSKJDAS");
		driver.findElement(By.id(passwordBox)).sendKeys("asdasd");
		
		
	}

}
