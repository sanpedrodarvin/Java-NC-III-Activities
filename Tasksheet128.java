public class Tasksheet128 {
    public static void main(String[] args) {
        AbstractShape[] shapes = new AbstractShape[2];
        shapes[0] = new Circle("Red", "Cirle", 10);
        shapes[1] = new Rectangle("Blue", "Rectangle", 10, 10);

        for (AbstractShape shape : shapes)
        {
            System.out.println(shape.getColor() + " " + shape.getShape());
            if(shape instanceof Circle)
                System.out.println("Radius: " + ((Circle) shape).getRadius());
            else
            {
                System.out.println("Length: " + ((Rectangle) shape).getLength());
                System.out.println("Width: " + ((Rectangle) shape).getWidth());
            }
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter() + "\n");
        }


    }
}

interface Shape {
    public double calculateArea();
    public double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    private String color, shape;


    public AbstractShape(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() { return color; }
    public String getShape() { return shape; }

}

class Circle extends AbstractShape {
    private double radius;

    public Circle (String color, String shape, double radius)
    {
        super(color, shape);
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double calculateArea() { return Math.PI * (Math.pow(radius, 2)); }

    @Override
    public double calculatePerimeter() { return  2 * Math.PI * radius; }


}

class Rectangle extends AbstractShape {
    double length, width;

    public Rectangle (String color, String shape, double length, double width)
    {
        super(color, shape);
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    @Override
    public double calculateArea() { return length * width; }

    @Override
    public double calculatePerimeter() { return  2 * (length + width); }
}

