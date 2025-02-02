import java.util.Scanner;

public class BillTotalCalculator {

    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter subtotal: ");
                double subtotal = scanner.nextDouble();
                System.out.print("Enter gratuity rate (as a percentage): ");
                double gratuityRate = scanner.nextDouble();
                double gratuity = subtotal * (gratuityRate / 100);
                double total = subtotal + gratuity;
                System.out.println("Gratuity: " + gratuity);
                System.out.println("Total: " + total);
                System.out.print("Do you want to perform another calculation? (y/n): ");
                String response = scanner.next();
                if (response.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }
}