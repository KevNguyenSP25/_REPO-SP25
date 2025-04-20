import java.util.Scanner;

public class ElimDupl {

    public static int[] eliminateDuplicates(int[] list) {
        int[] tempArray = new int[list.length];
        int distinctCount = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < distinctCount; j++) {
                if (list[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[distinctCount] = list[i];
                distinctCount++;
            }
        }

        int[] result = new int[distinctCount];
        System.arraycopy(tempArray, 0, result, 0, distinctCount);

        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String userChoice;
            
            do {

                System.out.print("Enter ten numbers: ");
                int[] numbers = new int[10];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scanner.nextInt();
                }

                int[] distinctNumbers = eliminateDuplicates(numbers);
                
                System.out.print("The distinct numbers are: ");
                for (int i = 0; i < distinctNumbers.length; i++) {
                    System.out.print(distinctNumbers[i] + " ");
                }
                System.out.println();

                System.out.print("Do you want to enter another set of numbers? (y/n): ");
                userChoice = scanner.next();
                
            } while (userChoice.equalsIgnoreCase("y"));
            
            System.out.println("Closing Program");
        }
    }
}