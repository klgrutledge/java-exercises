package org.launchcode.java.exercises;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by Krysta on 5/11/17.
 */
public class Adding_ArrayLists {

    public static void main(String[] args){

        ArrayList <Integer> bigger = new ArrayList<>(Arrays.asList(3, 2, 5, 8));
        ArrayList<Integer> smaller = new ArrayList<>(Arrays.asList(7, 5));
        System.out.println(add(bigger, smaller));
    }
    public static ArrayList<Integer> add (ArrayList < Integer > a, ArrayList < Integer > b){
        //determine which array is longer (assuming a is > b)
        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;
        if (a.size() < b.size()) {
            bigger = b;
            smaller = a;
        }
        //create a new ArrayList that holds results
        ArrayList<Integer> result = new ArrayList<Integer>(); //calling constructor for ArrayList

        //for each index in the longer list
        for (int i : bigger) { //different way to iterate would be for(int i=0; i < bigger.size(); i++) {
            if (bigger.indexOf(i) < smaller.size()) { //different way would be if(i< smaller.size()) {
                int sum = i + smaller.get(bigger.indexOf(i)); //different way would be result.add(bigger.get(i) + smaller.get(i));
                result.add(sum);
            }
            else {
                result.add(i); //different way would be result.add(bigger.get(i));
            }
        }
        //if index exists in smaller list
        //add values, store in result
        //else
        //put value from larger list in result

        //return result
        return result;
    }
}