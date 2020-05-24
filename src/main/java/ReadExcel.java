import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel {

	static WebDriver driver;
	
	public static void excelSetup() throws Exception {
		
//to get data from excel sheets 
// step1 - store the excel sheet in our project
// Step2 - get poi-ooxml dependecy for maven
// - get path of your directory from 	System.getProperty("user.dir")	
// Step3 - create an object of XSSFWorkBook and pass the path/ location of the excel sheet
// Step4 - cretae an object of XSSFSheet and pass the sheetname in Woorkbook.getSheet("");
		
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
			
		XSSFWorkbook workBook = new XSSFWorkbook(path+"/Book2.xlsx");
		XSSFSheet sheet = workBook.getSheet("Users");
		
			String name1 = sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println(name1);
			
			
	}
	
		public static void openBrowser() {
			WebDriverManager.chromedriver().setup();

			 driver = new ChromeDriver();

			driver.get("https://www.facebook.com");
		}
	
		public static void username(int x, int y) throws Exception {
			String path = System.getProperty("user.dir");
			System.out.println(path);
				
			XSSFWorkbook workBook = new XSSFWorkbook(path+"/Book2.xlsx");
			XSSFSheet sheet = workBook.getSheet("Users");
			
			String name1 = sheet.getRow(x).getCell(y).getStringCellValue();
		
			driver.findElement(By.id("email")).sendKeys(name1);
		}
		
		public static void address(int x, int y) throws Exception {
			String path = System.getProperty("user.dir");
			System.out.println(path);
				
			XSSFWorkbook workBook = new XSSFWorkbook(path+"/Book2.xlsx");
			XSSFSheet sheet = workBook.getSheet("address");
			String add = sheet.getRow(x).getCell(y).getStringCellValue();
			driver.findElement(By.id("email")).sendKeys(add);
		}

}
