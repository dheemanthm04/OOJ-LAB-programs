/*Develop a Java program that prints all real solutions to the quadratic equation 
ax2+bx+c = 0. Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac 
is negative, display a message stating that there are no real solutions.*/

import java.util.Scanner;

class Quadratic {
    int a, b, c;
    double d, r1, r2;

    void QuadCalc(int a, int b, int c) {
        d = b * b - (4 * a * c);
        if (d < 0) {
            System.out.println("There are no real solutions");
        } else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are " + r1 + " and " + r2);
        } else if (d == 0) {
            r1 = r2 = -b / (2.0 * a);
            System.out.println("Equal roots: " + r1);
        }
    }
}

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Dheemanth M");
        System.out.println("1BM22CS087");
        Scanner s = new Scanner(System.in);
        Quadratic q = new Quadratic();
        System.out.println("Enter coefficients a, b, c:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        q.QuadCalc(a, b, c);
    }
}
