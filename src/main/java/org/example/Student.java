package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    //set properties
    private String firstName;
    private String lastName;
    private String studentID;
    private List<Course> courses;

    //create Constructor
    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.courses = new ArrayList<Course>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Added course: " + course + " for Student: " + firstName + " " + lastName);
    }
    public String showCourses() {
        for (Course course : courses) {
            System.out.println(courses);
        }

        return "";
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
