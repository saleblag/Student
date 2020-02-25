/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.school_sasa_blagojevic;

/**
 *
 * @author qa
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    public Student() {
        this.firstName = "not defined";
        this.lastName = "not defined";
        this.yearOfBirth = 0;
    }
    
    public Student(String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }


}

