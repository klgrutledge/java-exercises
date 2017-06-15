package org.launchcode.java.studios;
import java.util.Scanner;

/**
 * Created by Krysta on 5/8/17.
 */
public class Area {
    public static void main(String[] args) {
        double r;
        double a;
        Scanner in;

        in = new Scanner(System.in); //creating instance of Scanner object by calling the constructor of the Scanner object that specifies we are gathering information from keyboard
        System.out.println("Enter a radius: "); //this allows us to print text directly to the console, in this case a user prompt
        r = in.nextDouble();

        if (r > 0) {
            a = Math.PI * r * r;
            System.out.println("The area of a circle of radius " + r + " is: " + a);
        } else {
            System.out.println("Please enter a positive value for radius.");
        }

        //while(r<0) {
            //System.out.println("Please enter a positive value for radius.");
            //r = in.nextDouble();


    }
}
