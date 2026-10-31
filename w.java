import java.io.FileWriter;
import java.io.IOException;

public class w {

    public static void main(String[] args) {
        try {
            FileWriter w1 = new FileWriter("Javanotes.txt");
            w1.write("Name : Ravi \n");
            w1.write("Course : Full Stack Java \n");
            w1.write("Name : Yasmeen \n");
            w1.write("Course : java");
            w1.write("Name : Yegneswar \n");
            w1.write("Course : java");
            w1.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
