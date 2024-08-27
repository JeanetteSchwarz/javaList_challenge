package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Student> school;

    public School(){
        school = new ArrayList<>();
    }
    public void addStudent(Student student){
        school.add(student);
    }

    public void printStudents(){
        for (Student student : school){
            System.out.println(student);
        }
    }

    //find student by id
    public Student findStudentById(int id){
        for(Student foundStudent:school) {
            if (foundStudent.getStudentID() == id){
                return foundStudent;
            }
        }
        return null;
    }

    //remove student
    public void removeStudent(Student student){
        school.remove(student);
    }
    
    //------------------

    public School(List<Student> school) {
        this.school = school;
    }

    public List<Student> getSchool() {
        return school;
    }

    public void setSchool(List<Student> school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school1 = (School) o;
        return Objects.equals(school, school1.school);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(school);
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }


}
