package Lesson2Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOfWeekTest {

    @Test
    public void shouldGetMonday() {
        // given
        int day = 1;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("Monday", dayName);
    }

    @Test
    public void shouldGetThuesday() {
        // given
        int day = 2;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("Thuesday", dayName);
    }

    @Test
    public void shouldGetWednesday() {
        // given
        int day = 3;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("Wednesday", dayName);
    }

    @Test
    public void shouldGetThursday() {
        // given
        int day = 4;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("Thursday", dayName);
    }

    @Test
    public void shouldGetFriday() {
        // given
        int day = 5;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("Friday", dayName);
    }

    @Test
    public void shouldGetWeekendForSaturday() {
        // given
        int day = 6;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("Weekend", dayName);
    }

    @Test
    public void shouldGetWeekendForSunday() {
        // given
        int day = 7;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("Weekend", dayName);
    }

    @Test
    public void shouldGetThereIsNoSuchADay() {
        // given
        int day = 11;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assertions.assertEquals("There is no such a day!", dayName);
    }
}