
public class MultiplethreadInterfaces {

    public static void main(String[] args) {
        crctThread1 r1 = new crctThread1(); // food essentials // bullets
        Thread t1 = new Thread(r1); // Utentils(r1) // gun(bullets)
        crctThread2 r2 = new crctThread2();
        Thread t2 = new Thread(r2);
        t1.start(); // food is cooked // fire
        t2.start();

    }

}

class crctThread1 implements Runnable {

    public void run() {

        System.out.println("Threading is successfully running");
    }

}

class crctThread2 implements Runnable {

    public void run() {

        System.out.println("Threading is successfully running");
    }

}