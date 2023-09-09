package Java_Programing;

public class RemoveAllSpace {
public static void main(String[] args) {
    

    String str ="    J a   V    A";

    String output= str.replaceAll("\\s", "");

    System.out.println(output);
}   
}
