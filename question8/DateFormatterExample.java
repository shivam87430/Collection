package Question.question8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateFormatterExample {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy");
        Calendar calendar=new GregorianCalendar(2016,Calendar.MARCH,21);
        System.out.println("Date is "+simpleDateFormat.format(calendar.getTime()));
    }
}
