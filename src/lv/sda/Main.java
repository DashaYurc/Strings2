package lv.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = new String[5];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scan.next();
        }
        scan.close();

        System.out.println("Your entered strings: " + String.join(",", strings));

    }
}
