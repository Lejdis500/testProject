package lesson2task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void shouldReturnTrueForEvenNumber() {
        // given
        int number = 10;

        // when
        boolean result = Numbers.isAnEvenNumber(number);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnFalseForNotEvenNumber() {
        // given
        int number = 9;

        // when
        boolean result = Numbers.isAnEvenNumber(number);

        // then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldReturnTrueForOddNumber() {
        // given
        int number = 11;

        // when
        boolean result = Numbers.isAnOddNumber(number);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnFalseForNotOddNumber() {
        // given
        int number = 10;

        // when
        boolean result = Numbers.isAnOddNumber(number);

        // then
        Assertions.assertFalse(result);
    }
}