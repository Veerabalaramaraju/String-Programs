
//First Non Repeater Charecter
import java.util.*;

class Repeater {
    void cheker(String uniq) {
        int len = uniq.length();
        int cc = len;
        for (int i = 0; i < len; i++) {
            boolean abc = true;
            for (int j = 0; j < len; j++) {
                if (i != j && (uniq.charAt(i) == uniq.charAt(j))) {
                    abc = false;
                }
            }
            if (abc) {
                System.out.println(uniq.charAt(i));
            }

        }
    }
}

class Nonrepeater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String uniq = sc.nextLine();
        Repeater rr = new Repeater();
        rr.cheker(uniq);
    }
}