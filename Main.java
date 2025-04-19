//Main.java
/*

 * Name: Neil Cardoz
 * PRN: 23070126079
 * Batch: 23-27
 *
 */
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        // Main menu loop
        do {
            // Displaying menu options
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Adding a new student
                    System.out.print("Enter PRN: ");
                    String prn = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Date of Birth (DD-MM-YYYY): ");
                    String dob = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine(); // Consume newline

                    Student newStudent = new Student(prn, name, dob, marks);
                    operations.addStudent(newStudent);
                    break;

                case 2:
                    // Displaying all students
                    operations.displayStudents();
                    break;
                case 3:
                // Searching for a student by PRN
                System.out.print("Enter PRN to search: ");
                String searchPrn = sc.nextLine();
                Student foundStudent = operations.searchByPrn(searchPrn);
                if (foundStudent != null) {
                    System.out.println("Student Found: " + foundStudent);
                } else {
                    System.out.println("Student with PRN " + searchPrn + " not found.");
                }
                break;

                case 4:
                    // Searching for a student by Name
                    System.out.print("Enter Name to search: ");
                    String searchName = sc.nextLine();
                    Student foundByName = operations.searchByName(searchName);
                    if (foundByName != null) {
                        System.out.println("Student Found: " + foundByName);
                    } else {
                        System.out.println("Student with Name " + searchName + " not found.");
                    }
                    break;

                case 5:
                    // Searching for a student by position (index)
                    System.out.print("Enter position index to search: ");
                    int pos = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    Student foundByPos = operations.searchByPosition(pos);
                    if (foundByPos != null) {
                        System.out.println("Student at position " + pos + ": " + foundByPos);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 6:
                    // Updating a student's details
                    System.out.print("Enter PRN of the student to update: ");
                    String updatePrn = sc.nextLine();
                    Student existingStudent = operations.searchByPrn(updatePrn);
                    if (existingStudent != null) {
                        System.out.print("Enter new Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new Date of Birth (DD-MM-YYYY): ");
                        String newDob = sc.nextLine();
                        System.out.print("Enter new Marks: ");
                        double newMarks = sc.nextDouble();
                        sc.nextLine(); // Consume newline

                        Student updatedStudent = new Student(updatePrn, newName, newDob, newMarks);
                        boolean isUpdated = operations.updateStudent(updatePrn, updatedStudent);
                        if (isUpdated) {
                            System.out.println("Student updated successfully.");
                        } else {
                            System.out.println("Update failed.");
                        }
                    } else {
                        System.out.println("Student with PRN " + updatePrn + " not found.");
                    }
                    break;
                case 7:
                    // Deleting a student
                    System.out.print("Enter PRN of the student to delete: ");
                    String deletePrn = sc.nextLine();
                    boolean isDeleted = operations.deleteStudent(deletePrn);
                    if (isDeleted) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student with PRN " + deletePrn + " not found.");
                    }
                    break;
                case 8:
                    // Exiting the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 8);

        sc.close();
            }
}
