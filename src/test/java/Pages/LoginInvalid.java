package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginInvalid {

	WebDriver driver;
	
	public LoginInvalid(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@Test
	public void LoginInvalid1() {
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("agals");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("1234");
		WebElement signin = driver.findElement(By.name("submit"));
		signin.sendKeys();	
		
		
				
				
		
	}
	}

	
	

