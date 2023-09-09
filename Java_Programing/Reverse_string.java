package Java_Programing;

import java.util.Scanner;

public class Reverse_string {

    static String reversevalue = "";

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            System.out.println(input);

      // char[] reverse = input.toCharArray();

            for (int i = input.length()-1; i >= 0; i--) {

                System.out.print(input.charAt(i));

            }
        }

    }
}
