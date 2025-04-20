import java.util.Scanner;

public class VowCosChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueInput = true;
            
            while (continueInput) {
                System.out.print("Enter a letter: ");
                String input = scanner.nextLine().trim();
                
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println(input + " is an invalid input");
                } else {
                    char letter = Character.toLowerCase(input.charAt(0));
                    if ("aeiou".indexOf(letter) != -1) {
                        System.out.println(input + " is a vowel");
                    } else {
                        System.out.println(input + " is a consonant");
                    }
                }
                
                System.out.print("Do you want to enter another letter? (y/n): ");
                String response = scanner.nextLine().trim().toLowerCase();
                continueInput = response.equals("y");
            }
            
            System.out.println("Closing Program");
        }
    }
}