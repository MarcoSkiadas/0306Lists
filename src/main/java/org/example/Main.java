package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // adding students
        Student student1 = new Student("Peter","Pan","1");
        Student student2 = new Student("Alfredo","Amsel","2");
        Student student3 = new Student("Bob","Bäcker","3");

        // set a list with students
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        // print list
        System.out.println(students);

        //adding a school
        School hogwarts = new School("Hogwarts");

        //adding students to school
        hogwarts.addStudent(student1);
        hogwarts.addStudent(student2);

        hogwarts.schoolStudents();

        hogwarts.findStudentById("1");
        hogwarts.removeStudent("1");

        hogwarts.schoolStudents();

        Course course1 = new Course("Java","D","Shrimp");
        Course course2 = new Course("Python","B","Banana");

        student1.addCourse(course1);
        student2.addCourse(course2);

        hogwarts.findStudentCourse("2");

        Sack sack = new Sack();

        System.out.println(sack.size());
        sack.add(2);
        sack.add(3);
        System.out.println(sack.size());
        sack.remove(1);
        System.out.println(sack.size());


    }
}