## Pseudocode
BEGIN

    // Define function to convert Celsius to Fahrenheit
    FUNCTION CelsiusToFahrenheit(Celsius):
        Fahrenheit = (9.0 / 5) * Celsius + 32
        RETURN Fahrenheit
    END FUNCTION

    // Start main program
    PRINT "Program to convert Celsius to Fahrenheit"

    // Loop to perform 4 conversions
    FOR i FROM 1 TO 4:
        PRINT "Enter temperature in Celsius for conversion ", i
        READ Celsius // Get Celsius input from the user

        // Call the conversion function
        Fahrenheit = CelsiusToFahrenheit(Celsius)

        // Output the result
        PRINT Celsius, " Celsius is equal to ", Fahrenheit, " Fahrenheit."
    END FOR

    // End the program
    PRINT "Program finished."

END