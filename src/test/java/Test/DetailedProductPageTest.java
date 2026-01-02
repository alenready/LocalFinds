package Test;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.DetailedProductPage;
import Pages.LoginInvalid;

public class DetailedProductPageTest extends BaseTest {
	@Test
	
	public void setup()
	{
		driver = new ChromeDriver();
		
		// Open One product detaile page
		driver.get("https://localfinds-two.vercel.app/product/6916bcef39f67b620c461639");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
	}

}


