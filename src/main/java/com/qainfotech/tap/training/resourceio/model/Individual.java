package com.qainfotech.tap.training.resourceio.model;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Ramandeep RamandeepSingh AT QAInfoTech.com
 */
public class Individual {
    
    private final String name;
    private final Integer id;
    private final Boolean active;
    
    public Individual(Map<String, Integer> individualMap)
    { 
    	active=true;
    	if(active)
    	{
    		individualMap = new HashMap<String,Integer>();
    		name="a";
    		id=100;
    		//active=true;
            individualMap.put(name,id);
            individualMap.put("name2",2);
            individualMap.put("name3",3);
            
            
    	}
    	else 
    		{
    			throw new UnsupportedOperationException("Not implemented.");
    		}
        
        			
        		
    }
    
    /**
     * get the name of individual
     * 
     * @return individual name
     */
    public String getName( Map<String, Integer> individualMap){
    

        
    	   System.out.println( individualMap.get(name));
    	    
    	
    	
        return name;
    }
    
    /**
     * get the employee of of individual
     * @return id
     */
    public Integer getId(Map<String, Integer> individualMap){
    	System.out.println( individualMap.get(id));
        return id;
    }
    
    /**
     * get the active status of individual
     * 
     * @return 
     */
    public Boolean isActive(Map<String, Integer> individualMap){
    	System.out.println( individualMap.get(active));
        return active;
    }
}