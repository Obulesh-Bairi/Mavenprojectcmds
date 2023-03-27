package OrangeHRMSTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;

public class LoginTC01 {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\\\chromedriver.exe");
		
		//open chrome browser
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		
//		//call open browser() from test base clss
//		TestBase tb = new TestBase();
//		
//		
//		// open login page class  varibles  + methods
//			LoginPage lpage = new LoginPage();
//		
		
		
	}
}
