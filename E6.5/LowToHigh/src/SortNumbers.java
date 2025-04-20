import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String userChoice;

            do {

                System.out.print("Enter the first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = input.nextDouble();

                System.out.print("Enter the third number: ");
                double num3 = input.nextDouble();

                displaySortedNumbers(num1, num2, num3);
                
                System.out.print("Do you want to enter another set of numbers? (y/n): ");
                userChoice = input.next();
            } while (userChoice.equalsIgnoreCase("y"));
            
            System.out.println("Closing Program.");
        }
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        System.out.print("Lowest to Highest Number: ");
        
        if (num1 <= num2 && num1 <= num3) {
            System.out.print(num1 + " ");
            if (num2 <= num3) {
                System.out.println(num2 + " " + num3);
            } else {
                System.out.println(num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.print(num2 + " ");
            if (num1 <= num3) {
                System.out.println(num1 + " " + num3);
            } else {
                System.out.println(num3 + " " + num1);
            }
        } else {
            System.out.print(num3 + " ");
            if (num1 <= num2) {
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num2 + " " + num1);
            }
        }
    }
}