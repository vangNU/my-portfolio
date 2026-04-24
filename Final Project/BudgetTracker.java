// Personal Expense and Budget Monitoring System with Behavioral Insights

import java.util.Scanner;

public class BudgetTracker {
    static double totalIncome = 0;
    static double totalExpense = 0;
    static double budgetLimit = 500; // setting budget limit

    // categories
    static double foodTotal = 0;
    static double transportTotal = 0;
    static double entertainmentTotal = 0;
    
    static double otherTotal = 0;

    // add income
    public static void addIncome(Scanner userInput) {
        System.out.println("");
        System.out.print("Enter income amount: ");
        double amount = userInput.nextDouble();

        if (amount > 0) {
            totalIncome += amount;
            System.out.println("");
            System.out.println("Income added successfully!");
        } else {
            System.out.println("Income must be greater than 0!");
        }
    }
    // add expense
    public static void addExpense(Scanner userInput) {
        System.out.println("");
        System.out.print("Enter expense: ");
        double amount = userInput.nextDouble();

        if (amount <= 0) {
            System.out.println("Expense must be greater than 0!");
            return;
        }
        System.out.println("Cont.");
        System.out.println("Choose category: ");
        System.out.println("1. Food");
        System.out.println("2. Transport");
        System.out.println("3. Entertainment");
        System.out.println("4. Other");
        System.out.print(" Enter category number: ");

        int category = userInput.nextInt();

        totalExpense += amount;

        // Categorize spending
        if (category == 1) {
            foodTotal += amount;
        } else if (category == 2) {
            transportTotal += amount;
        } else if (category == 3) {
            entertainmentTotal += amount;
        } else {
            otherTotal += amount;
        }
        System.out.println("Expense added!");
        
        checkBudget();
    }
    

    public static void checkBudget() {
        if (totalExpense > budgetLimit) {
            System.out.println("!!Warning: You have exceeded your budget!!");
        } else if (totalExpense > budgetLimit * 0.8) {
            System.out.println("Be Careful: You are nearing your budget limit!");
        } else {
            System.out.println("You are within your budget.");
        }
    }
    // Summary and simple Insights
    public static void showSummary() {
        double balance = totalIncome - totalExpense;

        System.out.println("\nSummary: ");
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expense: $" + totalExpense);
        System.out.println("Remaining Bakance: $" + balance);

        System.out.println("\nSpending By Category: ");
        System.out.println("Food: $" + foodTotal);
        System.out.println("Transport: $" + transportTotal);
        System.out.println("Entertainment: $" + entertainmentTotal);
        System.out.println("Other: $" + otherTotal);

        // Behavioral Insights
        System.out.println("\n**Behavioral Insight**");

        if (entertainmentTotal > foodTotal && entertainmentTotal > transportTotal) {
            System.out.println("You are spending more on entertainment than essentials.");
        } else if (foodTotal > budgetLimit * 0.4) {
            System.out.println("High food spending detected!");
        } else if (balance < 0) {
            System.out.println("Spending more than you earn!");
        } else {
            System.out.println("Spending looks balanced.");
        }
    }

    // Setting budget limit
    public static void setBudget(Scanner userInput) {
        System.out.println("");
        System.out.print("Enter new budget limit: ");
        double newLimit = userInput.nextDouble();

        if (newLimit > 0) {
            budgetLimit = newLimit;
            System.out.println("");
            System.out.println("Budget updated!");
        } else {
            System.out.println("Budget must be greater than 0.");
        }
    }
}
