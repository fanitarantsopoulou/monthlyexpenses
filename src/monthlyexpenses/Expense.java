package monthlyexpenses;

public record Expense(
        String month,
        String day,
        String description,
        double amount
) {
}
