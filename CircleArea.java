public class CircleArea {
    double radius;

    // Constructor to initialize radius
    CircleArea(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference)
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        CircleArea c = new CircleArea(5); // example radius
        System.out.printf("Area of Circle: %.2f%n", c.getArea());
        System.out.printf("Perimeter of Circle: %.2f%n", c.getPerimeter());
    }
}
