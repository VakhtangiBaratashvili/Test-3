package Implementations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplitter {
    public static String[] split(String s, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);


        StringBuilder resultBuilder = new StringBuilder();
        while (matcher.find()) {
            resultBuilder.append(matcher.group()).append(",");
        }

        String[] result = resultBuilder.toString().split(",");
        return result;
    }

    public static void main(String[] args) {
        String input1 = "ab#12#453";
        String regex1 = "#";
        String[] result1 = split(input1, regex1);
        for (String str : result1) {
            System.out.println(str);
        }

        System.out.println("---------------");

        String input2 = "a?b?gf#e";
        String regex2 = "[?#]";
        String[] result2 = split(input2, regex2);
        for (String str : result2) {
            System.out.println(str);
        }
    }
}

