package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import functionLibrary.Utilities;
import pageObjects.LoginPage;

public class login_Application {

		WebDriver driver;
		LoginPage objLogin;
		
		@BeforeTest     
		public void setup(){   
			
			driver = Utilities.webDriverInitialize("firefox");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         
			driver.get("https://uat.ahpadmin.testing.amadeus.com");     
			}    
		
		@Test(priority=0)     
		public void test_login_application(){
			//Create Login Page object     
			objLogin = new LoginPage(driver);
			objLogin.setUsername("");
		}


		@AfterTest     
		public void teardown(){
			driver.close();
		}
}
