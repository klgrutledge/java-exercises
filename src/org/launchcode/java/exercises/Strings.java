package org.launchcode.java.exercises;
import java.util.Scanner;

/**
 * Created by Krysta on 5/8/17.
 */
public class Strings {
    public static void main(String[] args) {
        String sentence;
        String sentence_lc;
        String search_term;
        String search_term_lc;
        boolean result;
        Scanner in;

        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        sentence_lc = sentence.toLowerCase();
        in = new Scanner(System.in);
        System.out.println("Please enter your search term: ");
        search_term = in.nextLine();
        search_term_lc = search_term.toLowerCase();
        result = sentence_lc.contains(search_term_lc);
        System.out.println(result);



    }
}
