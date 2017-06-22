package com.qainfotech.tap.training.resourceio;

import com.qainfotech.tap.training.resourceio.exceptions.ObjectNotFoundException;
import com.qainfotech.tap.training.resourceio.model.Individual;
import com.qainfotech.tap.training.resourceio.model.Team;
import java.util.List;

/**
 *
 * @author Ramandeep RamandeepSingh AT QAInfoTech.com
 */
public class TeamsJsonReader{
    
    /**
     * get a list of individual objects from db json file
     * 
     * @return 
     */
    public List<Individual> getListOfIndividuals(){
        throw new UnsupportedOperationException("Not implemented.");
        
        if (entry.getValue() instanceof String) {
            // Do something with entry.getKey() and entry.getValue()
         //else if (entry.getValue() instanceof Class) {
           // Do something else with entry.getKey() and entry.getValue()
        	 
             throw new UnsupportedOperationException("Not implemented.");
        	 
         else {
            throw new IllegalStateException("Expecting either String or Class as entry value");
                
        
    }
    
    /**
     * get individual object by id
     * 
     * @param id individual id
     * @return 
     * @throws com.qainfotech.tap.training.resourceio.exceptions.ObjectNotFoundException 
     */
    public Individual getIndividualById(Integer id) throws ObjectNotFoundException{
        throw new UnsupportedOperationException("Not implemented.");
    }
    
    /**
     * get individual object by name
     * 
     * @param name
     * @return 
     * @throws com.qainfotech.tap.training.resourceio.exceptions.ObjectNotFoundException 
     */
    public Individual getIndividualByName(String name) throws ObjectNotFoundException{
        throw new UnsupportedOperationException("Not implemented.");
    }
    
    
    /**
     * get a list of individual objects who are not active
     * 
     * @return List of inactive individuals object
     */
    public List<Individual> getListOfInactiveIndividuals(){
        throw new UnsupportedOperationException("Not implemented.");
    }
    
    /**
     * get a list of individual objects who are active
     * 
     * @return List of active individuals object
     */
    public List<Individual> getListOfActiveIndividuals(){
        throw new UnsupportedOperationException("Not implemented.");
    }
    
    /**
     * get a list of team objects from db json
     * 
     * @return 
     */
    public List<Team> getListOfTeams(){
        throw new UnsupportedOperationException("Not implemented.");
    }
}