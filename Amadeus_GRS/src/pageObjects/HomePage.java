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

		Menubar_Navigation menubar ;
			/**      
	     * * All WebElements are identified by @FindBy annotation      */   
	    WebDriver driver;     
	    
	    public HomePage(WebDriver driver){	    	 
	        this.driver = driver;	
	        ElementLocatorFactory locatorWait = new AjaxElementLocatorFactory(driver, 60);
	        
	        //This initElements method will create all WebElements
	        PageFactory.initElements(locatorWait, this);
	    }
	    
	    /* The below web elements cater to the Welcome screen:*/
	    
	    @FindBy(id = "sidebar-button")    
	    private WebElement btn_sidebar;      
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
		
	    
	    public Menubar_Navigation getNavigationbar(){
	    	this.btn_sidebar.click();
	    	return menubar;
	    }
	    
	
}