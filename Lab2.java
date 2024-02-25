/*Develop a Java program to create a class Student with members usn, name, an array 
credits and an array marks. Include methods to accept and display details and a 
method to calculate SGPA of a student. */


import java.util.Scanner;

class Student {
    String usn, name;
    int[] credits;
    int[] marks;
    int size;

    void accept() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name:");
        name = s.nextLine();
        System.out.println("Enter usn:");
        usn = s.nextLine();
        System.out.println("Enter number of subjects:");
        size = s.nextInt();
        credits = new int[size];
        marks = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Subject " + (i + 1) + " marks:");
            marks[i] = s.nextInt();
            System.out.println("Enter credits for Subject " + (i + 1) + ":");
            credits[i] = s.nextInt();
        }
    }

    float calculate() {
        float sgpa = 0;
        int totalCredits = 0;
        for (int i = 0; i < size; i++) {
            sgpa += (marks[i] / 10) * credits[i];
            totalCredits += credits[i];
        }
        sgpa /= totalCredits;
        return sgpa;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        for (int i = 0; i < size; i++) {
            System.out.println("Subject " + (i + 1) + " Marks: " + marks[i]);
        }
        System.out.println("SGPA: " + calculate());
    }
}

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Dheemanth M");
        System.out.println("1BM22CS087");
        Student s = new Student();
        s.accept();
        s.display();
    }
}
