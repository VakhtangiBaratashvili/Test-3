public class MyInteger {
    private final int integer;

    public MyInteger(int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return this.integer;
    }

    public boolean isEven() {
        return this.integer % 2 == 0;
    }

    public boolean isOdd() {
        return this.integer % 2 == 1;
    }

    public boolean isPrime() {
        if(this.integer == 2) {
            return true;
        }
        for (int i = 2; i < this.integer; i++) {
            if (this.integer % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static boolean isPrime(int number) {
        if(number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int number) {
        return this.integer == number;
    }
    public boolean equals(MyInteger myInt) {
        return this.integer == myInt.getInteger();
    }

    public static int parseInt(char[] arr) {
        return Integer.parseInt(new String(arr));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    /*
        MyInteger myInt = new MyInteger(17);

        System.out.println("Value: " + myInt.getInteger());
        System.out.println("Is even? " + myInt.isEven());
        System.out.println("Is odd? " + myInt.isOdd());
        System.out.println("Is prime? " + myInt.isPrime());

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Is " + number + " even? " + MyInteger.isEven(number));
        System.out.println("Is " + number + " odd? " + MyInteger.isOdd(number));
        System.out.println("Is " + number + " prime? " + MyInteger.isPrime(number));

        MyInteger anotherInt = new MyInteger(42);
        System.out.println("Is myInt even? " + MyInteger.isEven(myInt));
        System.out.println("Is anotherInt odd? " + MyInteger.isOdd(anotherInt));

        char[] numChars = {'1', '2', '3', '4', '5'};
        System.out.println("Parsed int from char array: " + MyInteger.parseInt(numChars));

        String numString = "6789";
        System.out.println("Parsed int from string: " + MyInteger.parseInt(numString));
     */
}
