import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {

        final double USD_TO_EUR = 0.92;
        final double USD_TO_GBP = 0.76;
        final double EUR_TO_USD = 1.09;
        final double EUR_TO_GBP = 0.83;
        final double GBP_TO_USD = 1.32;
        final double GBP_TO_EUR = 1.20;
        final double USD_TO_INR = 83.23;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to GBP");
        System.out.println("3. EUR to USD");
        System.out.println("4. EUR to GBP");
        System.out.println("5. GBP to USD");
        System.out.println("6. GBP to EUR");
        System.out.println("7. USD to INR");
        System.out.print("Choose conversion type (1-7): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = amount * USD_TO_EUR;
                System.out.printf("%.2f USD is %.2f EUR\n", amount, result);
                break;
            case 2:
                result = amount * USD_TO_GBP;
                System.out.printf("%.2f USD is %.2f GBP\n", amount, result);
                break;
            case 3:
                result = amount * EUR_TO_USD;
                System.out.printf("%.2f EUR is %.2f USD\n", amount, result);
                break;
            case 4:
                result = amount * EUR_TO_GBP;
                System.out.printf("%.2f EUR is %.2f GBP\n", amount, result);
                break;
            case 5:
                result = amount * GBP_TO_USD;
                System.out.printf("%.2f GBP is %.2f USD\n", amount, result);
                break;
            case 6:
                result = amount * GBP_TO_EUR;
                System.out.printf("%.2f GBP is %.2f EUR\n", amount, result);
                break;
            case 7:
                result = amount * USD_TO_INR;
                System.out.printf("%.2f USD is %.2f INR\n", amount, result);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
