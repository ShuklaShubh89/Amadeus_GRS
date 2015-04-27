package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;  
import org.openqa.selenium.support.ui.Select;

public class HomePage {

			/**      
	     * * All WebElements are identified by @FindBy annotation      */   
	    WebDriver driver;     
	    
	    /* The below web elements cater to the Welcome screen:*/
	    
	    @FindBy(id = "sidebar-button")    
	    public WebElement btn_sidebar;  
	    
	    @FindBy(xpath = "//li[@id ='grs-setup']/a")	    
	    public WebElement lnk_grsSetup;
	    
	    @FindBy(xpath = "//li[@id ='brands']/a")	    
	    public WebElement lnk_brands;
	    
	    @FindBy(xpath = "//li[@id ='market-codes']/a")	    
	    public WebElement lnk_marketCodes;
}