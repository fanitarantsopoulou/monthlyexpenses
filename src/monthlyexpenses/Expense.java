package monthlyexpenses;

public class Expense {

    // Declaration of variables
    public final String month;
    public final String day;
    public final String description;
    public final double amount;

    // Constructor
    public Expense(String month, String day, String description, double amount) {
        this.month = month;
        this.day = day;
        this.description = description;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Expenses{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
