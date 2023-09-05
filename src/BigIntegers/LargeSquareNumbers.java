package BigIntegers;

import java.math.BigInteger;

public class LargeSquareNumbers {
    public static void main(String[] args) {
        BigInteger n = new BigInteger(Long.MAX_VALUE + "");
        BigInteger increment = new BigInteger("1");
        int count = 0;

        while (count < 10) {
            BigInteger square = n.multiply(n);
            System.out.println(square);
            n = n.add(increment);
            count++;
        }
    }
}

