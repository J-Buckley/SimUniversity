/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuniversity;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Buckley
 */
public class SimUniversity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        ArrayList people = new ArrayList();
        
        Faculty fac1 = new Faculty("HR", "(302)656-9823", "3/12/17", "computer");
        Faculty fac2 = new Faculty("CEO", "(612)321-1232", "1/19/10", "boss");
        Faculty fac3 = new Faculty("mail", "(302)320-1234", "10/31/95", "mail handler");
        
        Student stu1 = new Student("Senior");
        Student stu2 = new Student("Junior");
        Student stu3 = new Student("Freshman");
        
        Person per1 = new Person("Bob", "Henderson", "(333)454-1238", "bobbyboy123@gmail.com");
        Person per2 = new Person("Frank", "Henderson", "(333)494-2352", "frankybeanbags@gmail.com");
        Person per3 = new Person("Phased", "Gilly", "(212)454-2942", "skootshoot3@gmail.com");
        
        Staff stf1 = new Staff("HR", "(302)555-5555", "3/12/16", "bagster");
        Staff stf2 = new Staff("c223", "(302)123-1234", "1/22/12", "teacher");
        Staff stf3 = new Staff("L522", "(302)244-3584", "12/25/12", "slide-whistler");
        
        people.add(fac1);
        people.add(fac2);
        people.add(fac3);
        people.add(stu1);
        people.add(stu2);
        people.add(stu3);
        people.add(per1);
        people.add(per2);
        people.add(per3);
        people.add(stf1);
        people.add(stf2);
        people.add(stf3);
        
        for(int i = 0; i < people.size(); i++){
            System.out.print(people.get(i).toString());
        }
    }
    
}

/*
run:
Class: Faculty
Phone: (302)656-9823
Employment date: 3/12/17
Rank: computer

Class: Faculty
Phone: (612)321-1232
Employment date: 1/19/10
Rank: boss

Class: Faculty
Phone: (302)320-1234
Employment date: 10/31/95
Rank: mail handler

Class: Student
Class status: Senior

Class: Student
Class status: Junior

Class: Student
Class status: Freshman

Class: Person
Name: Bob Henderson
Phone: (333)454-1238
Email: bobbyboy123@gmail.com

Class: Person
Name: Frank Henderson
Phone: (333)494-2352
Email: frankybeanbags@gmail.com

Class: Person
Name: Phased Gilly
Phone: (212)454-2942
Email: skootshoot3@gmail.com

Class: Staff
Phone: (302)555-5555
Employment date: 3/12/16
Title: bagster

Class: Staff
Phone: (302)123-1234
Employment date: 1/22/12
Title: teacher

Class: Staff
Phone: (302)244-3584
Employment date: 12/25/12
Title: slide-whistler

BUILD SUCCESSFUL (total time: 0 seconds)

*/