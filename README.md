CampusTrack – Student Academic & Fee Clearance System

## Overview

CampusTrack is a Java console application that manages student semester information. It handles academic marks, attendance, assignments, scholarships, and fee payments to determine the final semester clearance status.

## Key Features

* Stores student and course details
* Validates user inputs
* Calculates marks, percentage, and grade
* Checks pass/fail conditions
* Calculates attendance percentage
* Evaluates assignment performance
* Calculates scholarship eligibility and amount
* Calculates final payable fee and balance
* Determines semester clearance status
* Displays failed conditions and recommendations
* Supports multiple student processing

## Student Details

The program collects:

* Student ID
* Student Name
* Age
* Email
* Course
* Semester
* Career Goal
* Subject Marks
* Classes Conducted
* Classes Attended
* Assignment Scores
* Amount Paid

## Course Fees

* BCA – ₹30,000
* B.Sc Computer Science – ₹35,000
* B.E/B.Tech – ₹50,000
* MCA – ₹45,000
* Other – ₹40,000

## Java Concepts Used

* **Data Types:** `int`, `double`, `String`
* **Input:** `Scanner`
* **Operators:** Arithmetic, relational, logical, assignment, unary, ternary
* **Conditions:** `if`, `else-if`, `else`, `switch`
* **Loops:** `for`, `while`, `do-while`
* **Control Statements:** `break`, `continue`
* **Type Casting:** `(double)`
* **Formatted Output:** `printf()`

## Calculations

The application calculates:

* Total marks and percentage
* Grade
* Attendance percentage
* Assignment average
* Scholarship amount
* Final payable fee
* Fee balance

## Scholarship Rules

* **10%** – Passed, percentage ≥ 85%, and attendance ≥ 85%
* **5%** – Passed, percentage ≥ 75%, and attendance ≥ 75%
* **0%** – All other cases

## Semester Clearance

The student is **CLEARED FOR NEXT SEMESTER** when:

* Academic result is Passed
* Attendance is at least 75%
* Assignment status is Satisfactory
* Fee balance is ₹0

If any condition is not satisfied:

**ACTION REQUIRED**

The program also displays the failed conditions and relevant recommendations.

## Test Cases

1. All conditions passed
2. One subject failed despite high percentage
3. Exact boundary values
4. Attendance shortage and pending fee
5. No valid assignment entered

## Conclusion

CampusTrack is a practical Java project that demonstrates input validation, calculations, decision-making, loops, type casting, and formatted output through a student semester management system.

