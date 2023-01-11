package Lesson2Task3;

import static org.junit.jupiter.api.Assertions.*;
class calculatorTest {

    void shouldAddTwoNumber() {

        // when
        int result = Calculator.sum(2, 2);
        // then
        Assertions.assertEquals(4, totalOfSum);
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
        int result = Calculator.subtract(2,2);
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

