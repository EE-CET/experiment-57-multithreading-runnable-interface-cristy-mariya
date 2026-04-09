class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable(); // create runnable object
        Thread t = new Thread(r);        // pass it to Thread
        t.start();                       // start thread
    }
}
