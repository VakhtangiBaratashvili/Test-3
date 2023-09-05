package Implementations;

public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    public int compareTo(MyCharacter anotherChar) {
        return this.value - anotherChar.value;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MyCharacter) {
            return this.value == ((MyCharacter) obj).value;
        }
        return false;
    }

    public static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    public static boolean isLowerCase(char ch) {
        return Character.isLowerCase(ch);
    }

    public static boolean isUpperCase(char ch) {
        return Character.isUpperCase(ch);
    }

    public static boolean isWhitespace(char ch) {
        return Character.isWhitespace(ch);
    }

    public static char toLowerCase(char ch) {
        return Character.toLowerCase(ch);
    }

    public static char toUpperCase(char ch) {
        return Character.toUpperCase(ch);
    }

    public static MyCharacter valueOf(char ch) {
        return new MyCharacter(ch);
    }

    public String toString() {
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        MyCharacter myChar = new MyCharacter('A');
        System.out.println("Character: " + myChar.charValue());
        System.out.println("Is Digit: " + MyCharacter.isDigit('7'));
        System.out.println("Is Letter: " + MyCharacter.isLetter('X'));
        System.out.println("Is Lowercase: " + MyCharacter.isLowerCase('b'));
        System.out.println("Is Uppercase: " + MyCharacter.isUpperCase('Z'));
        System.out.println("Is Whitespace: " + MyCharacter.isWhitespace(' '));
        System.out.println("To Lowercase: " + MyCharacter.toLowerCase('D'));
        System.out.println("To Uppercase: " + MyCharacter.toUpperCase('r'));

        MyCharacter myChar2 = MyCharacter.valueOf('c');
        System.out.println("ValueOf: " + myChar2.toString());
    }
}

