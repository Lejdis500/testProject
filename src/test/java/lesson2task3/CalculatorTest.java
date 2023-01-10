package lesson2task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldAddTwoNumber() {


        // when
        int result = Calculator.sum(2, 2);

        // then
        Assertions.assertEquals(4,totalOfSum);
    }

    @Test
    void shouldSubtractTwoNumbers() {


        // when
        int result = Calculator.subtract(2,1);

        // then
        Assertions.assertEquals(1,totalOfSubstract);
    }

    @Test
    void shouldMultiplyTwoNumbers() {


        // when
        int result = Calculator.multiply(2,2);

        // then
        Assertions.assertEquals(4,totalOfMultiply);
    }

    @Test
    void shouldDivideTwoNumbers() {


        // when
        int result = Calculator.divide(8,2);

        //then
        Assertions.assertEquals(4,totalOfDivide);

    }


}



