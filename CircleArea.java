package Seven;

public class CircleArea {
    double radius;

    // Constructor to initialize radius
    CircleArea(double r) {
        radius = r;
    }

    // Method to calculate area
    double getArea() {
        return 3.14 * radius * radius;
    }

    // Method to calculate perimeter (circumference)
    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        CircleArea c = new CircleArea(5); // example radius
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Perimeter of Circle: " + c.getPerimeter());
    }
}
