package Question.question9;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("today Date is :"+date.toString());
        Locale locale=new Locale("fr","FR");;
        DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println("today in france is :"+dateFormat.format(date));
    }
}
