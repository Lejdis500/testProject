package Lesson2Task6;

public class DayOfWeek {

    public static String getDayName(int day) {
        if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Thuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if (day == 5) {
            return "Friday";
        } else if (day == 6 || day == 7) {
            return "Weekend";
        } else {
            return "There is no such a day!";
        }
    }
}
