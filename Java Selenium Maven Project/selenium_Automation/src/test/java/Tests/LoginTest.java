package Tests;

import org.testng.annotations.Test;

import Base.BaseSetup;
import Pages.LoginPage;

public class LoginTest extends BaseSetup
{
	@Test
	public void testValidLogin()
	{
		LoginPage login=new LoginPage(driver);
		login.UserNameField("admin@yourstore.com");
		login.PasswordField("admin");
		login.LoginButtonClick();
		System.out.println("title " + driver.getTitle());
	
				
	}
	
}