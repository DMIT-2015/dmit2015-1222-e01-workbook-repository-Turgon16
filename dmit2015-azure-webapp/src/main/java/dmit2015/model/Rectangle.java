package dmit2015.model;

public class Rectangle {
    // fields
    private double width;
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
    public double Area()
    {
        return length * width;
    }

    // calculate perimeter
    public double Perimeter()
    {
        return length * 2 + width * 2;
    }

    // calculate diagonal
    public double Diagonal()
    {
        return Math.sqrt( (width * width) + (length * length) );
    }
}
