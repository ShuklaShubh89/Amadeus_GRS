package functionLibrary;
import org.openqa.selenium.WebDriver;

import pageObjects.*;

public class Menubar_Navigation {

		WebDriver  driver;
		HomePage objhomepage = new HomePage(driver);
		
		
    public void navigate_to_brands(){    	
    	objhomepage.getLnk_grsSetup().click();
    	objhomepage.getLnk_brands().click();  	
	    }
    
    public void navigate_to_regions(){
    	objhomepage.getLnk_grsSetup().click();
    	objhomepage.getLnk_regions().click();
    }
    
    public void navigate_to_currency(){
    	objhomepage.getLnk_grsSetup().click();
    	objhomepage.getLnk_regions().click();
    }
    
    public void navigate_to_marketCodes(){
    	objhomepage.getLnk_grsSetup().click();
    	objhomepage.getLnk_marketCodes().click();
    }
    
    public void navigate_to_manageProperties(){
    	objhomepage.getLnk_grsSetup().click();
    	objhomepage.getLnk_myhotel_submenu().click();
    }
}
