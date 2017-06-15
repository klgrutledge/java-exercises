package org.launchcode.java.exercises;
import java.util.Scanner;

/**
 * Created by Krysta on 5/8/17.
 */
public class Rectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter a length (in cm): ");
        length = in.nextDouble();

        in = new Scanner(System.in);
        System.out.println("Please enter a width (in cm): ");
        width = in.nextDouble();

        area = length * width;
        System.out.print("The area of this rectangle is: " + area + " cm.");

    }


}
