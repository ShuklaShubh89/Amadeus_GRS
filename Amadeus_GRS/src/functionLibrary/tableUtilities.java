package functionLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tableUtilities {

	static WebDriver driver;
	public tableUtilities(WebDriver drive){
		driver = drive;
	}
	
	@SuppressWarnings("unused")
	public static int tableRetrieveRowCount(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,100);
		(wait).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody/tr")));
		List<WebElement> tableElements = driver.findElements(By.xpath("//tbody/tr"));
		int count = 0;
		for (WebElement tableElement:tableElements){
			count++;
		}
	return count;
	}
	@SuppressWarnings("unused")
	public static int tableRetrieveColCount(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		(wait).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr[1]/td")));
		List<WebElement> tableElements = driver.findElements(By.xpath("//tr[1]/td"));
		int count = 0;
		for ( WebElement tableElement:tableElements){
			count++;
		}
	return count;
	}
	
	public static String getTableText(int row,int col){
		WebDriverWait wait = new WebDriverWait(driver,60);
		(wait).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr/td")));
		String text = driver.findElement(By.xpath("//tbody/tr["+row+"]/td["+col+"]/span")).getText();
		return text;
	}
	
	public static String sortCheckerAscending(int colNum,WebDriver driver){	
		int rowCount = tableRetrieveRowCount(driver);
		int i,result;
		String a[] = new String[rowCount];
		for(i=0;i<rowCount;i++){	
			a[i] = getTableText(i+1,colNum);			
		}
		
		for(i=1;i<rowCount;i++){
				result = a[i].compareTo(a[i-1]);
				if(result<0){
				 System.out.println("Error : The sorting is not Correct");
				 return "Fail";
			}
		}
		System.out.println("The sorting is Correct");
		return "Pass";
	}
	
	
	public static String sortCheckerDescending(int colNum,WebDriver driver){	
		int rowCount = tableRetrieveRowCount(driver);
		int i,result;
		String a[] = new String[rowCount];
		for(i=0;i<rowCount;i++){	
			a[i] = getTableText(i+1,colNum);			
		}
		
		for(i=1;i<rowCount;i++){
				result = a[i].compareTo(a[i-1]);
				if(result>0){
				System.out.println("Error : The sorting is not Correct");
				return "Fail";
			}
		}
		System.out.println("The sorting is Correct");
		return "Pass";
	}
	
	public static int clickAccordion(String name,int column){
		 
		WebDriverWait wait = new WebDriverWait(driver,100);
		int k;
		int rowCount = tableRetrieveRowCount(driver);
		System.out.println(rowCount);
		String tabletext;
		(wait).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr")));
		for(k=1;k<rowCount;k++){
			 tabletext =  driver.findElement(By.xpath("//tbody/tr["+k+"]/td["+column+"]/span")).getText();
			 System.out.println(tabletext);	 
			 System.out.println(name);	 
				 if(tabletext.equals(name)){
					 break;			 			
				 }
			}	
		System.out.println(k);
		 System.out.println("clicking on the dropdown button...");
		 (wait).until(ExpectedConditions.elementToBeClickable(By.xpath("//tr["+k+"]/td[1]/a")));
		 driver.findElement(By.xpath("//tr["+k+"]/td[1]/a")).click();
		 return k;
		
     }
	

		public static void moveCountry(String[] countries,String regionFromMove,String regionToMove){
	
			int rowNum = tableUtilities.clickAccordion(regionFromMove,3);
			WebDriverWait wait = new WebDriverWait(driver,100);
			(wait).until(ExpectedConditions.elementToBeClickable(By.xpath("//tr["+rowNum+"]/td[5]")));
			WebElement rowButtons = driver.findElement(By.xpath("//tr["+rowNum+"]/td[5]"));
			WebElement btn_MoveCountry = driver.findElement(By.xpath("//tr["+rowNum+"]/td[5]/button[2]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(rowButtons);	 
			actions.moveToElement(btn_MoveCountry);
			actions.click().build().perform();
			for(int i=0;i<countries.length;i++){			
				driver.findElement(By.xpath("//*[text()='"+countries[i]+"']")).click();
				WebElement selectRegion = driver.findElement(By.id("sel-region"));
				Select dropdown = new Select(selectRegion);
				dropdown.selectByVisibleText(regionToMove);
				driver.findElement(By.xpath("//input[@value = 'Save']")).click();
			}	
			
		}

}