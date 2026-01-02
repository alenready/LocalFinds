package Test;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginInvalid;



public class LoginInvalidTest extends BaseTest {

	
			@Test
		public void logintest() {
		
				LoginInvalid sign= new LoginInvalid(driver);
			sign.LoginInvalid1();	
	}

}
