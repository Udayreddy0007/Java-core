class t extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("T1 is sucessfully running");
            i++;
        }
    }
}

class tt extends Thread {
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println("T2 is sucessfully running");
            i++;
        }
    }
}

public class t1join {
    public static void main(String[] args) throws InterruptedException {
        // t t1 = new t();
        tt t2 = new tt();
        // t1.join(1000);
        t2.start();
        t2.join();

        System.out.println("The thread is running");

    }

}
