package Java_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOccurrences {
    public static void main(String[] args) {
        String inputString = "ram went to rameshwaram with balram";

        // Use case-insensitive regular expression to match "Ram" in any case
        Pattern pattern = Pattern.compile("ram", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputString);

        int count = 0;
        while (matcher.find()) {
        count++;

        }

        System.out.println("Number of occurrences of 'ram': " + count);
    }
}