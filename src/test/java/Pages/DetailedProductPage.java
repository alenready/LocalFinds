package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DetailedProductPage {

	



	protected WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		
		// Open One product detaile page
		driver.get("https://localfinds-two.vercel.app/product/6916bcef39f67b620c461639");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}

