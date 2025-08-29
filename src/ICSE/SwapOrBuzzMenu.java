package ICSE;

import javax.swing.*;
import java.util.Scanner;

public class SwapOrBuzzMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********MENU**************");
        System.out.println("1:Swapping the value \n2:Buzz Number \n****Enter your Choice 1 or 2****");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int a, b, c = 0;
                System.out.println("Enter value of A & B");

                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println("a = " + a + "\n b = " + b);
                c = a;
                a = b;
                b = c;

                System.out.println("Values after swapping");
                System.out.println("a = " + a + "\n b = " + b);
                break;
            case 2:
                System.out.println("Enter no to check if it is a buzz no");
                int n = sc.nextInt();
                if (n % 7 == 0 || n % 10 == 7) {
                    System.out.println("buzz");
                } else {
                    System.out.println("not a buzz");
                }
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }
}
