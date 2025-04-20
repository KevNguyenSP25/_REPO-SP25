import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String userResponse;
            
            do {
                // Prompt user for initial tuition and annual increase rate
                System.out.print("Enter the initial tuition amount: $");
                double initialTuition = scanner.nextDouble();
                
                System.out.print("Enter the annual tuition increase rate (as a percentage): ");
                double annualIncreaseRate = scanner.nextDouble();
                
                // Calculate tuition in 10 years
                double tuitionInTenYears = initialTuition;
                for (int year = 1; year <= 10; year++) {
                    tuitionInTenYears *= (1 + annualIncreaseRate / 100);
                }
                
                // Calculate total cost of four years' tuition starting after the tenth year
                double totalCostAfterTenYears = 0;
                double tuitionForNextFourYears = tuitionInTenYears;
                for (int year = 1; year <= 4; year++) {
                    totalCostAfterTenYears += tuitionForNextFourYears;
                    tuitionForNextFourYears *= (1 + annualIncreaseRate / 100); // Increase tuition for the next year
                }

                System.out.printf("Tuition in 10 years: $%.2f%n", tuitionInTenYears);
                System.out.printf("Total cost of four years' tuition after the tenth year: $%.2f%n", totalCostAfterTenYears);

                System.out.print("Do you want to perform another calculation? (y/n): ");
                userResponse = scanner.next().trim().toLowerCase();
                
            } while (userResponse.equals("y"));
            
            System.out.println("Closing Program - Enjoy School!");
        }
    }
}