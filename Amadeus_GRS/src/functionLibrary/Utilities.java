package functionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Utilities {

	private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    private static XSSFCell Cell;
	
    
    public static void navigateHover(WebElement mainMenu,WebElement subMenu,WebDriver driver){
    Actions actions = new Actions(driver);
    actions.moveToElement(mainMenu);

    actions.moveToElement(subMenu);
    actions.click().build().perform();
    }
    
    // Initialize the type of browser required
    
    public static WebDriver webDriverInitialize(String browser){	
    	
		 WebDriver driver;
		 switch (browser)
	        {
	            case "chrome":
	            	File file = new File("C:\\selenium-2.42.2\\chromedriver.exe");
	        		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	                driver = new ChromeDriver();
	                break;
	            case "firefox":
	                driver = new FirefoxDriver();
	                break;
	            case "ie":
	            	File file1 = new File("C:\\selenium-2.42.2\\IEDriverServer.exe");
	        		System.setProperty("webdriver.ie.driver", file1.getAbsolutePath());
	        		driver = new InternetExplorerDriver();	        		
	                break;
	            default:
	            	driver = new FirefoxDriver();	       
		            break;
	        }
		 return driver;
    }
    
    
    
    
	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
  
	public static void setExcelFile(String Path)  {
	         try {
	             // Open the Excel file
	          FileInputStream ExcelFile = new FileInputStream(Path);
	          // Access the required test data sheet
	          ExcelWBook = new XSSFWorkbook(ExcelFile);
	          } catch (Exception e){
	             e.printStackTrace();
	          }

	}
	  

	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	
	public static String getCellData(int RowNum, int ColNum) throws Exception{
	         try{
	        	ExcelWSheet = ExcelWBook.getSheetAt(0);   	  
	            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	            String CellData = Cell.getStringCellValue();
	            return CellData;
	            }catch (Exception e){
	              return "error in returning cell data";
	            }

	  }


	//This method is to get the row count used of the excel sheet
	
	public static int getRowCount(){
	        ExcelWSheet = ExcelWBook.getSheetAt(0);  
	        int number=ExcelWSheet.getLastRowNum()+1;
	        return number;
	    }
	  

	//This method is to write the test data to the Excel cell,
	
	public static void putCellData(int RowNum, int ColNum, String Value) throws Exception{
	    try{
	       ExcelWSheet = ExcelWBook.getSheetAt(0);   	  
	       Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	       Cell.setCellValue(Value);
	       FileOutputStream out = new FileOutputStream(new File("C:/Users/shubham.a.shukla/workspace_selenium/DHL_SU/src/TestData.xlsx"));     
	       ExcelWBook.write(out);
	       out.flush();
		   out.close();
	       }catch (Exception e){
	        e.printStackTrace();
	       }

	    }
}
