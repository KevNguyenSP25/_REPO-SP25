## Pseudocode

FUNCTION main
    PRINT "Enter the message to print:"
    SET message to "Welcome to Java"

    PRINT "Enter the number of times to repeat message:"
    SET repeat TO 5

    IF repeat IS LESS THAN 1 THEN
        PRINT "Repeat count must be at least 1."
        RETURN
    END IF

    SET i to 0
    WHILE i IS LESS THAN repeat DO
        PRINT message
        SET i to i + 1
    END WHILE
END FUNCTION