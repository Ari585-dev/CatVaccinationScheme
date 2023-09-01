/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catvaccination.logic;

import com.mycompany.catvaccination.persistence.PersistenceController;

/**
 *
 * @author Sergio
 */
public class Controller {
    PersistenceController persController = new PersistenceController();
    //This method are getting the data from the Graphic interface and sending it 
    //to the entities
    public void save(String petAge, String petColor, String petInfo, String petName, 
            String petAllergic, String ownerContact, String ownerName) {
        
        Owner owner= new Owner();
        owner.setName(ownerName);
        owner.setNumber(ownerContact);
        
        Pet pet = new Pet();
        pet.setAge(petAge);
        pet.setPetName(petName);
        pet.setAllergic(petAllergic);
        pet.setColor(petColor);
        pet.setSpecialCareInfo(petAllergic);
        pet.setOwner(owner);
        
        persController.saveData(owner, pet);
        
       
    }
    
}
