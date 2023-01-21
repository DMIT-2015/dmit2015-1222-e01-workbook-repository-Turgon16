package dmit2015.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedRectangleTest {
    @ParameterizedTest(name = "length = {0}, width = {1}, expected area = {2}")
    @CsvSource({
            "5.0,2.0,10.0",
            "7.0,9.0,63.0",
            "2.0,1.0,2.0",
            "6.5,3.7,24.05",
    })
    void area_DifferentArea_ReturnsCorrectResults(double length, double width, double expectedArea) {
        // Arrange
        Rectangle rectangle1 = new Rectangle();
        // Act
        rectangle1.setLength(length);
        rectangle1.setWidth(width);
        // Assert
        assertEquals(expectedArea, rectangle1.area(), 0.05);
    }

    @ParameterizedTest(name = "length = {0}, width = {1}, expected perimeter = {2}")
    @CsvSource({
            "95.0,35.0,260.0",
            "20.0,52.55,145.1",
            "2.0,2.0,8.0",
            "11.0,980.0,1982.0",
    })
    void perimeter_DifferentPerimeter_ReturnCorrectResults(double length, double width, double expectedPerimeter) {
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(length);
        rectangle2.setWidth(width);
        assertEquals(expectedPerimeter, rectangle2.perimeter(), 0.05);
    }

    @ParameterizedTest(name = "length = {0}, width = {1}, expected diagonal = {2}")
    @CsvSource({
            "5.0,10.0,11.18",
            "2.0,4.0,4.47",
            "11.0,96.0,96.63",
            "8.5,7.6,11.40",
    })
    void diagonal_DifferentDiagonal_ReturnCorrectResults(double length, double width, double expectedDiagonal) {
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setLength(length);
        rectangle3.setWidth(width);
        assertEquals(expectedDiagonal, rectangle3.diagonal(), 0.05);
    }
}