START
    DECLARE continueInput AS STRING

    REPEAT
        DISPLAY "Enter the initial tuition amount: $"
        READ initialTuition

        DISPLAY "Enter the annual tuition increase rate (as a percentage): "
        READ annualIncreaseRate

        SET tuitionInTenYears = initialTuition
        FOR year FROM 1 TO 10
            tuitionInTenYears = tuitionInTenYears * (1 + annualIncreaseRate / 100)
        END FOR

        SET totalCostAfterTenYears = 0
        SET tuitionForNextFourYears = tuitionInTenYears
        FOR year FROM 1 TO 4
            totalCostAfterTenYears = totalCostAfterTenYears + tuitionForNextFourYears
            tuitionForNextFourYears = tuitionForNextFourYears * (1 + annualIncreaseRate / 100)
        END FOR

        DISPLAY "Tuition in 10 years: $" + tuitionInTenYears
        DISPLAY "Total cost of four years' tuition after the tenth year: $" + totalCostAfterTenYears

        DISPLAY "Do you want to perform another calculation? (y/n): "
        READ continueInput
    UNTIL continueInput IS "n"

    DISPLAY "Closing Program - Enjoy School!"
END