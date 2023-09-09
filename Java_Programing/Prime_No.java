package Java_Programing;

import java.util.Scanner;

public class Prime_No {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the no to find its prime or not");

        int prime_no = input.nextInt();

        if (isPrime(prime_no)) {
            System.out.println(prime_no + " is a prime no");

        }

        else {
            System.out.println(prime_no + " is not a prime no");
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {

            return false;

        }
        if (num == 2) {
            return true;

        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
