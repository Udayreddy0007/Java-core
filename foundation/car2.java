package foundation;

public class car2 {

    public void race() {
        System.out.println("The car is raccing");
    }

    class car3 extends car2 {
        public void race() {
            System.out.println("Car 3 is started ");
        }

        public void turbo() {
            System.out.println("The turbo mode is added");
        }
    }
}
