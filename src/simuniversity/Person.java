/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;

/**
 *
 * @author Buckley
 */
public class Person {
    public String firstName;
    public String lastName;
    private String phoneNumber;
    private String eMail;
    
    public Person(){
        firstName = "first name";
        lastName = "last name";
        phoneNumber = "phone number";
        eMail = "email";
    }
    public Person(String firstName, String lastName, String phoneNumber, String eMail){
        this.firstName = firstName;
        this.lastName= lastName;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }
    @Override
    public String toString(){
        return "Class: Person\n" + "Name: " + firstName + " " + lastName+"\n" 
                + "Phone: " + phoneNumber + "\n" + "Email: " + eMail + "\n\n";
    }
}
