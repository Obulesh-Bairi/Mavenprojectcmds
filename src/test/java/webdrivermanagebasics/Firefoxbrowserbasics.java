package webdrivermanagebasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefoxbrowserbasics {

	public static void main(String[] args) {

		System.setProperty("Firefoxdriver.Firefox.driver", "C:\\Users\\user\\Downloads\\Firefox Installer\\setup-stub.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/Downloads/Sample%20HTML%20Web%20Pages-20230207T063426Z-001/Sample%20HTML%20Web%20Pages/SampleWebpage.html");
			
		
		WebDriverManager.firefoxdriver().setup();
		
		WebElement Elecheckbox = driver.findElement(By.id("//input[@id='eleId']"));
		Elecheckbox.click();
		
		WebElement cmptrcheckbox = driver.findElement(By.id("//input[@id='cid']"));
		cmptrcheckbox.click();
		
		
	}

}
