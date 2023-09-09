package Java_Practice;

public class Reverse {

    static String str = " My name is Saurabh masand ";

    // below statement replace all space between a sentence to without space
    static String originalstr = str.replaceAll(" ", "");
    static String reverseStr = "";

     public static void reverseString()
        {
        for (int i = originalstr.length() - 1; i >= 0; i--)

        {
            reverseStr = reverseStr + originalstr.charAt(i);
        }

        System.out.println(reverseStr);

        return ;

    }

    public static void main(String[] args) {


        reverseString();


       
    }

}
