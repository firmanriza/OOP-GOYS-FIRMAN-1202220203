import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        int studentId = 0;
        boolean validId = false;

        do {
            try {
                System.out.println("Enter student Id:");
                studentId = scanner.nextInt();
                validId = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for Student ID.");
                scanner.next();
            }
        }while(!validId);

        scanner.nextLine();
        System.out.println("Enter course to enroll in (separated by commas):");
        String[] course = scanner.nextLine().split(", ");

        Student student = new Student(studentName, studentId);
        for (String c : course) {
            student.enrollInCourse(c);
        }

        Teacher teacher = new Teacher("yoga raditya", 1);
        Admin admin = new Admin("hudza", 2);

        displayCourse("101", "Statistika industri", "haris", "Metta");
        displayCourse("102", "Desain Jaringan Komputer", "Windy", "Amilia");
        System.out.println();
        
        System.out.println(student.getUserDetails());
        System.out.println();
        System.out.println(teacher.getUserDetails());
        System.out.println(admin.getUserDetails());
        scanner.close();
    }
    private static void displayCourse(String courseId, String courseName, String students1, String students2) {
        System.out.println("\nCourse Id: " + courseId + ",");
        System.out.println("Course Name: " + courseName); 
        System.out.println("-Student: " + students1);
        System.out.println("-Student: " + students2);
    }
}