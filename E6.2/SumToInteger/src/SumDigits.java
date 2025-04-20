import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String userChoice;

            do {
                // Prompt user for input
                System.out.print("Enter an integer: ");
                long number = scanner.nextLong();

                // Compute and display the sum of digits with equation
                String result = sumDigitsWithEquation(number);
                System.out.println("The sum of the digits is: " + result);

                // Ask if the user wants to continue
                System.out.print("Do you want to enter another number? (y/n): ");
                userChoice = scanner.next();
            } while (userChoice.equalsIgnoreCase("y"));

            System.out.println("Closing Program");
        }
    }

    public static String sumDigitsWithEquation(long n) {
        StringBuilder equation = new StringBuilder();
        int sum = 0;

        while (n > 0) {
            int digit = (int) (n % 10);
            sum += digit;

            if (equation.length() > 0) {
                equation.insert(0, " + ");
            }
            equation.insert(0, "(" + digit + ")");

            n /= 10;
        }

        return equation.append(" = ").append(sum).toString();
    }
}