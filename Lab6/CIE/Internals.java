package CIE;

public class Internals extends Student {
    public double[] internalMarks = new double[5];

    public Internals(String usn, String name, int sem, double[] internalMarks) {
        super(usn, name, sem);
        this.internalMarks = internalMarks;
    }
}
