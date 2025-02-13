import java.util.Scanner;

public class DaysMonthYear {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the month (1-12): ");
                int month = scanner.nextInt();
                System.out.print("Enter the year: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                
                String monthName = getMonthName(month);
                
                if (monthName == null) {
                    System.out.println("Invalid month entered.");
                } else {
                    int daysInMonth = getDaysInMonth(month, year);
                    System.out.println("The number of days in " + monthName + " " + year + " had: " + daysInMonth);
                }

                System.out.print("Would you like to search for another month? (y/n): ");
                String response = scanner.nextLine().trim().toLowerCase();
                
                if (response.equals("n")) {
                    System.out.println("See you next time!");
                    break;
                }
            }
        }
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        // Month names array
        String[] months = { 
            "Invalid", "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        if (month < 1 || month > 12) {
            return null;
        }
        return months[month];
    }

    // Method to calculate the number of days in a given month of a given year
    public static int getDaysInMonth(int month, int year) {
        // Validate the month input
        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }

        // Number of days in each month (for non-leap years)
        int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Adjust February for leap years
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonths[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A leap year divisible by 4, not divisible by 100, unless it is divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}