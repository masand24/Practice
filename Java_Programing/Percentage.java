package Java_Programing;

import java.util.Scanner;

public class Percentage {

public static double totalpercentage;
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please provide subject one marks");
            int subjectOne = scan.nextInt();
            System.out.println("Please provide subject Two marks");
            int subjectTwo = scan.nextInt();
            System.out.println("Please provide subject Three marks");
            int subjectThree = scan.nextInt();
            System.out.println("Please provide subject Four marks");
            int subjectFour = scan.nextInt();
            System.out.println("Please provide subject Five marks");
            int subjectFive = scan.nextInt();
            System.out.println("Please provide subject one marks");
            double totalpercentage = (subjectOne +subjectTwo +subjectThree +subjectFour+subjectFive)/5;
            System.out.println("The total percentage of student in class 10 is "+ totalpercentage);
        }
    }
}
