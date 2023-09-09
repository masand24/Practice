package Java_Practice;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful. Java is used widely. Java is java";
        String wordToFind = "Java";

        int count = countOccurrences(sentence, wordToFind);
        System.out.println("The word '" + wordToFind + "' appears " + count + " times in the sentence.");
    }

    public static int countOccurrences(String sentence, String wordToFind) {
        sentence = sentence.toLowerCase();
        wordToFind= wordToFind.toLowerCase();
        int count = 0;
        int index = 0;

        while ((index = sentence.indexOf(wordToFind, index)) != -1) {
            count++;
            index += wordToFind.length();
        }

        return count;
    }
}
