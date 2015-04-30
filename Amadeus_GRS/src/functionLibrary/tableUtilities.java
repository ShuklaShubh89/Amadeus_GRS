package functionLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tableUtilities {

	
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
	
	public static String getTableText(int row,int col,WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,60);
		(wait).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr/td")));
		String text = driver.findElement(By.xpath("//tbody/tr["+row+"]/td["+col+"]/span")).getText();
		return text;
	}
	
	public static String sortChecker(int colNum,WebDriver driver){	
		int rowCount = tableRetrieveRowCount(driver);
		int i,result;
		String a[] = new String[rowCount];
		for(i=0;i<rowCount;i++){	
			a[i] = getTableText(i+1,colNum,driver);			
		}
		
		for(i=1;i<=rowCount;i++){
				result = a[i].compareTo(a[i-1]);
				if(result>0){
				 System.out.println("Error : The sorting is not Correct");
				 return "Fail";
			}
		}
		System.out.println("The sorting is Correct");
		return "Pass";
	}
	
	public static void clickElementRow(String name,WebDriver driver){
		 
		 WebDriverWait wait = new WebDriverWait(driver,100);
		 
		int rowCount = tableRetrieveRowCount(driver);
		 int columnCount = tableRetrieveColCount(driver);
		 int temp=0;
		String tabletext;
		 for(int k=1;k<=rowCount;k++){
			 for (int j=1;j<=columnCount;j++){
				 	
				 (wait).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tr[k]/td[j]")));
				 tabletext =  driver.findElement(By.xpath("//tbody/tr["+k+"]/td["+j+"]/span")).getText();
				 if(tabletext.equals(name)){
					 temp = k;
					 break;
			 }			
			}
		 }
		 driver.findElement(By.xpath("//tr["+temp+"]/td/a[@class ='k-icon k-plus']")).click();
     }
	
	
	    
	
}
