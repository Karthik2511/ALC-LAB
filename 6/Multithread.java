import java.util.Random; // The import statement should be at the top

class SquareThread implements Runnable {
    int x;

    SquareThread(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Thread Name: Square Thread and Square of " + x + " = " + x * x);
    }
}

class CubeThread implements Runnable {
    int x;

    CubeThread(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Thread Nmae: Cube Thread and Cube of " + x + " = " + x * x * x);
    }
}

class RandomThread implements Runnable {
    Random r;

    public void run() {
        r = new Random(); // Initialize the Random object

        try {
            while (true) {
                int num = r.nextInt(10); // Generate a random number
                System.out.println("Main Thread and Generated number : " + num);

                // Create and start the square thread
                Thread t2 = new Thread(new SquareThread(num));
                t2.start();

                // Create and start the cube thread
                Thread t3 = new Thread(new CubeThread(num));
                t3.start();

                Thread.sleep(1000);
                System.out.println("----------------------");
            }
        } catch (Exception ex) {
            System.out.println("Interruption Exception: " + ex);
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        // Corrected instantiation of RandomThread
        RandomThread Thread_obj = new RandomThread();
        Thread t1 = new Thread(Thread_obj);
        t1.start();
    }
}