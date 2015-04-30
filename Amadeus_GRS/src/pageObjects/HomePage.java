package pageObjects;
import functionLibrary.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;  
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

		
			/**      
	     * * All WebElements are identified by @FindBy annotation      */   
	    WebDriver driver;     
	    Menubar_Navigation menubar;
	    public HomePage(WebDriver driver){	    	 
	        this.driver = driver;	
	        ElementLocatorFactory locatorWait = new AjaxElementLocatorFactory(driver, 60);
	        
	        //This initElements method will create all WebElements
	        PageFactory.initElements(locatorWait, this);
	    }
	    
	    /* The below web elements cater to the Welcome screen:*/
	    
	    @FindBy(id = "sidebar-button")    
	    private static WebElement btn_sidebar;      
	    public WebElement getBtn_sidebar() {
			return btn_sidebar;
		}

    	
		@FindBy(xpath = "//li[@id ='grs-setup']/a")	    
	    private WebElement lnk_grsSetup;
		public WebElement getLnk_grsSetup() {
			return lnk_grsSetup;
		}
	    
	    @FindBy(xpath = "//li[@id ='brands']/a")	    
	    private WebElement lnk_brands;
		public WebElement getLnk_brands() {
			return lnk_brands;
		}
	    
		@FindBy(xpath = "//li[@id ='regions']/a")	    
		private WebElement lnk_regions;
		public WebElement getLnk_regions() {
		return lnk_regions;
		}
		
		@FindBy(xpath = "//li[@id ='currency']/a")	    
		private WebElement lnk_currency;
		public WebElement getLnk_currency() {
		return lnk_currency;
		}
		
	    @FindBy(xpath = "//li[@id ='market-codes']/a")	    
	    private WebElement lnk_marketCodes;
		public WebElement getLnk_marketCodes() {
			return lnk_marketCodes;
		}
	
		@FindBy(xpath = "//li[@id ='my-hotel']/a")	    
		private WebElement lnk_myhotel;
		public WebElement getLnk_myhotel() {
		return lnk_myhotel;
			}
		
		@FindBy(xpath = "//li[@id ='col-fixed-1']/div/a/h2")	    
		private WebElement lnk_myhotel_submenu;
		public WebElement getLnk_myhotel_submenu() {
		return lnk_myhotel_submenu;
			}
		
		@FindBy(xpath = "//li[@id ='early-dep-fee']/a")	    
		private WebElement lnk_early_departure_fee;
		public WebElement getLnk_early_departure_fee() {
		return lnk_early_departure_fee;
			}
		
		@FindBy(xpath = "//li[@id ='house-restrictions']/a")	    
		private WebElement lnk_house_restrictions;
		public WebElement getLnk_house_restrictions() {
		return lnk_house_restrictions;
			}
		
		@FindBy(xpath = "//li[@id ='cancel-no-show']/a")	    
		private WebElement lnk_cancel_noshow;
		public WebElement getlnk_cancel_noshow() {
		return lnk_cancel_noshow;
			}
		
		@FindBy(xpath = "//li[@id ='my-inventory']/a")	    
		private WebElement lnk_my_inventory;
		public WebElement getlnk_my_inventory() {
		return lnk_my_inventory;
			}
		
		@FindBy(xpath = "//li[@id ='room-type-catalogue']/a")	    
		private WebElement lnk_room_type_catalogue;
		public WebElement getlnk_room_type_catalogue() {
		return lnk_room_type_catalogue;
			}
		
		@FindBy(xpath = "//li[@id ='room-type-class-setup']/a")	    
		private WebElement lnk_room_class_setup;
		public WebElement getlnk_room_class_setup() {
		return lnk_room_class_setup;
			}
		
		@FindBy(xpath = "//li[@id ='sleeping-rooms']/a")	    
		private WebElement lnk_room_sleepingRooms;
		public WebElement getlnk_room_sleepingRooms() {
		return lnk_room_sleepingRooms;
			}
		
	    public  Menubar_Navigation getNavigationbar(){
	    	btn_sidebar.click();
	    	return menubar;
	    }
	    
	  
	
}