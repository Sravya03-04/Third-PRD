import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========================================================");
            System.out.println("CAMPUSTRACK");
            System.out.println("========================================================");
            System.out.println("Student Academic Management System");
            System.out.println("--------------------------------------------------------");
            System.out.println("Enter student ID: ");
            String ID = sc.next();
            sc.nextLine();
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            while (age < 15 || age > 35) {
                System.out.println("Invalid age. Enter a value between 15 and 35");
                System.out.println("Enter age: ");
                age = sc.nextInt();
                System.out.println("age is accepted");
            }
            System.out.println("Enter email: ");
            String email = sc.next();
            int course;
            String courseName;
            int semesterFee = 0;
            do {
                System.out.println("Select course: ");
                System.out.println("1. BCA");
                System.out.println("2. B.Sc Computer Science");
                System.out.println("3. B.E/B.Tech");
                System.out.println("4. MCA");
                System.out.println("5. Other");
                System.out.print("Enter course choice: ");
                course = sc.nextInt();
                switch (course) {
                    case 1:
                        courseName = "BCA";
                        semesterFee = 35000;
                        break;
                    case 2:
                        courseName = "B.Sc Computer Science";
                        semesterFee = 30000;
                        break;
                    case 3:
                        courseName = "B.E/B.Tech";
                        semesterFee = 50000;
                        break;
                    case 4:
                        courseName = "MCA";
                        semesterFee = 45000;
                        break;
                    case 5:
                        courseName = "Other";
                        semesterFee = 25000;
                        break;
                    default:
                        System.out.println("Invalid course. Enter a value between 1 and 5");
                }
            } while (course < 1 || course > 5);
            int semester;
            do {
                System.out.print("Enter semester (1-8): ");
                semester = sc.nextInt();
                if (semester < 1 || semester > 8) {
                    System.out.println("Invalid semester. Enter between 1 and 8.");
                }
            } while (semester < 1 || semester > 8);
            sc.nextLine();
            System.out.print("Enter career goal: ");
            String careerGoal = sc.nextLine();
            System.out.println("Enter Java marks: ");
            int javaMarks = sc.nextInt();
            System.out.println("Enter SQL marks: ");
            int sqlMarks = sc.nextInt();
            System.out.println("Enter Web Technology marks: ");
            int webTechMarks = sc.nextInt();
            System.out.println("Enter Aptitude marks: ");
            int aptitudeMarks = sc.nextInt();
            System.out.println("Enter Communication marks: ");
            int communicationMarks = sc.nextInt();
            while (javaMarks < 0 || javaMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100");
                System.out.println("Enter Java marks: ");
                javaMarks = sc.nextInt();
            }
            while (sqlMarks < 0 || sqlMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100");
                System.out.println("Enter SQL marks: ");
                sqlMarks = sc.nextInt();
            }
            while (webTechMarks < 0 || webTechMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100");
                System.out.println("Enter Web Technology marks: ");
                webTechMarks = sc.nextInt();
            }
            while (aptitudeMarks < 0 || aptitudeMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100");
                System.out.println("Enter Aptitude marks: ");
                aptitudeMarks = sc.nextInt();
            }
            while (communicationMarks < 0 || communicationMarks > 100) {
                System.out.println("Invalid marks. Enter a value between 0 and 100");
                System.out.println("Enter Communication marks: ");
                communicationMarks = sc.nextInt();
            }
            int totalMarks = javaMarks + sqlMarks + webTechMarks + aptitudeMarks + communicationMarks;
            double percentage = (totalMarks / 500.0) * 100;
            String academicResult;
            String grade;
            if (percentage >= 40 && javaMarks >= 35 && sqlMarks >= 35 && webTechMarks >= 35 && aptitudeMarks >= 35
                    && communicationMarks >= 35) {
                academicResult = "PASSED";
            } else {
                academicResult = "FAILED";
            }
            if (academicResult.equals("FAILED")) {
                grade = "F";
            } else if (percentage >= 90) {
                grade = "A+";
            } else if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Enter total classes conducted: ");
            int classesConducted = sc.nextInt();
            System.out.println("Enter classes attended: ");
            int classesAttended = sc.nextInt();
            double attendancePercentage = (classesAttended / (double) classesConducted) * 100;
            String attendanceStatus;
            if (attendancePercentage >= 75) {
                attendanceStatus = "REGULAR";
            } else {
                attendanceStatus = "SHORTAGE";
            }
            System.out.print("How many assignment scores do you want to enter? ");
            int numberOfAssignments = sc.nextInt();
            int assignmentTotal = 0;
            int validAssignments = 0;
            for (int i = 1; i <= numberOfAssignments; i++) {
                System.out.print("Enter score for assignment " + i + " (0-10, -1 to finish): ");
                int score = sc.nextInt();
                if (score == -1) {
                    break;
                }
                if (score >= 0 && score <= 10) {
                    assignmentTotal += score;
                    validAssignments++;
                } else {
                    System.out.println("Invalid score. Enter between 0 and 10.");
                    i--;
                }
            }
            double assignmentAverage = 0;
            if (validAssignments > 0) {
                assignmentAverage = assignmentTotal / (double) validAssignments;
            }
            String assignmentStatus;
            if (assignmentAverage >= 6) {
                assignmentStatus = "SATISFACTORY";
            } else {
                assignmentStatus = "NEEDS IMPROVEMENT";
            }
            double scholarshipPercentage = 0;

            if (percentage >= 80) {
                scholarshipPercentage = 5;
            }
            double scholarshipAmount = semesterFee * scholarshipPercentage / 100;
            double finalPayableFee = semesterFee - scholarshipAmount;
            System.out.printf("\nFinal payable fee: Rs%.2f%n", finalPayableFee);
            System.out.print("Enter amount paid: ");
            double amountPaid = sc.nextDouble();
            double feeBalance = finalPayableFee - amountPaid;
            if (feeBalance < 0) {
                feeBalance = 0;
            }
            String feeStatus;
            if (amountPaid >= finalPayableFee) {
                feeStatus = "PAID";
            } else if (amountPaid > 0) {
                feeStatus = "PARTIALLY PAID";
            } else {
                feeStatus = "NOT PAID";
            }
            String failedConditions = "";
            if (academicResult.equals("FAILED")) {
                failedConditions += "Academic Result, ";
            }
            if (attendancePercentage < 75) {
                failedConditions += "Attendance, ";
            }
            if (assignmentAverage < 6) {
                failedConditions += "Assignments, ";
            }
            if (feeBalance > 0) {
                failedConditions += "Fee Payment, ";
            }
            String semesterClearance;
            if (failedConditions.equals("")) {
                semesterClearance = "CLEARED FOR NEXT SEMESTER";
            } else {
                semesterClearance = "NOT CLEARED FOR NEXT SEMESTER";
            }
            System.out.println("========================================================");
            System.out.println("              STUDENT SEMESTER REPORT                   ");
            System.out.println("========================================================");
            System.out.println("\nStudent ID                 : " + ID);
            System.out.println("Student Name               : " + name);
            System.out.println("Age                        : " + age);
            System.out.println("Email                      : " + email);
            System.out.println("Course                     : " + course);
            System.out.println("Semester                   : " + semester);
            System.out.println("Career Goal                : " + careerGoal);

            System.out.println("\n---------------- ACADEMIC SUMMARY --------------------");
            System.out.println("Java Marks                 : " + javaMarks);
            System.out.println("SQL Marks                  : " + sqlMarks);
            System.out.println("Web Technology Marks       : " + webTechMarks);
            System.out.println("Aptitude Marks             : " + aptitudeMarks);
            System.out.println("Communication Marks        : " + communicationMarks);
            System.out.println("Total Marks                : " + totalMarks + "/500");
            System.out.printf("Percentage                 : %.2f%%%n", percentage);
            System.out.println("Academic Result            : " + academicResult);
            System.out.println("Grade                      : " + grade);

            System.out.println("\n---------------- ATTENDANCE SUMMARY ------------------");
            System.out.println("Classes Conducted          : " + classesConducted);
            System.out.println("Classes Attended           : " + classesAttended);
            System.out.printf("Attendance Percentage      : %.2f%%%n", attendancePercentage);
            System.out.println("Attendance Status          : " + attendanceStatus);

            System.out.println("\n---------------- ASSIGNMENT SUMMARY ------------------");
            System.out.println("Valid Assignments          : " + validAssignments);
            System.out.println("Assignment Total           : " + assignmentTotal);
            System.out.printf("Assignment Average         : %.2f%n", assignmentAverage);
            System.out.println("Assignment Status          : " + assignmentStatus);

            System.out.println("\n---------------- FEE SUMMARY -------------------------");
            System.out.printf("Base Semester Fee          : Rs%.2f%n", (double) semesterFee);
            System.out.printf("Scholarship Percentage     : %.0f%%%n", scholarshipPercentage);
            System.out.printf("Scholarship Amount         : Rs%.2f%n", scholarshipAmount);
            System.out.printf("Final Payable Fee          : Rs%.2f%n", finalPayableFee);
            System.out.printf("Amount Paid                : Rs%.2f%n", amountPaid);
            System.out.printf("Fee Balance                : Rs%.2f%n", feeBalance);
            System.out.println("Fee Status                 : " + feeStatus);

            System.out.println("\n---------------- FINAL STATUS ------------------------");
            System.out.println("Semester Clearance         : " + semesterClearance);

            System.out.println("\n---------------- FAILED CONDITIONS -------------------");
            if (failedConditions.equals("")) {
                System.out.println("None");
            } else {
                System.out.println(failedConditions);
            }
            // ---------------- PROCESS ANOTHER STUDENT ----------------

            System.out.println(
                    "\nDo you want to process another student?");

            System.out.println("1. Yes");
            System.out.println("2. No");

            do {
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid choice. Enter 1 for Yes or 2 for No.");
                }

            } while (choice != 1 && choice != 2);

        } while (choice == 1);
        System.out.println("Thank you for using CampusTrack.");
        sc.close();
    }
}
