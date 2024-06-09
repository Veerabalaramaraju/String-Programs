import java.util.*;

class Chekerin {
    void countin(String word) {
        int leng = word.length();
        int vowel = 0;
        int consonat = 0;
        word = word.toLowerCase();
        for (int i = 0; i < leng; i++) {
            char aa = word.charAt(i);
            if (aa == 'a' || aa == 'e' || aa == 'i' || aa == 'o' || aa == 'u') {
                vowel = vowel + 1;
            } else {
                consonat = consonat + 1;
            }
        }
        System.out.println("Vowel Count " + vowel);
        System.out.println("Consont Count " + consonat);
    }
}

public class Vowelconsonats {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = sc.nextLine();
        Chekerin aaa = new Chekerin();
        aaa.countin(word);
    }
}
