
// Write a Java program that implements a multi thread application that has three threads. First thread
// generates a random integer for everyone second. Second thread computes the square of the number and
// prints. Third thread will print the value of a cube of the number.
import java.util.Random;

class random_number implements Runnable {
    public void run() {
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            int r = ra.nextInt(100);
            System.out.println("Random number:" + r);
            square s = new square(r);
            s.start();
            cube c = new cube(r);
            c.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class square extends Thread {
    int x;

    public square(int r) {
        x = r;
    }

    public void run() {
        int sq;
        sq = x * x;
        System.out.println("Square of " + x + " = " + sq);
    }
}

class cube extends Thread {
    int x;

    public cube(int r) {
        x = r;
    }

    public void run() {
        int cu;
        cu = x * x * x;
        System.out.println("cube of " + x + " = " + cu);
    }
}

public class Program_8 {
    public static void main(String[] args) {
        random_number n = new random_number();
        Thread t = new Thread(n);
        t.start();
    }
}