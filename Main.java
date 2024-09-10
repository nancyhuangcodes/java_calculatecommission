package commissioncalculator;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter sales amount: ");
            double salesAmount = scanner.nextDouble();
            double commission = calculateCommission(salesAmount);

        // Display the commission
        if (commission == 0) {
            System.out.println("No commission for sales below $1000.");
        } else {
            System.out.printf("The commission is: %.2f%n", commission);
        }
        // Close the scanner
        scanner.close();
    }

    // To calculate commission
    public static double calculateCommission(double salesAmount) {
        double commissionPercentage;

        // Determine the commission percentage based on sales amount
        if (salesAmount >= 10000) {
            commissionPercentage = 0.3;                  // 30% commission
        } else if (salesAmount >= 5001) {
            commissionPercentage = 0.2;                  // 20% commission
        } else if (salesAmount >= 1001) {
            commissionPercentage = 0.1;                  // 10% commission
        } else {
            return 0;                                   // zero commission for sales below $1000
        }

        // Calculate and return the commission
        return salesAmount * commissionPercentage;
    }
}


