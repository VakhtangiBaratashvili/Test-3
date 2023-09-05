package DateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        setTime(System.currentTimeMillis());
    }

    public Time(long elapseTime) {
        setTime(elapseTime);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(elapseTime);
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    /*
        DateTime.Time currentTime = new DateTime.Time();
        DateTime.Time customTime = new DateTime.Time(555550000);

        System.out.println("Current DateTime.Time: " + currentTime.toString());
        System.out.println("Custom DateTime.Time: " + customTime.toString());
     */
}
