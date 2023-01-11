package Lesson2Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerifierTest {
    @Test
    public void shouldReturnTrueWhenAdult() {
        // given
        int age = 19;
        // when
        boolean isAdult = AgeVerifier.isAdult(age);
        //then
        Assertions.assertTrue(isAdult);
    }

    @Test
    public void shouldReturnFalseWhenImmature() {
        // given
        int age = 17;
        // when
        boolean isAdult = AgeVerifier.isAdult(age);
        // then
        Assertions.assertFalse(isAdult);
    }

    public void shouldReturnTrueWhenYoungAdult() {
        // given
        int age = 18;
        // when
        boolean isAdult = AgeVerifier.isAdult(age);
        // then
        Assertions.assertTrue(isAdult);

    }
}




