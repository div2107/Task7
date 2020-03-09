package task5.CreationalPatterns;

public class GetPlan {
	public Plan getPlan(String planType){  
        if(planType == null){  
         return null;  
        }  
      if(planType.equalsIgnoreCase("OTHERPLANS")) {  
             return new OtherPlans();  
           }   
       else if(planType.equalsIgnoreCase("COMMERCIAL")){  
            return new Commercial();  
        }   
  return null;  
}  
	

}
