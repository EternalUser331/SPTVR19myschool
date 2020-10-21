/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Journal implements Serializable {
    Person student;
    Subject subject;
    Integer integer;
    Date date;

    public Journal() {
    }

    public Journal(Person student, Subject subject, Integer integer, Date date) {
        this.student = student;
        this.subject = subject;
        this.integer = integer;
        this.date = date;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String dateStr = sdf.format(date);
        String mark;
        return "Journal{" + "student=" + student.getFirstName()
                + " " + student.getLastName()
                + ", subject=" + subject.getName()
                + "mark " + mark
                + ", integer=" + integer
                + ", date=" + dateStr
                + '}';
    }
     
}
