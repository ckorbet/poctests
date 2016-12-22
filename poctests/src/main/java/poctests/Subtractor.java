package poctests;

public class Subtractor {
    public static final int Subtract(final int... operands) {
        int res = 0;
        for(final int i : operands) {
            res -= i;
        }
        return res;
    }
}