package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import functionLibrary.Utilities;
import pageObjects.LoginPage;

public class loginApplication2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = Utilities.webDriverInitialize("firefox");
		driver.get("https://uat.ahpadmin.testing.amadeus.com");
		Thread.sleep(20000);
		LoginPage objLogin = new LoginPage(driver);
		//WebDriverWait wait  = new WebDriverWait(driver,30);
		Utilities.setExcelFile("C:/Users/shubham.a.shukla/workspace/Amadeus_GRS/DataSheet.xls");
		String userName = Utilities.getCellData(1, 1);
		System.out.println(userName);
		objLogin.txt_UserName.sendKeys("userName");	
		
	}

}
