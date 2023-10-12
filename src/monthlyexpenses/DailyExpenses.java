package monthlyexpenses;

import java.util.ArrayList;
import java.util.List;

public class DailyExpenses{
    private List<Expense> expense;
    private final double max;

    public DailyExpenses() {
        expense = new ArrayList<>();
        max = 0;
    }

    public void addExpense(Expense expenses) {
        expense.add(expenses);
    }

    public void setExpense(List<Expense> expense) {
        this.expense = expense;
    }

    public void totalExpense(List<Expense> expense) {
        double total = 0;
        for (Expense expenses : expense) {
            total += expenses.getAmount();
        }

        if (total > max) {
            System.out.println("You have exceeded the maximum monthly expenses.");
        } else {
            System.out.println("You are within the limits. You have NOT exceeded the maximum monthly expenses.");
        }
    }

    public double calculateTotalExpenses() {
        double total = 0;
        for (Expense expenses : expense) {
            total += expenses.getAmount();
        }
        return total;
    }

}

