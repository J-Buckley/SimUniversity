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
public class Staff extends Employee{
    public String office;
    public String phoneNum;
    public String dateEmp;
    public String title;
    
    public Staff(){
    office = "office";
    phoneNum = "phone";
    dateEmp = "employment date";
    title = "title";
    }
    
    public Staff(String office, String phoneNum, String dateEmp, String title){
    this.office = office;
    this.phoneNum = phoneNum;
    this.dateEmp = dateEmp;
    this.title = title;
    }
    @Override
    public String toString(){
        return "Class: Staff\n" + "Phone: " + phoneNum + "\n" 
                + "Employment date: " + dateEmp + "\n" + "Title: " + title + "\n\n";
    }
        
}
