package multiplication;

public class SchoolMultiplicator implements Multiplicator {
    public long multiply(long x, long y) {
        /*long result = 0;
        int length = String.valueOf(y).length();
        for (int i = 0; i < length; i++) {
            double digit = Math.pow(10, i);
            int digitValue = (int) (y / digit % 10);
            long interimResult = x * digitValue * (long) digit;
            result = (long) (result + interimResult);
        }
        return result;*/
        return x * y;
    }
}
