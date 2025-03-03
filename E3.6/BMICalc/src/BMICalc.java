import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your weight in pounds: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter your height (feet): ");
            int feet = scanner.nextInt();
            System.out.print("Enter your height (inches): ");
            int inches = scanner.nextInt();
            int totalInches = (feet * 12) + inches;
            // Calculate BMI: BMI = weight (in pounds) / (height (in inches))^2 * 703
            double bmi = (weight / (totalInches * totalInches)) * 703;
            System.out.printf("Your BMI is: %.3f\n", bmi);
            System.out.println("BMI Interpretation:");
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("Normal weight");
            } else if (bmi >= 25 && bmi < 29.9) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obesity");
            }
        }
    }
}