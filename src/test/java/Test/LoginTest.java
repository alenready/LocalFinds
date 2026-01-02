package Test;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest

	@Test
	public void logintest() {
	
	LoginPage sign= new LoginPage();
		sign.Loginvalid();	
}
