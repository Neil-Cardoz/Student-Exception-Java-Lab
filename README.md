# Student Management System with Custom Exceptions

A robust Java-based student management system that demonstrates object-oriented programming concepts with comprehensive exception handling. This system provides CRUD operations for student records with custom exceptions for better error handling and user feedback.

## Features

### Core Functionalities
- Add new students
- Display all students
- Search students by:
  - PRN (Permanent Registration Number)
  - Name
  - Position in list
- Update student records
- Delete student records

### Exception Handling
Each functionality includes multiple custom exceptions:

#### Add Student Exceptions
- `DuplicatePRNException`: When attempting to add a student with an existing PRN
- `InvalidStudentDataException`: For invalid student information

#### Display Exceptions
- `EmptyStudentListException`: When trying to display an empty student list

#### Search Exceptions
- `StudentNotFoundException`: When a student cannot be found
- `InvalidSearchCriteriaException`: For invalid search parameters

#### Update Exceptions
- `StudentUpdateException`: When update operation fails
- `InvalidUpdateDataException`: For invalid update data

#### Delete Exceptions
- `StudentDeletionException`: When deletion operation fails

#### General Validation Exceptions
- `InvalidPRNException`: For invalid PRN format
- `InvalidMarksException`: For invalid marks values

## Project Structure

```
Student-Management-System/
├── src/
│   ├── Main.java                 # Main driver class with menu interface
│   ├── Student.java              # Student entity class
│   ├── StudentOperations.java    # Business logic and operations
│   └── StudentExceptions.java    # Custom exceptions
└── README.md
```

## Technical Requirements

- Java Development Kit (JDK) 23 or higher
- Any Java IDE (Eclipse, IntelliJ IDEA, etc.)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/student-management-system.git
```

2. Navigate to the project directory:
```bash
cd student-management-system
```

3. Compile the Java files:
```bash
javac *.java
```

4. Run the application:
```bash
java Main
```

## Usage

The system presents a menu-driven interface with the following options:

1. Add Student
   - Enter PRN (11-digit number)
   - Enter Name
   - Enter Date of Birth (DD-MM-YYYY)
   - Enter Marks (0-100)

2. Display All Students
   - Shows list of all students with their details

3. Search Student by PRN
   - Enter PRN to find specific student

4. Search Student by Name
   - Enter name to find student

5. Search Student by Position
   - Enter position number in list

6. Update Student
   - Enter PRN of student to update
   - Enter new details

7. Delete Student
   - Enter PRN of student to delete

8. Exit
   - Terminate the program

## Exception Handling Examples

```java
try {
    operations.addStudent(newStudent);
} catch (StudentExceptions.DuplicatePRNException e) {
    System.out.println("Error: " + e.getMessage());
} catch (StudentExceptions.InvalidStudentDataException e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Data Validation

- PRN must be an 11-digit number
- Marks must be between 0 and 100
- Name and Date of Birth cannot be empty
- All fields are required when adding or updating a student

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

Neil Carodz

## Acknowledgments

- Thanks to all contributors who have helped with testing and improvements
- Special thanks to SIT for the project requirements and guidance
