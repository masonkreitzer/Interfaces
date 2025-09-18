public class ShortWordFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        if (x instanceof String str) {
            return str.length() < 5;
        }
        return false;
    }
}
