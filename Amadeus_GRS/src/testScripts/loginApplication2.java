package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import functionLibrary.Utilities;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import functionLibrary.*;
public class loginApplication2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = Utilities.webDriverInitialize("firefox");
		driver.get("https://uat.ahpadmin.testing.amadeus.com");
		LoginPage objLogin = new LoginPage(driver);
		Utilities.setExcelFile("C:/Users/shubham.a.shukla/git/Amadeus_GRS/DataSheet.xls");
		String userName = Utilities.getCellData(1, 1);
		System.out.println(userName);
		objLogin.loginUser("superuser", "ATL6C4800", "superuser!1");	
		HomePage objhomepage = new HomePage(driver);
	
		//Menubar_Navigation h = new Menubar_Navigation();
		objhomepage.getNavigationbar().navigate_to_brands();

	}
}
