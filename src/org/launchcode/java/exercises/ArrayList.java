package org.launchcode.java.exercises;

/**
 * Created by Krysta on 5/10/17.
 */
public class ArrayList {

    public static void main(String[] args) {
        int num_list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i : num_list) {


            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
