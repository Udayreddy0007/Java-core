
// public class functioninterface {
//     public static void main(String[] args) {
//         addition num = new addition();
//         System.out.println(num.calculate(10, 20));

//     }

// }

// Without lambda expression

// @FunctionalInterface
// interface Calculator {

// int calculate(int a, int b);

// }

// class addition implements Calculator {

// public int calculate(int a, int b) {
// return a + b;
// }

// }

// ---------------------------------------------------------------------------------------------------------------------------------------------

// With lambda expression

public class functioninterface {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;
        System.out.println(addition.calculate(10, 20));
        System.out.println(multiplication.calculate(10, 20));

    }
}

@FunctionalInterface
interface Calculator {

    int calculate(int a, int b);

}
