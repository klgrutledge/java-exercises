package org.launchcode.java.exercises;

/**
 * Created by Krysta on 5/10/17.
 */
public class ArrayList_and_Strings {
    public static void main(String[] args) {

        int word_length;
        String CharArray[];
        String example_string = "Hello, World! I'm just getting the hang of Java.";
        String example_string_words[] = example_string.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        for (String word : example_string_words) {
            if (word.length() == 5) {
                System.out.println(word);
            }


        }
    }
}
