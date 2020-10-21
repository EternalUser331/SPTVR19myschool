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
public class Subject implements Serializable {
    String Name;
    String Duration;
    String PersonalTeacher;

    public Subject() {
    }

    public Subject(String Name, String Duration, String PersonalTeacher) {
        this.Name = Name;
        this.Duration = Duration;
        this.PersonalTeacher = PersonalTeacher;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getPersonalTeacher() {
        return PersonalTeacher;
    }

    public void setPersonalTeacher(String PersonalTeacher) {
        this.PersonalTeacher = PersonalTeacher;
    }

    @Override
    public String toString() {
        return "Subject{" + "Name=" + Name + ", Duration=" + Duration + ", PersonalTeacher=" + PersonalTeacher + '}';
    }
    
}
