package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import functionLibrary.*;


public class loginApplication2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = Utilities.webDriverInitialize("firefox");
		driver.get("https://uat.ahpadmin.testing.amadeus.com");
		LoginPage objLogin = new LoginPage(driver);
		Utilities.setExcelFile("C:/Users/shubham.a.shukla/git/Amadeus_GRS/DataSheet.xlsx");
		String userName = Utilities.getCellData(1,0);
		String officeId = Utilities.getCellData(1,1);
		String password = Utilities.getCellData(1,2);
		objLogin.loginUser(userName, officeId, password);	
		HomePage objhomePage = new HomePage(driver);
//		Menubar_Navigation h = new Menubar_Navigation();
		objhomePage.getNavigationbar().navigate_to_brands();
		
	}
}
