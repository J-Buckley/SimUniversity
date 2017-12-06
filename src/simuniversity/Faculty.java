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
public class Faculty extends Employee{
    private String office;
    private String phoneNum;
    private String dateEmp;
    private String rank;
    
    public Faculty(){
    office = "office";
    phoneNum = "phone";
    dateEmp = "employment date";
    rank = "rank";
    }
    
    public Faculty(String office, String phoneNum, String dateEmp, String rank){
    this.office = office;
    this.phoneNum = phoneNum;
    this.dateEmp = dateEmp;
    this.rank = rank;
    }
    
    @Override
    public String toString(){
        return "Class: Faculty\n" + "Phone: " + phoneNum + "\n" 
                + "Employment date: " + dateEmp + "\n" + "Rank: " + rank + "\n\n";
    }
}
