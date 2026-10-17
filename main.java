public class main {
    public static void main(String[] args) {

        // int a = 15;
        // int b = 0;

        // System.out.println(num.length);

        // Multiple exception handling
        try {

            int eum[] = { 1, 2, 4, 5 };
            System.out.println(eum[3]);

            // int result = 2 / 0;
            // System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");

        } finally {
            System.out.println(" i dont care");
        }

        // catch (ArithmeticException e) {
        // System.out.println(" we cannot divide by 0");

        // }

    }

}