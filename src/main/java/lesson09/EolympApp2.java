package lesson09;

import java.util.Scanner;

public class EolympApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (a >= b && a >= c && a >= d) {
            System.out.print(a);

        } else if (b > c && b > d && b > a) {
            System.out.println(b);

        } else if (c >= d && c > b && c > a) {
            System.out.println(c);

        } else {
            System.out.println(d);
        }


    }
}