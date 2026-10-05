public class CarForOverriding {
    public static void main(String[] args) {
        Car b1 = new BMW();
        b1.start();
    }
}

class Car // parent class
{
    void start() {
        System.out.println("The Car has started");
    }
}

class BMW extends Car {

    void turbo() {
        System.out.println("The Turbo mode is turned on");
    }

}
