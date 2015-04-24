package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;  
import org.openqa.selenium.support.ui.Select;


	public class ManageCorpRoomType_POM {
	    /**      
	     * * All WebElements are identified by @FindBy annotation      */   
	    WebDriver driver;     
	    
	    /* The below web elements cater to the following screens:
	     * Create Corporate Room Type Screen
	     * Edit Room Type screen
	     * Corporate Room Type List screen 
	    */
	    
	    @FindBy(name="code")    
	    WebElement roomTypeCode;          
	    
	    @FindBy(name="name")    
	    WebElement roomTypeName;        
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[3]/table/tbody/tr[1]/td[5]/a[1]")
	    WebElement saveButton;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[3]/table/tbody/tr[1]/td[5]/a[2]")
	    WebElement cancelButton;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[4]/span[1]")
	    WebElement recordsPerPageButton;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[2]/div/table/thead/tr[1]/th[1]/span/input")
	    WebElement selectAllRoomTypes;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[1]/button[2]")
	    WebElement deleteSelectedRoomTypeCode;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[4]/a[3]/span")
	    WebElement goToNextPage;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[4]/a[4]/span")
	    WebElement goToLastPage;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[4]/a[2]/span")
	    WebElement goToPreviousPage;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[4]/a[1]/span")
	    WebElement goToFirstPage;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[3]/table/tbody/tr[2]/td[5]/button[1]")
	    WebElement editRoomType;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[3]/table/tbody/tr[1]/td[5]/button[2]")
	    WebElement deleteRoomType;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[3]/table/tbody/tr[1]/td[4]/i[1]")
	    WebElement accessible;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[3]/table/tbody/tr[1]/td[2]")
	    WebElement editOrDeleteTheRoomCodes;
	    
	    @FindBy(xpath=".//*[@id='corporateRoomType-grid']/div/div[3]/table/tbody/tr[1]/td[3]")
	    WebElement editOrDeleteTheRoomName;  
	    
	}

