package Test;

import java.util.logging.Handler;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
public class NavigationTest {
	
	
	
	
	
	


	public class NavigationPage extends BaseTest{


		
						WebDriver driver;
				
				public NavigationPage(WebDriver driver) {
					
					this.driver=driver;
				}
				
				@Test
				public void Navigation() {
			
			
			
					driver.get("https://localfinds-two.vercel.app/marketplace");
					driver.navigate();
						driver.get("https://localfinds-two.vercel.app/product/6916bcef39f67b620c461639");	
					
				}
				
			
				

		}




}


