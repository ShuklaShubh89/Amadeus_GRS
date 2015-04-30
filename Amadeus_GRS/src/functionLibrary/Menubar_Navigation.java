package functionLibrary;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class Menubar_Navigation {
	
		WebDriver driver;
		HomePage objhomepage;
		
		public Menubar_Navigation(WebDriver drive){
			this.driver	= drive;		
		    objhomepage = new HomePage(driver);
		}
		
    public void navigateToBrands(){
    	
    	Utilities.navigateHover(objhomepage.getLnk_grsSetup(), objhomepage.getLnk_brands(), driver);
    	
    	}


	public void navigateToManageRegionsListScreen() {
    	Utilities.navigateHover(objhomepage.getLnk_grsSetup(), objhomepage.getLnk_regions(), driver);
		
	}


	public void navigateToManageCurrencies() {
    	Utilities.navigateHover(objhomepage.getLnk_grsSetup(), objhomepage.getLnk_currency(), driver);
		
	}
	
	public void navigateToManageMarketCodes() {
    	Utilities.navigateHover(objhomepage.getLnk_grsSetup(), objhomepage.getLnk_marketCodes(), driver);

	}
	
	public void navigateToManageProperties() {
    	Utilities.navigateHover(objhomepage.getLnk_myhotel(), objhomepage.getLnk_myhotel_submenu(), driver);

	}
	
	public void navigateToEarlyDepartureFee() {
    	Utilities.navigateHover(objhomepage.getLnk_myhotel(), objhomepage.getLnk_early_departure_fee(), driver);

	}
	
	public void navigateToManageHouseRestrictions() {
    	Utilities.navigateHover(objhomepage.getLnk_myhotel(), objhomepage.getLnk_house_restrictions(), driver);

	}
	
	public void navigateToManageCancellations() {
    	Utilities.navigateHover(objhomepage.getLnk_myhotel(), objhomepage.getlnk_cancel_noshow(), driver);

	}
	
	public void navigateToManageCorporateRoomTypes() {
    	Utilities.navigateHover(objhomepage.getlnk_my_inventory(), objhomepage.getlnk_room_type_catalogue(), driver);

	}
	
	public void navigateToManageRoomClasses() {
    	Utilities.navigateHover(objhomepage.getlnk_my_inventory(), objhomepage.getlnk_room_class_setup(), driver);

	}
	
	public void navigateToSleepingRooms() {
    	Utilities.navigateHover(objhomepage.getlnk_my_inventory(), objhomepage.getlnk_room_sleepingRooms(), driver);

	}
}
