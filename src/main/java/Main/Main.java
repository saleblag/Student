/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import student.school_sasa_blagojevic.Student;
/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code appStudent = new Student();
    System.out.println("Skola");   
    
    Student sasa = new Student();{
    
    sasa.setFirstName("Sasa");
    sasa.setLastName("Blagojevic");
    sasa.setYearOfBirth(1976);
    
    System.out.println("First Name: " + sasa.getFirstName());
    System.out.println("Last Name: " + sasa.getLastName());
    System.out.println("Year of Birth: " + sasa.getYearOfBirth());
    }
    
}
}
