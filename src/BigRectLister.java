import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {

        // Create an ArrayList of 10 Rectangles
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 1));  // Perimeter = 4
        rectangles.add(new Rectangle(2, 2));  // Perimeter = 8
        rectangles.add(new Rectangle(3, 3));  // Perimeter = 12
        rectangles.add(new Rectangle(4, 1));  // Perimeter = 10
        rectangles.add(new Rectangle(5, 1));  // Perimeter = 12
        rectangles.add(new Rectangle(2, 4));  // Perimeter = 12
        rectangles.add(new Rectangle(1, 5));  // Perimeter = 12
        rectangles.add(new Rectangle(0, 0));  // Perimeter = 0
        rectangles.add(new Rectangle(6, 1));  // Perimeter = 14
        rectangles.add(new Rectangle(1, 2));  // Perimeter = 6

        // Create filter
        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter > 10:");

        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                System.out.println("Rectangle[w=" + r.width + ", h=" + r.height +
                        "] → Perimeter: " + (2 * (r.width + r.height)));
            }
        }
    }
}
