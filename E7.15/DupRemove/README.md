BEGIN

    FUNCTION eliminateDuplicates(list)
        CREATE tempArray with size same as the length of list
        SET distinctCount to 0
        
        FOR each element i in list:
            SET isDuplicate to false
            
            FOR each element j in tempArray up to distinctCount:
                IF list[i] equals tempArray[j]:
                    SET isDuplicate to true
                    BREAK out of loop
                END IF
            END FOR

            IF isDuplicate is false:
                SET tempArray[distinctCount] to list[i]
                INCREMENT distinctCount by 1
            END IF
        END FOR
        
        CREATE result array with size equal to distinctCount
        FOR each index i in distinctCount:
            SET result[i] to tempArray[i]
        END FOR
        
        RETURN result
    END FUNCTION

    MAIN PROGRAM:
        REPEAT:
            PROMPT the user to enter 10 numbers
            STORE the user input in an array numbers
            
            CALL eliminateDuplicates with numbers as argument
            DISPLAY the distinct numbers from the returned array
            
            ASK the user if they want to enter another set of numbers (y/n)
        UNTIL user chooses to exit (n)
        
        DISPLAY "Closing Program"

END