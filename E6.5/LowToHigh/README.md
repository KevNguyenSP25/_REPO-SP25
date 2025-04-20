START
    REPEAT
        PRINT "Enter the first number:"
        READ num1

        PRINT "Enter the second number:"
        READ num2

        PRINT "Enter the third number:"
        READ num3

        CALL displaySortedNumbers(num1, num2, num3)

        PRINT "Do you want to enter another set of numbers? (y/n):"
        READ userChoice
    UNTIL userChoice IS NOT "y"

    PRINT "Closing Program"
END

METHOD displaySortedNumbers(num1, num2, num3)
    PRINT "Lowest to Highest Number: "

    IF num1 <= num2 AND num1 <= num3 THEN
        PRINT num1
        IF num2 <= num3 THEN
            PRINT num2, num3
        ELSE
            PRINT num3, num2
    ELSE IF num2 <= num1 AND num2 <= num3 THEN
        PRINT num2
        IF num1 <= num3 THEN
            PRINT num1, num3
        ELSE
            PRINT num3, num1
    ELSE
        PRINT num3
        IF num1 <= num2 THEN
            PRINT num1, num2
        ELSE
            PRINT num2, num1
END METHOD