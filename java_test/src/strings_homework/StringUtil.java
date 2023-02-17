package strings_homework;

import java.util.Scanner;

public class StringUtil {
    public static String concatParams(String a, String b) {
        return a + b;
    }

    public static String concatParams(int a, int b, String c) {
        return a + b + c;
    }

    public static String concatParams(String a, int b, String c) {
        return a + b + c;
    }

    public static String concatParams(String a, int b, int c, String d) {
        return a + b + c + d;
    }

    public static void splitString(String str) {
        System.out.print(str.replace(' ', '\n'));
    }

    public static void reverseString(String str) {
        StringBuilder reverse = new StringBuilder();
        reverse.append(str);
        System.out.print(reverse.reverse());
    }

    public static int countSubString(String line, String token) {
        int count = 0;
        int index = line.indexOf(token);
        while (index != -1) {
            count++;
            index = line.indexOf(token, index + 1);
        }
        return count;
    }

    public static String makeUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String makeUpperCase(StringBuilder str) {
        return str.toString().toUpperCase();
    }

    public static StringBuilder write20LengthString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string, max 20 characters: ");
        StringBuilder str = new StringBuilder(scanner.nextLine());
        if (str.length() > 20) {
            System.out.println("Your entered string is longer then 20 chars! Please try again.");
            return write20LengthString();
        }else {
            while (str.length() < 20) {
                str.append('*');
            }
            return str;
        }
    }

    public static String stringExceptA(String str) {
        return str.replace("a", "");
    }

    public static String stringExceptA(StringBuilder str) {
        return str.toString().replace("a", "");
    }

    public static String replaceAToAsterisk(String str) {
        return str.replace("a", "*");
    }

    public static String getLongestWord(String str) {
        String subString = "";
        String[] strArray = str.split(" ");
        for (String word : strArray) {
            if (word.length() >= subString.length()) {
                subString = word;
            }
        }
        return subString;
    }

    public static int getFirstMatchedIndex(String str, String c) {
        return str.indexOf(c);
    }

    public static void printSubLine(String line, int n) {
        System.out.println(line.substring(0, n));
    }

    public static void printSubLine(StringBuilder line, int n) {
        System.out.println(line.substring(0, n));
    }

    public static void checkStringEmpty(String str) {
        if (str == null || str.equals("")) {
            System.out.println("Your entered string is null or empty");
        }else {
            System.out.println("Your entered string is: " + str);
        }
    }

    public static String getLongestSubString(String str) {
        String subString = "";
        String[] strArray = str.split(",");
        for (String word : strArray) {
            if (word.length() >= subString.length()) {
                subString = word;
            }
        }
        return subString;
    }

    public static void main(String[] args) {
        System.out.println(concatParams("hello", "world"));
        System.out.println(concatParams(1, 2, "hello"));
        System.out.println(concatParams("1", 2, "hello"));
        System.out.println(concatParams("hello", 1, 2, "world"));

        splitString("We are living in Armenia");

        reverseString("simple");

        System.out.println(countSubString("We are living in an yellow submarine. We don't  have anything", "in"));

        System.out.println(makeUpperCase("hello woRld"));
        System.out.println(makeUpperCase(new StringBuilder("hello world")));

        System.out.println(write20LengthString());

        System.out.println(stringExceptA("We are living above an yellow submarine. We don't  have anything"));
        System.out.println(stringExceptA(new StringBuilder("We are living in an yellow submarine. We don't  have anything")));

        System.out.println(replaceAToAsterisk("We are living above an yellow submarine. We don't  have anything"));

        System.out.println(getLongestWord("We are living in an yellow submarine . We don't  have anything"));

        System.out.println(getFirstMatchedIndex("We are living above an lovely yellow submarine. We don't  have anything", "a"));

        printSubLine("We are also living in an yellow submarine. We don't  have anything", 10);
        printSubLine(new StringBuilder("We are living in an yellow submarine. We don't  have anything"), 10);

        checkStringEmpty("");

        System.out.println(getLongestSubString("We, are, living, in an, yellow, submarine, We don't,  have anything"));
    }
}
