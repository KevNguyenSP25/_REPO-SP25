START
    CONSTANT MILES_TO_KM_CONVERSION = 1.609
    DECLARE continueInput AS BOOLEAN = true
    DECLARE userResponse AS STRING
    DECLARE miles AS DOUBLE
    DECLARE kilometers AS DOUBLE

    DISPLAY "Miles     Kilometers"
    DISPLAY "---------------------"

    WHILE continueInput IS true
        DISPLAY "Enter miles: "
        READ miles

        IF miles IS NOT a valid number THEN
            DISPLAY "Invalid input. Please enter a numeric value."
        ELSE
            kilometers = miles * MILES_TO_KM_CONVERSION
            DISPLAY miles + "     " + kilometers
        END IF

        DISPLAY "Do you want to enter another value? (y/n): "
        READ userResponse

        IF userResponse IS "n" THEN
            continueInput = false
        END IF
    END WHILE

    DISPLAY "Closing Program"
END