import java.util.List;
import java.util.ArrayList;

public class collectionListFrameWork {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Rahul");
        students.add("uday");
        students.add("ravi");
        System.out.println(students + students.set(1, "naveen"));
    }

}
