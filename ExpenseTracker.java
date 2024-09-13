import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }

    public void addExpense(double amount, String category, String description) {
        Expense expense = new Expense(amount, category, description);
        expenses.add(expense);
    }

    public void listExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
}

