package monthlyexpenses;
//This program helps you control your monthly finances, by keeping track of your daily expenses

import java.util.Scanner;

public class MonthlyExpenses {
    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   DailyExpenses e=new DailyExpenses();
   System.out.println("Please enter the maximum monthly expenses:");
   double max=in.nextDouble();
   in.nextLine();
  while (true){
      System.out.print("Please enter the month: ");
            String month = in.nextLine();
            
            System.out.print("Please enter the day: ");
            String day = in.nextLine();
            
            System.out.print("Please enter the expense description: ");
            String description = in.nextLine();
            
            System.out.print("Pleas enter the expense amount: ");
            double amount=in.nextDouble();
  
 Expenses expense = new Expenses(month, day, description, amount);
            e.addExpense(expense);
            System.out.print("Do you want to add more expenses? (yes/no): ");
            String moreExpenses = in.nextLine().toLowerCase();
            if (moreExpenses.equals("no")) {
                break;
            }
  }
            System.out.println("Total expenses: " + e.calculateTotalExpenses());
try {
    if (e.calculateTotalExpenses() > max) {
        throw new MaxLimitExceededException("You have exceeded the maximum monthly expenses.");
    } else {
        System.out.println("You are within the limits. You have NOT exceeded the maximum monthly expenses.");
    }
} catch (MaxLimitExceededException ex) {
    System.out.println(ex.getMessage());
}
    }
}

    
