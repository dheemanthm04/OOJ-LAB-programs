import CIE.Internals;
import SEE.External;
import java.util.Scanner;
public class FinalMarks {
    public static void main(String[] args) {
	System.out.println("Dheemanth M");
        System.out.println("1BM22CS087");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        input.nextLine();

        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

     
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Student " + (i + 1));
            System.out.println("Enter USN: ");
            String usn = input.nextLine();
            System.out.println("Enter Name: ");
            String name = input.nextLine();
            System.out.println("Enter Semester: ");
            int sem = input.nextInt();
            input.nextLine(); 
            double[] internalMarks = new double[5];
            System.out.println("Enter Internal Marks for 5 courses: ");
            for (int j = 0; j < 5; j++) {
            	 System.out.println("Enter Internal Marks for Course " + (j + 1) + ": ");
                internalMarks[j] = input.nextDouble();
            }
            input.nextLine(); 

            internals[i] = new Internals(usn, name, sem, internalMarks);
        }


        for (int i = 0; i < n; i++) {
            System.out.println("Enter SEE Marks for Student " + (i + 1));
            double[] seeMarks = new double[5];
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter SEE Marks for Course " + (j + 1) + ": ");
                seeMarks[j] = input.nextDouble();
            }
            input.nextLine(); 

            externals[i] = new External(internals[i].usn, internals[i].name, internals[i].sem, seeMarks);
        }


        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " : USN: " + internals[i].usn + "\nName: " +
                    internals[i].name + "\nSemester: " + internals[i].sem);

            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + ": " +
                        ((internals[i].internalMarks[j]) + (externals[i].seeMarks[j] / 2)) + "\n");
            }
            System.out.println();
        }
    }
}