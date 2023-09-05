package Implementations;

public class MyStringBuilder1 {
    private char[] value;
    private int count;

    public MyStringBuilder1(String s) {
        this.value = s.toCharArray();
        this.count = s.length();
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        int newLength = this.count + s.length();
        char[] newValue = new char[newLength];

        System.arraycopy(this.value, 0, newValue, 0, this.count);

        System.arraycopy(s.value, 0, newValue, this.count, s.length());

        this.value = newValue;
        this.count = newLength;
        return this;
    }

    public int length() {
        return count;
    }

    public char charAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return value[index];
    }

    public MyStringBuilder1 toLowerCase() {
        char[] lowerChars = new char[count];
        for (int i = 0; i < count; i++) {
            lowerChars[i] = Character.toLowerCase(value[i]);
        }
        return new MyStringBuilder1(new String(lowerChars));
    }

    public MyStringBuilder1 substring(int begin, int end) {
        if (begin < 0 || end > count || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] subChars = new char[end - begin];
        System.arraycopy(value, begin, subChars, 0, end - begin);
        return new MyStringBuilder1(new String(subChars));
    }

    public String toString() {
        return new String(value, 0, count);
    }

    public static void main(String[] args) {
        MyStringBuilder1 sb1 = new MyStringBuilder1("Hello");

        System.out.println("Length: " + sb1.length());
        System.out.println("CharAt(2): " + sb1.charAt(2));

        MyStringBuilder1 lowercase = sb1.toLowerCase();
        System.out.println("LowerCase: " + lowercase.toString());

        MyStringBuilder1 substring = sb1.substring(3, 8);
        System.out.println("Substring: " + substring.toString());
    }
}

