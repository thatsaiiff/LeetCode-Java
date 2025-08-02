import java.util.Arrays;
import java.util.Scanner;

public class SplitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="He has good books";

        String words[]=s.split(" ");
        System.out.println("Enter two integers to update the exact word with its next letter ");
        int a=sc.nextInt(); //1st integer  2
        int b=sc.nextInt(); // 2nd integer 4

        String updated="";
        for (int i = 0; i < words[a-1].length(); i++) {
            char x=words[a-1].charAt(i);
             x=(char)(x+1);

             updated=updated+x;
        }
        words[a-1]=updated;

        if (a!=b) {
            updated = "";
            for (int i = 0; i < words[b - 1].length(); i++) {
                char x = words[b - 1].charAt(i);
                x = (char) (x + 1);

                updated = updated + x;
            }
            words[b - 1] = updated;
        }

        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i < words.length - 1) result += " ";
        }
x
        System.out.println("Updated Sentence: " + result);
    }
}
