package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        System.out.println("Adding student: " + student + " to School: " + schoolName);
        students.add(student);
    }

    public void removeStudent(Student student) {
        System.out.println("Removing student: " + student + " from School: " + schoolName);
        students.remove(student);
    }
    public void removeStudent(String studentId) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentId)) {
                System.out.println("Removing student: " + student + " from School: " + schoolName);
                students.remove(student);
            }
        }
    }
    public void schoolStudents() {
        System.out.println("School: " + schoolName + " Students: " + students);
    }

    public void findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentId)) {
                System.out.println("Student: "+student+"has been found for ID: "+studentId);
            }

        }
    }
    public void findStudentCourse(String studentId) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentId)) {

                System.out.println("Student: "+student+" is participating in ");
                System.out.println(student.showCourses());
            }
        }
    }
}