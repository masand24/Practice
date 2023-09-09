package Java_Programing;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String fruit = input.next();

            switch (fruit) {
                case "Apple": System.out.println("Its a pink Apple");
                    
                    break;

                    case "Mango": System.out.println("Its a king of fruits");
                    
                    break;
                    case "Orange": System.out.println("Its orange in color");
                    
                    break;
                    case "Banana": System.out.println("Its yello in color");
                    
                    break;
            
                default:System.out.println("Its not identified");
                    break;
            }
        }

        
    }
}
