package Driver;

import functionLibrary.Utilities;
import java.lang.reflect.*;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class driverClass {

	public static void main(String[] args) throws Exception {
		

		Logger Log = Logger.getLogger(driverClass.class.getName());
		DOMConfigurator.configure("log4j.xml");
		Log.info("Initialise selenium");
		              
		Utilities.setExcelFile("C:/Users/shubham.a.shukla/Desktop/GRS Amadeus/Driver_testscripts.xlsx");
		int rowCount = Utilities.getRowCount();
		String function_tc;
		String package_name = "testScripts.";
		String class_name = null ,temp = null;
		
		for(int i=1;i<rowCount;i++){                    
		   class_name = Utilities.getCellData(i, 0);                     
		   if(class_name.equals("")){
		     class_name    = temp;
		     function_tc = Utilities.getCellData(i, 1);
		     System.out.println("classname : "+class_name+"function name :"+function_tc);
		                
		    Class<?> thisClass = Class.forName(class_name);
		    Object iClass = thisClass.newInstance();
		    Method thisMethod = thisClass.getDeclaredMethod(function_tc);
		    thisMethod.invoke(iClass);
		                     
		    }
		  else{
		   class_name = Utilities.getCellData(i, 0);
		   class_name = package_name.concat(class_name);
		   temp = class_name;
		   function_tc = Utilities.getCellData(i, 1);
		   System.out.println("classname : "+class_name+"function name :"+function_tc);
		                
		    Class<?> thisClass = Class.forName(class_name);
		    Object iClass = thisClass.newInstance();
		    Method thisMethod = thisClass.getDeclaredMethod(function_tc);
		    thisMethod.invoke(iClass);
		                        
		    continue;
		   }
		       
    }
		       
		              		       
		
}

}
