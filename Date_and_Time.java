import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Date_and_Time {
    public static void main(String[] args) {

        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        // LocalDateTime datetime = LocalDateTime.now();
        // System.out.println("Today date is : " + date);
        // System.out.println("Time is : " + time);
        // System.out.println("Today date and now time is : " + datetime);

        // Example 2 - Add the days to the date and change the date formate

        // LocalDate today = LocalDate.now();

        // LocalDate nextDate = today.plusDays(10); // adding 10days to today date

        // DateTimeFormatter change = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // System.out.println("Today : " + today.format(change));
        // System.out.println("Next Date :" + nextDate.format(change));

        // Get the year

        LocalDate date = LocalDate.now();
        // int year = date.getYear();
        // System.out.println(year);

        // Month month = date.getMonth();
        int month = date.getMonthValue();
        System.out.println(month);
    }
}