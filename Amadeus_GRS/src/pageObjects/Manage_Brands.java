package pageObjects;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;

public class Manage_Brands {
	WebDriver driver;
		public Manage_Brands(WebDriver driver) {
			this.driver = driver;
			
		}

		/**      
		 * * All WebElements are identified by @FindBy annotation  */   
	     
		
		/* These elements cater to the following screens:
		 	
		 	1. Create Brand Screen
		 	2. Edit Brand Screen
		 	3. Brand List screen 
		 	4. Display Brand Details Screen
		
		*/ 	
		
		@FindBy(id="id")    
		WebElement brandCode;
		
		@FindBy(id="brandName") 
		WebElement brandName; 
		
		@FindBy(id="inventorySystemRange")    
		WebElement inventorySystemRange;        
		
		@FindBy(id="bookingHorizon")    
		WebElement bookingHorizon;      
		
		@FindBy(xpath="html/body/div[4]/form/ng-include/div[1]/label")    
		WebElement sellThroughFlowThroughIndicator; 
		
		@FindBy(xpath="div[@id='brand-grid']/div/div[2]/span/span/span/span[2]/span")    
		WebElement recordsPerPageButton;        
		
		@FindBy(xpath=".//*[@id='brand-grid']/div/table/thead/tr[2]/th[1]/span/span/span/input")    
		WebElement retrieveByBrandCode; 
		
		@FindBy(xpath=".//*[@id='brand-grid']/div/table/thead/tr[2]/th[2]/span/span/span/input")    
		WebElement retrieveByBrandName;
		
		@FindBy(xpath=".//*[@id='brand-grid']/div/table/thead/tr[2]/th[3]/span/span/span/span/span[1]")    
		WebElement retrieveBySellThroughFlowThrough;
		
		@FindBy(linkText="Back to brands")    
		WebElement backToBrandListScreen;
		
		@FindBy(linkText="Edit")    
		WebElement navigateToEditBrandScreen;

		@FindBy(xpath="html/body/div[4]/form/save-cancel-btns/div/button[1]")    
		WebElement saveButton;
		
		@FindBy(xpath="html/body/div[4]/form/save-cancel-btns/div/button[2]")    
		WebElement cancelButton;

	
		

}		
		
		
		