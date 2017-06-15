package org.launchcode.java.exercises.shapes;

import java.util.ArrayList;

/**
 * Created by Krysta on 6/15/17.
 */
public class Rectangle implements Measurable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return width;
    }

    public void setHeight(double height) {
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        double perimeter = (this.length * 2) + (this.width * 2);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    public static void main(String[] args) {
        Measurable c = new Circle(5.2);
        Measurable r = new Rectangle(4.7, 8.1);

        ArrayList<Measurable> list = new ArrayList<Measurable>(); //creating ArrayList of objects that implement interface Measurable (allows us to place different types of objects in ArrayList; we don't have to worry that our objects are representing different constructs; we know that, regardless, objects can implement getPerimeter() & getArea())
        list.add(c);
        list.add(r);

        for (Measurable m : list) {
            System.out.println(m.getArea());
        }
    }
}
