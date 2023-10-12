package monthlyexpenses;

import java.util.ArrayList;
import java.util.List;

public class DailyExpenses{
    private List<Expenses> expense;
    private final double max;

    public DailyExpenses() {
        expense = new ArrayList<>();
        max = 0;
    }

    public void addExpense(Expenses expenses) {
        expense.add(expenses);
    }

    public void setExpense(List<Expenses> expense) {
        this.expense = expense;
    }

    public void totalExpense(List<Expenses> expense) {
        double total = 0;
        for (Expenses expenses : expense) {
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
        for (Expenses expenses : expense) {
            total += expenses.getAmount();
        }
        return total;
    }

}

