package Lesson2Task4;

import static org.junit.jupiter.api.Assertions.*;

class AgeTest {
    @Test
    public void shouldReturnTrueWhenAdult() {
        // given
        int age = 19;
        // when
        boolean result = Age.isAdult(age);
        //then
        Assertions.assertTrue(isAdult);
    }

    @Test
    public void shoudReturnFalseWhenImmature() {
        // given
        int age = 17;
        // when
        boolean result = Age.isImmature(age);
        // then
        Assertions.assertFalse(isImmature);
    }

    public void shoudReturnTrueWhenAdult() {
        // given
        int age = 18;
        boolean result = Age.isAdult(age);
        // when
        boolean result = Age.isAdult(age);
        // then
        Assertions.assertTrue(isAdult);

    }
}




