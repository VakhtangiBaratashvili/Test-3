package DateTime;

import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        Date date = new Date(elapsedTime);
        this.year = date.getYear() + 1900; // Add 1900 to get the actual year
        this.month = date.getMonth();
        this.day = date.getDate();
    }
}
/*
        DateTime.MyDate date1 = new DateTime.MyDate();
        DateTime.MyDate date2 = new DateTime.MyDate(34355555133101L);

        System.out.println("Date 1: Year=" + date1.getYear() + ", Month=" + date1.getMonth() + ", Day=" + date1.getDay());
        System.out.println("Date 2: Year=" + date2.getYear() + ", Month=" + date2.getMonth() + ", Day=" + date2.getDay());
 */
