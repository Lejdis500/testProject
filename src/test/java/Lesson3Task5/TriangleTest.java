package Lesson3Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldBeRectangular() {
        // given
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        // when
        boolean isRectangular = Triangle.isRectangular(sideA, sideB, sideC);
        // then
        Assertions.assertTrue(isRectangular);
    }

    @Test
    void shouldBeNotRectangular() {
        // given
        int sideA = 3;
        int sideB = 3;
        int sideC = 3;
        // when
        boolean isRectangular = Triangle.isRectangular(sideA, sideB, sideC);
        // then
        Assertions.assertFalse(isRectangular);
    }
}