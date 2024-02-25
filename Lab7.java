/*Write a program that demonstrates handling of exceptions in inheritance tree. 
Create a base class called “Father” and derived class called “Son” which extends the 
base class. In Father class, implement a constructor which takes the age and throws 
the exception WrongAge( ) when the input age<0. In Son class, implement a 
constructor that cases both father and son’s age and throws an exception if son’s age 
is >=father’s age.*/

import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    Father(int fage) throws WrongAge {
        if (fage < 0) {
            throw new WrongAge("Age cannot be negative");
        } else {
            System.out.println("Father's age is " + fage);
        }
    }
}

class Son extends Father {
    Son(int fage, int sage) throws WrongAge {
        super(fage);
        if (sage >= fage) {
            throw new WrongAge("Son's age cannot be greater than father's age");
        } else {
            System.out.println("Son's age is " + sage);
        }
    }
}

public class Lab7 {
    public static void main(String[] args) {
	System.out.println("Dheemanth M");
        System.out.println("1BM22CS087");
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter father's age:");
            int fage = scanner.nextInt();
            System.out.println("Enter son's age:");
            int sage = scanner.nextInt();

            Son son = new Son(fage, sage);
          
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        scanner.close();
    }
}

