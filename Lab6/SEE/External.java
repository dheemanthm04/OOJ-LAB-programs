package SEE;

import CIE.Student;

public class External extends Student {
    public double[] seeMarks = new double[5];

    public External(String usn, String name, int sem, double[] seeMarks) {
        super(usn, name, sem);
        this.seeMarks = seeMarks;
    }
}