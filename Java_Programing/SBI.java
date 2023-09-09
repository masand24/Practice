package Java_Programing;

import java.util.Scanner;

public class SBI implements RBI {

    public static double interestRate = 9.25;
    public static double accountBalance = 0;

    public static void main(String []args) {
        System.out.println("Enter Principal Amount from user");
        try (Scanner scan = new Scanner(System.in)) {
            int principalAmount = scan.nextInt();

            System.out.println("Enter time period of loan amount minimum 1 year max 20 year");
            int time = scan.nextInt();

            double simpleInterest = (principalAmount * interestRate * time) / 100;

            System.out.println("The total Interest will be for "+ time+ " year is "+ simpleInterest);

            System.out.println("The total Amount with Interest will be for "+ time+ "year is "+ (principalAmount +simpleInterest));
        }
        
    }

    @Override
    public void deposit() {

        
    }

    @Override
    public void withdraw() {
       
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    @Override
    public void bankbalance() {
       
        throw new UnsupportedOperationException("Unimplemented method 'bankbalance'");
    }

}
