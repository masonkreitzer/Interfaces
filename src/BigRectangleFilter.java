import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle r) {
            int perimeter = 2 * (r.width + r.height);
            return perimeter > 10;
        }
        return false;
    }
}
