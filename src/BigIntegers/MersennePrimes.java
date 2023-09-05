package BigIntegers;

import java.math.BigInteger;

public class MersennePrimes {
    public static void main(String[] args) {
        for (int p = 2; p <= 100; p++) {
            BigInteger mersenne = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
            if (mersenne.isProbablePrime(50)) {
                System.out.println("p " + p + " " + mersenne);
            }
        }
    }
}
