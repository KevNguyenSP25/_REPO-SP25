BEGIN
    REPEAT
        DISPLAY "Enter 10 double values:"
        CREATE an array of 10 double values

        FOR i from 0 to 9 DO
            PROMPT user to enter value i+1
            STORE input in array[i]
        END FOR

        CALL method to calculate average of the array
        DISPLAY the average

        PROMPT user: "Do you want to enter another set? (y/n):"
        READ user choice
    UNTIL user choice is NOT "y" or "Y"

    DISPLAY "Program ended."
END

FUNCTION average(array of doubles)
    SET sum to 0
    FOR each number in array DO
        ADD number to sum
    END FOR
    RETURN sum divided by length of array
END FUNCTION