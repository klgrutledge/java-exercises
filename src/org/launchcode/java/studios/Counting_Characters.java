package org.launchcode.java.studios;
import java.util.HashMap;


/**
 * Created by Krysta on 5/11/17.
 */
public class Counting_Characters {
    public static void main(String[] args) {

        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

        char[] textArray = s.toCharArray();

        for (char c : textArray) { //for-each loop
            if (!counts.containsKey(c)) {
                counts.put(c, 1); //initializing character in HashMap
            } else {
                int x = counts.get(c); //c is already in HashMap
                counts.put(c, x + 1);

            }

        }
        for (Character c : counts.keySet()) {
            System.out.println(c + " :  " + counts.get(c));
        }
    }
}


