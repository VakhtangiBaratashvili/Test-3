package BigDecimals;

import java.math.BigDecimal;
import java.math.MathContext;

public class ApproximateE {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = BigDecimal.ONE; // Initialize e to 1
            BigDecimal term = BigDecimal.ONE; // Initialize the first term to 1

            for (int j = 1; j <= i; j++) {
                term = term.divide(BigDecimal.valueOf(j), MathContext.DECIMAL128);
                e = e.add(term);
            }

            System.out.println("Approximate e for i = " + i + ": " + e.toString());
        }
    }
}

