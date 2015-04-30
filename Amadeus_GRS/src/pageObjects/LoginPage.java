package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;  
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

			/**      
	     * * All WebElements are identified by @FindBy annotation      */   
	    WebDriver driver;     
	    
	    /* The below web elements cater to the Login screen:*/
	    
	    @FindBy(xpath="//span[@id='w2_firstInput']/span/input")    
	    private WebElement txt_UserName;          
	    
	    @FindBy(xpath="//span[@id='w2_officeId']/span/input")    
	    private WebElement txt_OfficeID;        
	    
	    @FindBy(xpath="//span[@id='w2_passwordInput']/span/input")
	    private WebElement txt_Password ;

	    @FindBy(xpath="//*[text()='Login']")
	    private WebElement btn_Login ;
	    
	    	    
	    public LoginPage(WebDriver driver){	    	 
	        this.driver = driver;	
	        ElementLocatorFactory locatorWait = new AjaxElementLocatorFactory(driver, 60);
	        
	        //This initElements method will create all WebElements
	        PageFactory.initElements(locatorWait, this);
	    }
	 
	    public void loginUser(String user,String officeid,String pwd){
	    	this.txt_UserName.sendKeys(user);
	    	this.txt_OfficeID.sendKeys(officeid);
	    	this.txt_Password.sendKeys(pwd);
	    	this.btn_Login.click();
	    }

	    
}