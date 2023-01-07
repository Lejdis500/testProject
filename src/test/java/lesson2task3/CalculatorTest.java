package lesson2task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldAddTwoNumber() {
        // given
        int number = 4;

        // when
        int result = Calculator.sum(2, 2);
        Assertions.assertEquals(4,result);

        // then
        Assertions.assertEquals(4,result);
    }

    @Test
    void shouldToSubtractTwoNumbers() {
        // given
        int number = 1;

        // when
        int result = Calculator.subtract(2,1);
        Assertions.assertEquals(1,result);

        // then
        Assertions.assertEquals(1,result);
    }

    @Test
    void shouldToMultiplyTwoNumbers() {
        // given
        int number= 4;

        // when
        int result = Calculator.subtract(2,2);
        Assertions.assertEquals(4,result);

        // then
        Assertions.assertEquals(4,result);
    }

    @Test
    void shouldToDivideTwoNumbers() {
        // given
        int number = 4;

        // when
        int result = Calculator.divide(8,2);
        Assertions.assertEquals(4,result);

        //then
        Assertions.assertEquals(4,result);

    }}

