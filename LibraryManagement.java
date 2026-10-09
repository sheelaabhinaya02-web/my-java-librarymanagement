import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Java",
            "Python",
            "C Programming"
        };

        System.out.println("--- Library Management ---");
        System.out.println("Available Books:");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("Enter book number to issue: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= books.length) {
            System.out.println("Book Issued: " + books[choice - 1]);
        } else {
            System.out.println("Invalid book number");
        }

        System.out.print("Enter overdue days (0 if none): ");
        int days = sc.nextInt();

        int fine = Math.max(0, days) * 5;

        System.out.println("Library Fine: Rs. " + fine);

        sc.close();
    }
}