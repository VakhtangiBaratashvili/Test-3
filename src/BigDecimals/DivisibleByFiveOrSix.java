package BigDecimals;

public class DivisibleByFiveOrSix {
    public static void main(String[] args) {
        long current = Long.MAX_VALUE;
        int count = 0;

        while (count < 10) {
            if (current % 5 == 0 || current % 6 == 0) {
                System.out.println(current);
                count++;
            }
            current++;
        }
    }
}

