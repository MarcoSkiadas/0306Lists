package org.example;

import java.util.HashMap;
import java.util.Map;

public class School {
    private String schoolName;
    private Map<String, Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new HashMap<String, Student>();
    }
    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
        System.out.println("Adding student: " + student + " to School: " + schoolName);
    }

    public void removeStudent(Student student) {
        students.remove(student.getStudentID());
        System.out.println("Removing student: " + student + " from School: " + schoolName);
    }

    public void schoolStudents() {
        System.out.println("School: " + schoolName + " Students: " + students);
    }

    public void findStudentById(String studentId) {
        for (Student student : students.values()) {
            if (student.getStudentID().equals(studentId)) {
                System.out.println("Student: "+student+"has been found for ID: "+studentId);
            }

        }
    }
    public void findStudentCourse(String studentId) {
        for (Student student : students.values()) {
            if (student.getStudentID().equals(studentId)) {

                System.out.println("Student: "+student+" is participating in ");
                System.out.println(student.showCourses());
            }
        }
    }
}