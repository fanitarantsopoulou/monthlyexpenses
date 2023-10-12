package monthlyexpenses;

import java.util.ArrayList;
import java.util.List;

public class DailyExpenses{
    private List<Expense> expenses;
    private final double max;

    public DailyExpenses() {
        expenses = new ArrayList<>();
        max = 0;
    }

    public void addExpense(Expense expenses) {
        this.expenses.add(expenses);
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public void totalExpense(List<Expense> expense) {
        double total = 0;
        for (Expense expenses : expense) {
            total += expenses.amount();
        }

        if (total > max) {
            System.out.println("You have exceeded the maximum monthly expenses.");
        } else {
            System.out.println("You are within the limits. You have NOT exceeded the maximum monthly expenses.");
        }
    }

    public double calculateTotalExpenses() {
        double total = 0;
        for (Expense expenses : expenses) {
            total += expenses.amount();
        }
        return total;
    }

}

