import java.util.*;

class Palindronecheck {
    void check(String word) {
        int len = word.length();
        int i = 0;
        for (int j = 0; j < len; j++) {
            if (word.charAt(j) == word.charAt(len - 1 - j)) {
                i = 0;
            } else {
                i = 1;
            }
        }
        if (i == 0) {
            System.out.println("The String is a Palindrone");
        } else {
            System.out.println("The String is not a Palindrone");
        }
    }
}

public class Palindromestring {
    public static void main(String args[]) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a String to check wheater it is a Palindrone or not:");
        String word = abc.nextLine();
        Palindronecheck ab = new Palindronecheck();
        ab.check(word);
    }
}
