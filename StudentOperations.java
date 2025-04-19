/*
 * StudentOperations.java
 * Description: This file contains methods to perform operations on an ArrayList of Student objects.
 */

import java.util.ArrayList;

public class StudentOperations {
    // ArrayList to store Student objects
    private ArrayList<Student> students;

    // Constructor to initialize the ArrayList
    public StudentOperations() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }
    // Function to display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (int i = 0; i < students.size(); i++) {
                System.out.println("Position " + i + ": " + students.get(i));
            }
        }
    }

    // Function to search for a student by PRN
    public Student searchByPrn(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                return student;
            }
        }
        return null;
    }

    // Function to search for a student by name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
    // Function to search for a student by position (index)
    public Student searchByPosition(int position) {
        if (position >= 0 && position < students.size()) {
            return students.get(position);
        }
        return null;
    }
    // Function to update a student's details based on PRN
    public boolean updateStudent(String prn, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPrn().equals(prn)) {
                students.set(i, updatedStudent);
                return true;
            }
        }
        return false;
    }
    // Function to delete a student by PRN
    public boolean deleteStudent(String prn) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPrn().equals(prn)) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
