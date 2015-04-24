package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory;  
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

			/**      
	     * * All WebElements are identified by @FindBy annotation      */   
	    WebDriver driver;     
	    
	    /* The below web elements cater to the Login screen:*/
	    
	    @FindBy(xpath="//span[@id='w2_firstInput']/span/input")    
	    public WebElement txt_UserName;          
	    
	    @FindBy(name="//span[@id='w2_officeId']/span/input")    
	    public WebElement txt_OfficeID;        
	    
	    @FindBy(xpath="//span[@id='w2_passwordInput']/span/input")
	    public WebElement txt_Password ;

	    @FindBy(xpath="//*[text()='Login'")
	    public WebElement btn_Login ;
	    
	    	    
	    public LoginPage(WebDriver driver){
	    	 
	        this.driver = driver;	 
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	 
	    }
	 
	    public void setUsername(String user){
	    	this.txt_UserName.sendKeys(user);
	    }
	    
}