public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public void push(int value) {
        if (isFull()) {
            int[] newElements = new int[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size++] = value;
    }

    public int pop() {
        if (!isEmpty()) {
            return elements[--size];
        }
        return -1; // Return a sentinel value indicating an empty stack
    }

    public int peek() {
        if (!isEmpty()) {
            return elements[size - 1];
        }
        return -1; // Return a sentinel value indicating an empty stack
    }

    public int getSize() {
        return size;
    }

    /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int divisor = 2;

        while (number > 1 && divisor <= number) {
            if (number % divisor == 0) {
                stack.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }

        System.out.print("Smallest factors in decreasing order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
     */

    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();


        for (int i = number - 1; i > 1; i--) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }
        System.out.print("Every prime numbers in increasing order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
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
     */
}
