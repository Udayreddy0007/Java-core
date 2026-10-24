import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// public class Stream {
// public static void main(String[] args) {

// List<Integer> numbers = new ArrayList<>();
// numbers.add(10);
// numbers.add(20);
// numbers.add(30);
// numbers.add(40);
// System.out.println(numbers);
// numbers.stream().forEach(num -> System.out.println(num));
// }

// }

/// Stream() creates a stream from the list

/// foreach() -- perform an action on each element / item in stream
/// num -> System.out.println(num) is a lambda expression

// num is just a variable name which represent each element in the list
// -> seperates the variable from the condition

// Stream filter ()

// public class Stream {
// public static void main(String[] args) {
// List<Integer> numbers = new ArrayList<>();
// numbers.add(10);
// numbers.add(20);
// numbers.add(30);
// numbers.add(40);
// System.out.println(numbers);
// numbers.stream().filter(num -> num % 30 == 0).forEach(num ->
// System.out.println(num));

// }
// }

// Stream transform ()

// public class Stream {
// public static void main(String[] args) {
// List<Integer> numbers = new ArrayList<>();
// numbers.add(10);
// numbers.add(20);
// numbers.add(30);
// numbers.add(40);
// System.out.println(numbers);
// numbers.stream().map(num -> num * 2).forEach(num -> System.out.println(num));

// }
// }

// Stream count()

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
        long result = numbers.stream().count();
        System.out.println(result);
    }
}
