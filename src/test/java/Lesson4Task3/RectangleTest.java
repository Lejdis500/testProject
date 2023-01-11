package Lesson4Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldGetArea() {
        // given
        int sideA = 5;
        int sideB = 5;
        // when
        Rectangle rectangle = new Rectangle(sideA, sideB);
        int area = rectangle.getArea();
        // then
        Assertions.assertEquals(25, area);
    }
    @Test
    void shouldGetPerimeter() {
        // given
        int sideA = 5;
        int sideB = 5;
        // when
        Rectangle rectangle = new Rectangle(sideA, sideB);
        int perimeter = rectangle.getPerimeter();
        // then
        Assertions.assertEquals(20, perimeter);
    }
}