package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(3);

        Student max = new Student("Max", "Schmidt", 1320);
        Student betty = new Student("Betty", "Wurzel", 3467);
        Student lisa = new Student("Lisa", "Hops", 8976);

        //add students to list students
        students.add(max);
        students.add(betty);
        students.add(lisa);

        System.out.println(students);


        //add students to class School
        School school = new School();
        school.addStudent(max);
        school.addStudent(betty);
        school.addStudent(lisa);

        school.printStudents();

        System.out.println("Search for student: " + school.findStudentById(3467));


    }
}