package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area_SmallValue_ReturnsCorrectResult() {
        Rectangle rectangle1 = new Rectangle(3, 4);
        assertEquals(12, rectangle1.area(), 0);
    }

    @Test
    void perimeter() {
    }

    @Test
    void diagonal() {
    }
}