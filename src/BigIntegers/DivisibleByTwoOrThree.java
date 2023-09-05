package BigIntegers;

import java.math.BigInteger;

public class DivisibleByTwoOrThree {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");
        int count = 0;

        while (count < 10) {
            if (number.remainder(BigInteger.valueOf(2)).equals(BigInteger.ZERO) ||
                    number.remainder(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }

            number = number.add(BigInteger.ONE);
        }
    }
}

