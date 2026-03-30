import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeSystem {

    // Store student names and marks
    static ArrayList<String> names = new ArrayList<>();
    static ArrayList<Integer> marks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==========================================");
        System.out.println("   STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("==========================================");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Show Class Topper");
            System.out.println("5. Show Class Statistics");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                addStudent(sc);
            } else if (choice == 2) {
                viewAllStudents();
            } else if (choice == 3) {
                searchStudent(sc);
            } else if (choice == 4) {
                showTopper();
            } else if (choice == 5) {
                showStatistics();
            } else if (choice == 6) {
                System.out.println("\nThank you! Exiting the system...");
            } else {
                System.out.println("Invalid choice! Please enter 1-6.");
            }

        } while (choice != 6);

        sc.close();
    }

    // Function to add a student
    static void addStudent(Scanner sc) {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Check duplicate
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(name)) {
                System.out.println("Student already exists!");
                return;
            }
        }

        System.out.print("Enter Marks (0-100): ");
        int mark = sc.nextInt();
        sc.nextLine();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
            return;
        }

        names.add(name);
        marks.add(mark);

        System.out.println("Student added successfully!");
        System.out.println("Grade of " + name + ": " + getGrade(mark));
    }

    // Function to calculate grade
    static String getGrade(int mark) {
        if (mark >= 90) {
            return "A+ (Outstanding)";
        } else if (mark >= 80) {
            return "A  (Excellent)";
        } else if (mark >= 70) {
            return "B  (Good)";
        } else if (mark >= 60) {
            return "C  (Average)";
        } else if (mark >= 50) {
            return "D  (Below Average)";
        } else {
            return "F  (Fail)";
        }
    }

    // Function to view all students
    static void viewAllStudents() {
        if (names.isEmpty()) {
            System.out.println("No students added yet!");
            return;
        }

        System.out.println("\n==========================================");
        System.out.printf("%-5s %-20s %-10s %-20s%n", "No.", "Name", "Marks", "Grade");
        System.out.println("------------------------------------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%-5d %-20s %-10d %-20s%n",
                (i + 1), names.get(i), marks.get(i), getGrade(marks.get(i)));
        }

        System.out.println("==========================================");
    }

    // Function to search a student
    static void searchStudent(Scanner sc) {
        System.out.print("Enter Student Name to Search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(searchName)) {
                System.out.println("\n--- Student Found ---");
                System.out.println("Name  : " + names.get(i));
                System.out.println("Marks : " + marks.get(i));
                System.out.println("Grade : " + getGrade(marks.get(i)));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    // Function to show class topper
    static void showTopper() {
        if (names.isEmpty()) {
            System.out.println("No students added yet!");
            return;
        }

        int maxIndex = 0;
        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) > marks.get(maxIndex)) {
                maxIndex = i;
            }
        }

        System.out.println("\n--- Class Topper ---");
        System.out.println("Name  : " + names.get(maxIndex));
        System.out.println("Marks : " + marks.get(maxIndex));
        System.out.println("Grade : " + getGrade(marks.get(maxIndex)));
    }

    // Function to show class statistics
    static void showStatistics() {
        if (names.isEmpty()) {
            System.out.println("No students added yet!");
            return;
        }

        int total = 0;
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);
            if (marks.get(i) >= 50) {
                pass++;
            } else {
                fail++;
            }
        }

        double average = (double) total / marks.size();

        System.out.println("\n--- Class Statistics ---");
        System.out.println("Total Students : " + names.size());
        System.out.printf("Class Average  : %.2f%n", average);
        System.out.println("Passed         : " + pass);
        System.out.println("Failed         : " + fail);
    }
}
