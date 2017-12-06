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
public class Student extends Person{
    private String ClassStatus;

    public Student(){
        ClassStatus = "class status";
    }
    
    public Student(String ClassStatus){
        this.ClassStatus = ClassStatus;
    }
        @Override 
        public String toString(){
            return "Class: Student\n" + "Class status: " + ClassStatus + "\n\n";
        }
    }

