import java.util.Scanner;

class Student {
    private int registerNumber;
    private String studentName;
    private String programmeName;
    private String phoneNumber;

    // Constructor
    public Student(int registerNumber, String studentName, String programmeName, String phoneNumber) {
        this.registerNumber = registerNumber;
        this.studentName = studentName;
        this.programmeName = programmeName;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getRegisterNumber() {
        return registerNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class java1_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Register Number: ");
            int registerNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Student Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Programme Name: ");
            String programmeName = scanner.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            students[i] = new Student(registerNumber, studentName, programmeName, phoneNumber);
        }

        // Print student details
        System.out.println("\n\nStudent Details:");
        System.out.printf("%-15s %-20s %-20s %-15s\n", "Register Number", "Student Name", "Programme Name", "Phone Number");
        for (Student student : students) {
            System.out.printf("%-15d %-20s %-20s %-15s\n",
                    student.getRegisterNumber(),
                    student.getStudentName(),
                    student.getProgrammeName(),
                    student.getPhoneNumber());
        }
    }
}
