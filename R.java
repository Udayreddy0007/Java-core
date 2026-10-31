import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class R {

    public static void main(String[] args) {

        try {
            FileReader r1 = new FileReader("Javanotes.txt");
            BufferedReader b1 = new BufferedReader(r1);
            String line;
            while ((line = b1.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
