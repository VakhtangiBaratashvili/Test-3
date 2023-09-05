package BigIntegers;

import java.math.BigInteger;

public class LargePrimeNumbers {
    public static void main(String[] args) {
        BigInteger candidate = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);
        int count = 0;

        while (count < 5) {
            if (isProbablePrime(candidate, 100)) {
                System.out.println(candidate);
                count++;
            }

            candidate = candidate.add(BigInteger.ONE);
        }
    }

    public static boolean isProbablePrime(BigInteger n, int k) {
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }

        if (n.compareTo(BigInteger.valueOf(3)) <= 0) {
            return true;
        }

        if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            return false;
        }

        BigInteger d = n.subtract(BigInteger.ONE);
        int s = 0;

        while (d.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            d = d.divide(BigInteger.TWO);
            s++;
        }

        for (int i = 0; i < k; i++) {
            BigInteger a = getRandomBigInteger(BigInteger.TWO, n.subtract(BigInteger.TWO));
            BigInteger x = a.modPow(d, n);

            if (x.equals(BigInteger.ONE) || x.equals(n.subtract(BigInteger.ONE))) {
                continue;
            }

            boolean isPrime = false;
            for (int j = 0; j < s - 1; j++) {
                x = x.modPow(BigInteger.TWO, n);
                if (x.equals(BigInteger.ONE)) {
                    return false;
                }
                if (x.equals(n.subtract(BigInteger.ONE))) {
                    isPrime = true;
                    break;
                }
            }

            if (!isPrime) {
                return false;
            }
        }

        return true;
    }

    public static BigInteger getRandomBigInteger(BigInteger min, BigInteger max) {
        BigInteger range = max.subtract(min);
        int length = max.bitLength();
        BigInteger result;
        do {
            result = new BigInteger(length, new java.util.Random());
        } while (result.compareTo(min) < 0 || result.compareTo(max) >= 0);
        return result;
    }
}

