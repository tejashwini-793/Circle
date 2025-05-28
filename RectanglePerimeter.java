package Seven;

public class RectanglePerimeter {
    int length, breadth;

    // Constructor to initialize length and breadth
    RectanglePerimeter(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int getArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    int getPerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        RectanglePerimeter r = new RectanglePerimeter(4, 3); // example values
        System.out.println("Area of Rectangle: " + r.getArea());
        System.out.println("Perimeter of Rectangle: " + r.getPerimeter());
    }
}
