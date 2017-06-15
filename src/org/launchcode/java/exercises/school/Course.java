package org.launchcode.java.exercises.school;

import java.util.ArrayList;

/**
 * Created by Krysta on 5/23/17.
 */
public class Course {
    private String title;
    private String instructor;
    private ArrayList lectures;
    private Object courseStudent = new Student(); //Can I do this? Creating instance of Student class, termed courseStudent?

    public String getTitle() {
        return title;
    }

    public void setTitle(String aTitle) {
        title = aTitle;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String anInstructor) {
        instructor = anInstructor;
    }

    public ArrayList getLectures() {
        return lectures;
    }

    private void setLectures(ArrayList aLectures) { //made private access due to direct manipulation of gpa by adjusting number of credits
        lectures = aLectures;
    }

    public Object getCourseStudent() {
        return courseStudent;
    }

    private void setCourseStudent(Object aCourseStudent) { //made private access due to the sensitive nature of gpa data
        courseStudent = aCourseStudent;
    }

}
