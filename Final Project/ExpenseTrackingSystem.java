// Personal Expense and Budget Monitoring System with Behavioral Insights 

import java.util.Scanner;

public class ExpenseTrackingSystem {

    public static void main(String[] args) {
        // Scanner system
        Scanner userInput = new Scanner(System.in);
        int choice = 0;

        System.out.println("Personal Expense & Budget Tracker: ");

        // while loop
        while (choice !=5) {
            // Menu
            System.out.println("\nMenu");

            System.out.println("1. Add Income: ");
            System.out.println("2. Add Expense: ");
            System.out.println("3. View Summary: ");
            System.out.println("4. Set Budget Limit: ");
            System.out.println("5. Exit: ");
            System.out.print("Choose an option: ");

            // Validate input
            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                userInput.next(); // Clears input
                continue;
            }

            // Add ExpenseTrackingSystem
            if (choice ==1) {
                BudgetTracker.addIncome(userInput);
            } else if (choice ==2) {
                BudgetTracker.addExpense(userInput);
            } else if (choice ==3) {
                BudgetTracker.showSummary();
            } else if (choice ==4) {
                BudgetTracker.setBudget(userInput);
            } else if (choice ==5) {
                System.out.println(".....");
                System.out.println("Exiting program. Thank you! Goodbye.");
            } else {
                System.out.println("Invalid! Try again!");
            }

        }
        userInput.close();
    }
    

}




