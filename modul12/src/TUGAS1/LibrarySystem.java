package TUGAS1;

import java.util.Scanner;

public class LibrarySystem {
    static Scanner scanner = new Scanner(System.in);
    static Student[] students = {
        new Student("202210370311203"),
        new Student("202310370311122"),
        
    };
    static Admin admin = new Admin("admin", "admin");

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("\n===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter your NIM : ");
                String nim = scanner.next();
                boolean found = false;
                for (Student student : students) {
                    if (student.checkNim(nim)) {
                        System.out.println("Successful Login as Student");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("User Not Found");
                }
            } else if (choice == 2) {
                System.out.print("Enter your username (admin): ");
                String username = scanner.next();
                System.out.print("Enter your password (admin): ");
                String password = scanner.next();
                if (admin.checkAdmin(username, password)) {
                    System.out.println("Successful Login as Admin");
                } else {
                    System.out.println("Admin User Not Found!!");
                }
            } else if (choice == 3) {
                System.out.println("adios");
                break;
            } else {
                System.out.println("Invalid option, please choose again.");
            }
        }
    }
}

