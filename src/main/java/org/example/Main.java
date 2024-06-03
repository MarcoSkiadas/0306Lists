package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Peter","Pan",1);
        Student student2 = new Student("Alfredo","Amsel",2);
        Student student3 = new Student("Bob","Bäcker",3);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

    }
}