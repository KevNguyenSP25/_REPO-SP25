## Pseudocode

BEGIN

    // Start the program and welcome the user

    REPEAT
        // Prompt the user for subtotal input
        PRINT "Enter subtotal: "
        READ subtotal    // User enters the subtotal amount (a number)

        // Prompt the user for gratuity rate input
        PRINT "Enter gratuity rate (as a percentage): "
        READ gratuityRate   // User enters the gratuity rate (as a percentage)

        // Calculate the gratuity using the formula
        gratuity = subtotal * (gratuityRate / 100)

        // Calculate the total (subtotal + gratuity)
        total = subtotal + gratuity

        // Display the calculated gratuity and total
        PRINT "Gratuity: ", gratuity
        PRINT "Total: ", total

        // Ask if the user wants to perform another calculation
        PRINT "Do you want to perform another calculation? (y/n): "
        READ response    // User types "y" to continue or "n" to stop

    UNTIL response is "n"    // Exit the loop if the user types "n"

END