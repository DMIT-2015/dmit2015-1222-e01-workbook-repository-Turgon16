package dmit2015.model;

/**
 * This class models a rectangle shape
 * @author Tyler Hum
 * @version 2023.01.20
 */
public class Rectangle {
    // fields
    /**
     * The width of this Rectangle
     */
    private double width;
    /**
     * The length of this Rectangle.
     */
    private double length;

    // getter
    public double getWidth() { return width; }
    public double getLength() { return length; }

    // setter
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

//    // empty constructor
    public Rectangle()
    {
        setWidth(1);
        setLength(1);
    }
//
//    // constructor
    public Rectangle(double width, double length)
    {
        setLength(length);
        setWidth(width);
    }

    // methods
    // calculate area
    public double area()
    {
        return length * width;
    }

    // calculate perimeter
    public double perimeter()
    {
        return length * 2 + width * 2;
    }

    // calculate diagonal
    public double diagonal()
    {
        return Math.sqrt( (width * width) + (length * length) );
    }
}
