package org.launchcode.java.exercises.school;

/**
 * Created by Krysta on 5/23/17.
 */
public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits) { //made private access due to direct manipulation of gpa by adjusting number of credits
        numberOfCredits = aNumberOfCredits;
    }

    public double getgpa() {
        return gpa;
    }

    private void setgpa(int aGpa) { //made private access due to the sensitive nature of gpa data
        gpa = aGpa;
    }


}
