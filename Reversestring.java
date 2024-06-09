import java.util.*;

class Reverse {
    void reversed(String word) {
        int len = word.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}

class Reversestring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String word = sc.nextLine();
        Reverse r = new Reverse();
        r.reversed(word);
    }
}