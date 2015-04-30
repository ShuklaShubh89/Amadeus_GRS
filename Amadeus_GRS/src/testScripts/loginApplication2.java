package testScripts;

import org.openqa.selenium.By;
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
		driver.get("https://uat.ahpadmin.testing.amadeus.com/#/home");
		LoginPage objLogin = new LoginPage(driver);
		Utilities.setExcelFile("C:/Users/shubham.a.shukla/git/Amadeus_GRS/DataSheet.xlsx");
		String userName = Utilities.getCellData(1, 1);
		System.out.println(userName);
		objLogin.loginUser("superuser", "ATL6C4800", "superuser!1");	
		Menubar_Navigation menuBar = new Menubar_Navigation(driver);
		HomePage objhomepage =  new HomePage(driver);		 
		objhomepage.getNavigationbar();
		menuBar.navigateToBrands();
		int colcount = tableUtilities.tableRetrieveColCount(driver);
		int rowcount = tableUtilities.tableRetrieveRowCount(driver);
		String textret = tableUtilities.getTableText(3, 2, driver);
		System.out.println("the rows are"+ rowcount+ " the columns are = "+colcount+ " the text returned is "+textret);
		tableUtilities.clickElementRow("U_ASIA", driver);
		
		
	}
}
