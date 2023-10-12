package monthlyexpenses;

public class Expenses {

    // Declaration of variables
    private String month;
    private String day;
    private String description;
    private double amount;
    private double total = 0;

    // Constructor
    public Expenses(String month, String day, String description, double amount) {
        this.month = month;
        this.day = day;
        this.description = description;
        this.amount = amount;
    }

    // Methods
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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

    public double totalExpenses(double amount) {
        total += amount;
        return total;
    }
}
