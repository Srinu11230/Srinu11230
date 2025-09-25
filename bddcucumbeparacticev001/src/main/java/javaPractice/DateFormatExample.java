package javaPractice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) throws ParseException {
        String inputDate = "01-12-2025"; // Original format
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMMM-yyyy"); // Desired format

        Date date = inputFormat.parse(inputDate);
        String formattedDate = outputFormat.format(date);

        System.out.println("Formatted Date: " + formattedDate);
    }
}
