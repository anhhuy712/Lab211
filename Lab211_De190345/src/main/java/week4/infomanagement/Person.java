/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.infomanagement;

import java.util.Date;

/**
 *
 * @author huy
 */
public class Person {
    private String Id;
    private String fullName;
    private int phoneNumber;
    private Date yob;
    private String major;

    public Person(String Id, String fullName, int phoneNumber, Date yob, String major) {
        this.Id = Id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.yob = yob;
        this.major = major;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getYob() {
        return yob;
    }

    public void setYob(Date yob) {
        this.yob = yob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Person{" + "Id=" + Id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yob=" + yob + ", major=" + major + '}';
    }
    
    
}
