[README.md](https://github.com/user-attachments/files/26351192/README.md)
# Student Grade Management System 🎓

A console-based Java application to manage student records and calculate grades automatically.

---

## Problem Statement

In many schools and colleges, tracking student marks and grades manually is time-consuming and prone to errors. This project solves that problem by providing a simple, menu-driven system where you can add students, view their grades, search records, find the class topper, and view class statistics — all from the terminal.

---

## Features

- **Add Students** — Enter student name and marks (0–100)
- **View All Students** — Displays a formatted table with grades
- **Search Student** — Find a student by name
- **Class Topper** — Instantly shows the highest scoring student
- **Class Statistics** — Average marks, pass/fail count
- **Grade Calculation** — Automatic grading using if-else logic

---

## Grade Scale

| Marks   | Grade | Description      |
|---------|-------|------------------|
| 90–100  | A+    | Outstanding      |
| 80–89   | A     | Excellent        |
| 70–79   | B     | Good             |
| 60–69   | C     | Average          |
| 50–59   | D     | Below Average    |
| 0–49    | F     | Fail             |

---

## Concepts Used (from Java Course)

- Variables and data types
- `if-else` conditions (grade logic)
- `for` loops and `do-while` loop (menu)
- `ArrayList` (dynamic student storage)
- Methods/functions
- `Scanner` for user input
- `printf` for formatted output

---

## How to Run

### Requirements
- Java JDK 8 or higher installed
- Any terminal (Command Prompt, Terminal, VS Code)

### Steps

```bash
# Step 1: Clone the repository
git clone https://github.com/YOUR_USERNAME/StudentGradeSystem.git

# Step 2: Navigate to source folder
cd StudentGradeSystem/src

# Step 3: Compile the Java file
javac StudentGradeSystem.java

# Step 4: Run the program
java StudentGradeSystem
```

---

## Sample Output

```
==========================================
   STUDENT GRADE MANAGEMENT SYSTEM
==========================================

--- MENU ---
1. Add Student
2. View All Students
3. Search Student by Name
4. Show Class Topper
5. Show Class Statistics
6. Exit
Enter your choice: 1

Enter Student Name: Rahul Sharma
Enter Marks (0-100): 87
Student added successfully!
Grade of Rahul Sharma: A  (Excellent)
```

---

## Project Structure

```
StudentGradeSystem/
│
├── src/
│   └── StudentGradeSystem.java   ← Main Java source file
│
└── README.md                     ← This file
```

---

## Author

**[Manmeet]**  
Course: Programming in Java — BYOP Project  
Platform: VITyarthi  

