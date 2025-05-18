import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result;
            double num1, num2;

            switch (choice) {
                case 1:
                    num1 = getNumber(scanner, "Enter first number: ");
                    num2 = getNumber(scanner, "Enter second number: ");
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    num1 = getNumber(scanner, "Enter first number: ");
                    num2 = getNumber(scanner, "Enter second number: ");
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    num1 = getNumber(scanner, "Enter first number: ");
                    num2 = getNumber(scanner, "Enter second number: ");
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    num1 = getNumber(scanner, "Enter numerator: ");
                    num2 = getNumber(scanner, "Enter denominator: ");
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    num1 = getNumber(scanner, "Enter a number: ");
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot calculate square root of a negative number.");
                    }
                    break;
                case 6:
                    num1 = getNumber(scanner, "Enter base: ");
                    num2 = getNumber(scanner, "Enter exponent: ");
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }

    private static double getNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
