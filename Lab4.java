/*Develop a Java program to create an abstract class named Shape that contains two 
integers and an empty method named printArea( ). Provide three classes named 
Rectangle, Triangle and Circle such that each one of the classes extends the class 
Shape. Each one of the classes contain only the method printArea( ) that prints the 
area of the given shape*/
import java.util.Scanner;

abstract class Shape {
    public int a, b;

    public abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printArea() {
        System.out.println("Rectangle area is: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printArea() {
        System.out.println("Triangle area is: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int a) {
        this.a = a;
    }

    public void printArea() {
        System.out.println("Circle area is: " + (Math.PI * a * a));
    }
}

public class Lab4 {
    public static void main(String[] args) {
        System.out.println("Dheemanth M");
        System.out.println("1BM22CS087");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        int len = s.nextInt();
        int bre = s.nextInt();
        Shape r = new Rectangle(len, bre);
        System.out.println("Enter base and height of Triangle: ");
        int ba = s.nextInt();
        int h = s.nextInt();
        Shape t = new Triangle(ba, h);
        System.out.println("Enter radius of circle ");
        int rad = s.nextInt();
        Shape c = new Circle(rad);
        r.printArea();
        t.printArea();
        c.printArea();
    }
}
