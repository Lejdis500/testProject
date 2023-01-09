package Lesson2Task6;

import org.junit.Assert;
import org.junit.Test;

public class DayOfWeekTest {

    @Test
    public void shouldGetMonday() {
        // given
        int day = 1;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals("Monday", dayName);
    }

    @Test

    public void shouldGetThuesday() {

        // given
        int day = 2;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals(Thuesday, dayName);
    }

    @Test

    public void shouldGetWednesday() {

        // given
        int day = 3;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals(Wednesday, dayName);
    }

    @Test
    public void shouldGetThursday() {

        // given
        int day = 4;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals(Thursday, dayName);
    }

    @Test
    public void shouldGetFriday() {

        // given
        int day = 5;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals(Friday, dayName);
    }

    @Test
    public void shouldGetWeekend() {

        // given
        int day = 6;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals(Weekend, dayName);
    }

    @Test
    public void shouldGetWeekend() {
        // given
        int day = 7;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals(Weekend, dayName);
    }


    @Test
    public void shouldGetThereIsNoSuchADay() {

        // given
        int day = 11;

        // when
        String dayName = DayOfWeek.getDayName(day);

        // then
        Assert.assertEquals(ThereIsNoSuchADay, dayName);


    }
}