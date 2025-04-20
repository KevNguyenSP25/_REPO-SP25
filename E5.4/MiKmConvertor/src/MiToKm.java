import java.util.Scanner;

public class MiToKm {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final double MILES_TO_KM_CONVERSION = 1.609;
            String userResponse;
            
            do {
                System.out.print("Enter miles: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    System.out.print("Enter miles: ");
                    scanner.next(); // Consume the invalid input
                }
                double miles = scanner.nextDouble();

                double kilometers = miles * MILES_TO_KM_CONVERSION;

                System.out.printf("%-10.2f%-15.3f%n", miles, kilometers);

                System.out.print("Do you want to enter another value? (y/n): ");
                userResponse = scanner.next().trim().toLowerCase();
                
            } while (userResponse.equals("y"));
            
            System.out.println("Closing Program");
        }
    }
}