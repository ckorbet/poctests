package poctests;

public class Adder {
    public static final int Sum(final int... operands) {
        int res = 0;
        for(final int i : operands) {
            res += i;
        }
        return res;
    }
}