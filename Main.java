import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ExpenseTracker tracker = new ExpenseTracker();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Expense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. List Expenses");
            System.out.println("3. Show Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    listExpenses();
                    break;
                case 3:
                    showTotalExpenses();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void addExpense() {
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        tracker.addExpense(amount, category, description);
        System.out.println("Expense added.");
    }

    private static void listExpenses() {
        System.out.println("Listing all expenses:");
        tracker.listExpenses();
    }

    private static void showTotalExpenses() {
        System.out.printf("Total expenses: %.2f%n", tracker.getTotalExpenses());
    }
}

