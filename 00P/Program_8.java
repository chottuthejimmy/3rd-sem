
// Write a Java program that implements a multi thread application that has three threads. First thread
// generates a random integer for every one second. Second thread computes the square of the number and
// prints. Third thread will print the value of a cube of the number.

class random_number implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            int r = (int) (Math.random() * 100);
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
    int r;

    public square(int r) {
        this.r = r;
    }

    public void run() {
        System.out.println("Square of " + r + " = " + (int) Math.pow(r, 2));
    }
}

class cube extends Thread {
    int r;

    public cube(int r) {
        this.r = r;
    }

    public void run() {
        System.out.println("cube of " + r + " = " + (int) Math.pow(r, 3));
    }
}

public class Program_8 {
    public static void main(String[] args) {
        random_number n = new random_number();
        Thread t = new Thread(n);
        t.start();
    }
}