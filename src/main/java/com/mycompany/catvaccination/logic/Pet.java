/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catvaccination.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Sergio
 */
@Entity
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int customer_num;
    private String petName;
    private String age;
    private String color;
    private String allergic;
    private String specialCareInfo;
    @OneToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(int customer_num, String petName, String age, String color, String allergic, String specialCareInfo, Owner owner) {
        this.customer_num = customer_num;
        this.petName = petName;
        this.age = age;
        this.color = color;
        this.allergic = allergic;
        this.specialCareInfo = specialCareInfo;
        this.owner = owner;
    }

    public int getCustomer_num() {
        return customer_num;
    }

    public void setCustomer_num(int customer_num) {
        this.customer_num = customer_num;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecialCareInfo() {
        return specialCareInfo;
    }

    public void setSpecialCareInfo(String specialCareInfo) {
        this.specialCareInfo = specialCareInfo;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
     
}
