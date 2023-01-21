package dmit2015.model;


/**
 * This class models a Circle shape.
 * @author Tyler Hum
 * @version 2023-01-20
 * @see http://www.jetbrains.com/help/idea/working-with-code-documentation.html
 */
public class Circle {
    /**
     * The radius of this circle
     */
    private double radius;

    /**
     * Returns the radius of this circle
     * @return the radius of this circle
     */

    public double getRadius() {
        return radius;
    }

    // checked exception example
    //    public void setRadius(double radius) throws Exception {
    //
    //        //validate
    //        if(radius <= 0)
    //        {
    //            throw new Exception("Radius must be a positive non-zero number.");
    //        }
    //        this.radius = radius;
    //    }

    // unchecked RuntimeException
    public void setRadius(double radius) {

        //validate
        if(radius <= 0)
        {
            throw new RuntimeException("Radius must be a positive non-zero number.");
        }
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double diameter()
    {
        return 2 * radius;
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();

        // radius = 1
        // area = 3.14159
        // perimeter = 6.28

        System.out.printf("the radius of the circle1 is %s\n", circle1.getRadius());
        // System.out.println("the radius of the circle1 is" + circle1.getRadius());
        System.out.printf("the area of the circle1 is %.5f\n", circle1.area());
        System.out.printf("the perimeter of circle1 is %.2f\n", circle1.perimeter());
        // System.out.printf("the perimeter of circle1 is {circle1.Perimeter()}\n");

        circle1.setRadius(5);
        // circle1.radius = 5;

        // radius = 5
        // area = 78.53982
        // perimeter = 31.41593

        System.out.printf("the radius of the circle1 is %s\n", circle1.getRadius());
        System.out.printf("the area of the circle1 is %.5f\n", circle1.area());
        System.out.printf("the perimeter of circle1 is %.2f\n", circle1.perimeter());
        // System.out.printf("the perimeter of circle1 is {circle1.Perimeter()}");

        // Try catch
        try
        {
            circle1.setRadius(-25);
            System.out.println("An exception should have been thrown");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}