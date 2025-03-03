import java.util.Scanner;

public class HexagonCalc {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String choice;
            do {
                System.out.print("Enter the side: ");
                double side = input.nextDouble();
                double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
                System.out.printf("The area of the hexagon is %.2f\n", area);
                System.out.print("Do you want to calculate another hexagon area (y/n)? ");
                choice = input.next();
            } while (choice.equalsIgnoreCase("y"));
        }
        System.out.println("Exiting Program");
    }
}