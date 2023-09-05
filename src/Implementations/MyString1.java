package Implementations;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }

        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, end - begin);
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerChars);
    }

    public boolean equals(MyString1 s) {
        if (s == null || s.chars.length != chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.chars[i]) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        // Convert int to a character array representation
        char[] numChars = String.valueOf(i).toCharArray();
        return new MyString1(numChars);
    }

    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        MyString1 str = new MyString1(chars);

        System.out.println("charAt(2): " + str.charAt(2));
        System.out.println("Length: " + str.length());
        System.out.println("Substring(1, 4): " + str.substring(1, 4).toString());
        System.out.println("toLowerCase(): " + str.toLowerCase().toString());

        char[] chars2 = {'h', 'e', 'l', 'l', 'o'};
        MyString1 str2 = new MyString1(chars2);
        System.out.println("Equals(str2): " + str.equals(str2));

        int num = 12345;
        MyString1 numStr = MyString1.valueOf(num);
        System.out.println("ValueOf(12345): " + numStr.toString());
    }
}

/*
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        MyString1 str = new MyString1(chars);

        System.out.println("charAt(2): " + str.charAt(2));
        System.out.println("Length: " + str.length());
        System.out.println("Substring(1, 4): " + str.substring(1, 4).toString());
        System.out.println("toLowerCase(): " + str.toLowerCase().toString());

        char[] chars2 = {'h', 'e', 'l', 'l', 'o'};
        MyString1 str2 = new MyString1(chars2);
        System.out.println("Equals(str2): " + str.equals(str2));

        int num = 12345;
        MyString1 numStr = MyString1.valueOf(num);
        System.out.println("ValueOf(12345): " + numStr.toString());
 */

