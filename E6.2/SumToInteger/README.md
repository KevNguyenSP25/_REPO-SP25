START
    REPEAT
        PRINT "Enter an integer:"
        READ number

        SET sum = 0
        SET equation = ""

        WHILE number > 0
            SET digit = number MOD 10
            ADD digit TO sum

            IF equation IS NOT EMPTY
                PREPEND " + " TO equation

            PREPEND "(" + digit + ")" TO equation
            SET number = number DIV 10

        PRINT "The sum of the digits is: " + equation + " = " + sum

        PRINT "Do you want to enter another number? (y/n):"
        READ userChoice
    UNTIL userChoice IS NOT "y"

    PRINT "Closing Program"
END