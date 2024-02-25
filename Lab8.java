/*Write a program which creates two threads, one thread displaying “BMS College of 
Engineering” once every ten seconds and another displaying “CSE” once every two 
seconds.*/

class BMS extends Thread {
    public void run() {
       for(int i=0;i<3;i++) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CSE extends Thread {
    public void run() {
       for(int i=0;i<10;i++) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab8 {
    public static void main(String[] args) {
      System.out.println("Dheemanth M");
        System.out.println("1BM22CS087");
        BMS b = new BMS(); 
        b.start(); 
        
        CSE c = new CSE(); 
        c.start(); 
    }
}
