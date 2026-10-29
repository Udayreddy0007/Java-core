public class Multiple_Thread_By_Class {
    public static void main(String[] args) {

        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();

        t1.start();
        t2.start();
    }
}

class Mythread1 extends Thread {

    @Override
    public void run() {

        int i = 1;
        while (i < 1000) {

            System.out.println("Thread1 is running successfully");
            i++;
        }

    }
}

class Mythread2 extends Thread {

    @Override
    public void run() {

        int i = 1;
        while (i < 200) {

            System.out.println("Thread2 is running successfully");
            i++;
        }
    }
}
