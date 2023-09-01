/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catvaccination.persistence;

import com.mycompany.catvaccination.logic.Owner;
import com.mycompany.catvaccination.logic.Pet;

/**
 *
 * @author Sergio
 */
public class PersistenceController {
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa= new PetJpaController(); 

    public void saveData(Owner owner, Pet pet) {
        //Creating owner in the DB
       ownerJpa.create(owner);
       //Creating  pet in the DB
       petJpa.create(pet);
    }
}
