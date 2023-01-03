package Lesson3Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void shouldCheckTriangleIsRectangular() {
        // given
        int a = 3;
        int b = 4;
        int c = 5;
        // when
        boolean result = Triangle.checkIfTriangleIsRectangular(a, b, c);
        // then
        Assertions.assertEquals(true, result);
    }
}