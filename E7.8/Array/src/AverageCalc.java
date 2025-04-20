import java.util.Scanner;

public class AverageCalc {

    // Method to calculate average of int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return array.length > 0 ? sum / array.length : 0;
    }

    // Overloaded method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return array.length > 0 ? sum / array.length : 0;
    }

    // Main method with repeat option
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String choice;
            
            do {
                double[] values = new double[10];
                System.out.println("\nEnter 10 double values:");
                
                for (int i = 0; i < values.length; i++) {
                    System.out.print("Value " + (i + 1) + ": ");
                    values[i] = input.nextDouble();
                }
                
                double avg = average(values);
                System.out.println("The average is: " + avg);
                
                System.out.print("\nDo you want to enter another set? (y/n): ");
                choice = input.next();
                
            } while (choice.equalsIgnoreCase("y"));
            
            System.out.println("Program ended.");
        }
    }
}