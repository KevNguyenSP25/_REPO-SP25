// PSEUDOCODE

BEGIN

    // Declare variables to store user inputs and BMI result
    DECLARE weight, heightFeet, heightInches, totalInches, bmi
    // Prompt the user for their weight in pounds
    PRINT "Enter your weight in pounds: "
    READ weight
    // Prompt the user for their height in feet
    PRINT "Enter your height (feet): "
    READ heightFeet
    // Prompt the user for their height in inches
    PRINT "Enter your height (inches): "
    READ heightInches
    // Convert height to total inches (feet * 12 + inches)
    SET totalInches = (heightFeet * 12) + heightInches
    // Calculate the BMI using the formula: BMI = (weight / (height in inches)^2) * 703
    SET bmi = (weight / (totalInches * totalInches)) * 703
    // Round the BMI to the nearest thousandth (three decimal places)
    SET bmi = ROUND(bmi TO 3 DECIMAL PLACES)
    // Display the BMI result
    PRINT "Your BMI is: " + bmi
    // Interpret the BMI value
    PRINT "BMI Interpretation:"
    IF bmi < 18.5 THEN
        PRINT "Underweight"
    ELSE IF bmi >= 18.5 AND bmi < 24.9 THEN
        PRINT "Normal weight"
    ELSE IF bmi >= 25 AND bmi < 29.9 THEN
        PRINT "Overweight"
    ELSE
        PRINT "Obesity"
    END IF
END