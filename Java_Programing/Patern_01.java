//Dimond patern
package Java_Programing;

public class Patern_01 {

    static int num = 5;

    public static void main(String[] args) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i; j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            // Print spaces for the right half of the diamond
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the right half of the diamond
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }

}
