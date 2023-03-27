package webdrivermanagebasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEdriversetupbasics {

	public static void main(String[] args) {
		
		
		System.setProperty("InternetExplorerdriver.InternetExplorer.driver", "C:\\Users\\user\\Downloads\\IEDriverServer_x64_4.8.1\\IEDriverServerdriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		WebDriverManager.iedriver().setup();
		
		driver.get("file:///C:/Users/user/Downloads/Sample%20HTML%20Web%20Pages-20230207T063426Z-001/Sample%20HTML%20Web%20Pages/SampleWebpage.html");
		
		WebElement elechekbox =  driver.findElement(By.id("//input[@id='eleId']"));
		elechekbox.click();
		
		WebElement cmptrchekbox = driver.findElement(By.id("//input[@id='cid']"));
		cmptrchekbox.click();
	}

}
