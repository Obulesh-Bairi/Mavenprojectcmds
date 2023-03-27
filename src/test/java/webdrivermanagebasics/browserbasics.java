package webdrivermanagebasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserbasics {

	public static void main(String[] args) {

		System.setProperty("chromedriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Downloads/Sample%20HTML%20Web%20Pages-20230207T063426Z-001/Sample%20HTML%20Web%20Pages/SampleWebpage.html");
			
		
		WebDriverManager.chromedriver().setup();
		
		WebElement Elecheckbox = driver.findElement(By.id("//input[@id='eleId']"));
		Elecheckbox.click();
		
		WebElement cmptrcheckbox = driver.findElement(By.id("//input[@id='cid']"));
		cmptrcheckbox.click();
		
		
	}

}
