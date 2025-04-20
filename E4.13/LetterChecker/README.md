START
    PRINT "Enter a letter: "
    READ userInput

    IF userInput has more than one character OR userInput is not a letter THEN
        PRINT userInput + " is an invalid input"
    ELSE
        CONVERT userInput to lowercase
        SET letter = first character of userInput

        IF letter is 'a' OR letter is 'e' OR letter is 'i' OR letter is 'o' OR letter is 'u' THEN
            PRINT userInput + " is a vowel"
        ELSE
            PRINT userInput + " is a consonant"
        END IF
    END IF
END