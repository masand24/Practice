//remove or replace all special character from string
package Java_Programing;

public class RemoveSpecialCharacter {
    
    public static void main(String[] args) {
        
    String str = "§4&%%&kajsd)(nassjQWER$$$55Ü";

    String result=str.replaceAll("[^a-zA-Z0-9]", "");

    System.out.println(result);


    }
}
