package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePage;
import functionLibrary.*;

public class AssignCountriestoGeographicalRegions {

	
	

	 public void regionAssignCountriesMoveCountries() throws Exception{
		 
		 /* Local Variables*/
		 String countryName;
		 String regionFromMove;
		 String regionToMove;
		 String countries_sheet;
		 String countries[] = new String[15];

		 	
		 	// Instantiate the Web Driver
			WebDriver driver = Utilities.webDriverInitialize("firefox");
			
			tableUtilities tableUtilities = new tableUtilities(driver);

			// Open the URL for the Application
			driver.get("https://uat.ahpadmin.testing.amadeus.com/#/home");

			// Login the Application
			Utilities.loginApp(driver);
			
			WebDriverWait wait = new WebDriverWait(driver,60);
			
			// Click on the Navigation Sidebar
			(wait).until(ExpectedConditions.elementToBeClickable(By.id("sidebar-button")));
			HomePage objHomepage = new HomePage(driver);
			objHomepage.getNavigationbar();
					
			/* Navigate to the Manage Regions List Screen*/ 
			Menubar_Navigation navigate = new Menubar_Navigation(driver);
			navigate.navigateToManageRegionsListScreen();
		 
	    	Utilities.setExcelFile("C:/Users/t.b.garg.GDNINDIA/Desktop/amdaeus_grs/Amadeus_GRS/DataSheet.xlsx",1);
    		
	    	regionFromMove = Utilities.getCellData(1, 0);
	    	regionToMove = Utilities.getCellData(1, 1);
			
	    	countries_sheet = Utilities.getCellData(1, 2);
			countries = countries_sheet.split(",");
			
			tableUtilities.moveCountry(countries, regionFromMove, regionToMove);
			
			
			}
		 
		  
		 /* countryName = tableUtilities.getTableText(2,1,driver);
		  countryCountBeforeMoveCountries = Integer.parseInt(tableUtilities.getTableText(2,2,driver));
		  countryCountAfterMoveCountries = Integer.parseInt(tableUtilities.getTableText(6,2,driver));
		  if (countryName == "Another Test Region"){
			  System.out.println("The Region selected is Another Test Region");
			  } 
		  else{
			  System.out.println("The selected Region is not Another Test Region"); 
		  }
		  
		  WebElement accordion = driver.findElement(By.xpath(".//*[@id='region-grid']/div/table/tbody/tr[4]/td[1]/a"));
		  accordion.click();
		  WebElement moveCountries = driver.findElement(By.xpath(".//*[@id='region-grid']/div/table/tbody/tr[4]/td[5]/button[2]"));
		  moveCountries.click();
		  WebElement selectCountry = driver.findElement(By.xpath(".//*[@id='input-country-AF']"));
		  selectCountry.click();

		  Select selectAssignTo = new Select(driver.findElement(By.id("sel-region")));
		  selectAssignTo.selectByValue("Thai Region");
		  WebElement saveButton = null;
		  saveButton.click();
		  countryCountOldRegion = Integer.parseInt(tableUtilities.getTableText(2,2,driver));
		  countryCountNewRegion = Integer.parseInt(tableUtilities.getTableText(6,2,driver));
		  if(countryCountBeforeMoveCountries-countryCountOldRegion == 1){
			  System.out.println("The Countries were moved from the current Region");
		  }
		  else{
			  System.out.println("The Countries were not moved from the current Region");
		  }
		  if (countryCountNewRegion - countryCountBeforeMoveCountries == 1){
			  System.out.println("The Countries were moved to the new Region");
		  }
		  else{
			  System.out.println("The Countries were not moved to the new Region");
		  }*/
			
			
	 


	 public void regionAssignCountriesMultipleAssociation(String Region, String[] countries, String newRegion){ 
		 /* Local Variables*/
		 String countryName;
		 int countryCountBeforeMoveCountries;
		 int countryCountAfterMoveCountries;
		 int countryCountOldRegion;
		 int countryCountNewRegion;
		 
		// Instantiate the Web Driver
		WebDriver driver = Utilities.webDriverInitialize("firefox");
		 
		 /* Navigate to the Manage Regions List Screen*/ 
		 Menubar_Navigation navigate = new Menubar_Navigation(driver);
		 navigate.navigateToManageRegionsListScreen();
		 
		 /* Access the tableUtilities function to get to the Region*/ 

	 	countryName = tableUtilities.getTableText(2,1);
		 countryCountBeforeMoveCountries = Integer.parseInt(tableUtilities.getTableText(2,2));
		 countryCountAfterMoveCountries = Integer.parseInt(tableUtilities.getTableText(6,2));
		 if (countryName == "Another Test Region"){
		  System.out.println("The Region selected is Another Test Region");
		  } 
	  else{
		  System.out.println("The selected Region is not Another Test Region");
	  }
	  
	  WebElement accordion = driver.findElement(By.xpath(".//*[@id='region-grid']/div/table/tbody/tr[4]/td[1]/a"));
	  accordion.click();
	  WebElement moveCountries = driver.findElement(By.xpath(".//*[@id='region-grid']/div/table/tbody/tr[4]/td[5]/button[2]"));
	  moveCountries.click();
	  WebElement selectCountry = driver.findElement(By.xpath(".//*[@id='input-country-AF']"));
	  selectCountry.click();
	  WebElement selectCountry2 = driver.findElement(By.id("input-country-IE"));

	  Select selectAssignTo = new Select(driver.findElement(By.id("sel-region")));
	  
	 // selectAssignTo.getOptions().
	 // WebElement saveButton = null;
	  //saveButton.click();
	 // countryCountOldRegion = Integer.parseInt(tableUtilities.getTableText(2,2));
	 // countryCountNewRegion = Integer.parseInt(tableUtilities.getTableText(6,2));
	/*  if(countryCountBeforeMoveCountries-countryCountOldRegion == 1){
		  System.out.println("The Countries were moved from the current Region");
	  }
	  else{
		  System.out.println("The Countries were not moved from the current Region");
	  }
	  if (countryCountNewRegion - countryCountBeforeMoveCountries == 1){
		  System.out.println("The Countries were moved to the new Region");
	  }
	  else{
		  System.out.println("The Countries were not moved to the new Region");
	  }
*/

}
}