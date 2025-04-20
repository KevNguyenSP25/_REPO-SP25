START
    SET continueInput TO true

    WHILE continueInput IS true
        PRINT "Enter a letter: "
        READ userInput

        IF userInput IS NOT a single alphabetic character THEN
            PRINT userInput + " is an invalid input"
        ELSE
            CONVERT userInput to lowercase
            SET letter TO first character of userInput

            IF letter IS one of 'a', 'e', 'i', 'o', 'u' THEN
                PRINT userInput + " is a vowel"
            ELSE
                PRINT userInput + " is a consonant"
            END IF
        END IF

        PRINT "Do you want to enter another letter? (y/n): "
        READ userResponse

        IF userResponse IS "n" THEN
            SET continueInput TO false
        END IF
    END WHILE

    PRINT "Closing Program!"
END