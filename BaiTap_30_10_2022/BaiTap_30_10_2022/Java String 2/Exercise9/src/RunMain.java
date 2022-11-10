// Java String 2: Exercise9
import java.text.SimpleDateFormat;
import java.util.Date;

public class RunMain {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("d:M:yyyy hh:mm:ss a");
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEE, MMM d yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE, MMMM d yyyy");

        //Date date = new Date();
        int year = 2022;
        int month = 6;
        int day = 8;

        Date date = new Date(year - 1900, month - 1, day);

        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
        System.out.println(sdf3.format(date));
    }
}
