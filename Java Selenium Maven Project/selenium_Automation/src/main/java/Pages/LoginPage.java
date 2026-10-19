package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	private WebDriver driver;
	
	private By userNameText=By.id("Email");
	private By passwordText=By.id("Password");
	private By LoginButton=By.id("//button[@type=\"submit\"]");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void UserNameField(String userName)
	{
		driver.findElement(userNameText).clear();
		driver.findElement(userNameText).sendKeys(userName);
	}
	
	public void PasswordField(String password)
	{
		driver.findElement(passwordText).clear();
		driver.findElement(passwordText).sendKeys(password);
	}
	
	public void LoginButtonClick()
	{
		driver.findElement(LoginButton).click();
		
	}
	
}
