package task5.CreationalPatterns;
import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreationalPatternMain {
	private static final Logger LOGGER=LogManager.getLogger(CreationalPatternMain.class);
	public static void main(String args[]) throws IOException
	{
		LOGGER.info("This is factory method design pattern");
		GetPlan planFactory = new GetPlan();  
        
	      LOGGER.info("Enter the name of plan for which the bill will be generated: ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String planName=br.readLine();  
	      LOGGER.info("Enter the number of units for bill will be calculated: ");  
	      int units=Integer.parseInt(br.readLine());  
	  
	      Plan p = planFactory.getPlan(planName);  
	      //call getRate() method and calculateBill()method of DomesticPaln.  
	  
	      LOGGER.info("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);
	      LOGGER.info("End of Factory method design pattern");
	      SingleObject o = SingleObject.getInstance();
	      o.showMessage();
	           
	       
	   }
	
}
