package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
//1.	 by using the locators: id, name,class, link, partiallink test,cssSelector,tagname)
	
	
	//find by ("locatorname = loc val")
	@FindBy (name="username")
	public WebElement username_Txebox;
	
	//pswd
	@FindBy(name="password")
	public WebElement password_Txtbox;
	
	// login btn
//	@FindBy(className="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement login_Btn;
	
	
	
	//2.   by using one constructor
	
	public LoginPage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this); // by usng this keyword
		//using 
//		driver.findElement(null).sendKeys("Admin");
//		driver.findElement(null).sendKeys("admin123");
//		driver.findElement(null).click();
//		
	}
	
//	driver.findElement(null).sendKeys("Admin");  username
	public void Username(String value)
	{
	//	username_Txebox.sendKeys("Admin");
		username_Txebox.sendKeys("value");
	}
	
//	driver.findElement(null).sendKeys("admin123");   pswd
	
	public void password(String value)
	{
	//	password_Txtbox.sendKeys("admin123");
		password_Txtbox.sendKeys("");
	}
	
//	driver.findElement(null).click();   cliik btn
	
	public void clickLoginbutton()
	{
		login_Btn.click();
	}



	
	

}
