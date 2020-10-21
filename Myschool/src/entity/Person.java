/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Person implements Serializable {
    private String FirstName; 
    private String LastName; 
    private String Phone; 
    private String Role; 

    public Person() {
    }

    public Person(String Name, String LastName, String Phone, String Role) {
        this.FirstName = Name;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Role = Role;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + ", Role=" + Role + '}';
    }
    
}