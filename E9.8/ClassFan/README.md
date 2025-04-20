BEGIN FanClass
    DEFINE constant SLOW = 1
    DEFINE constant MEDIUM = 2
    DEFINE constant FAST = 3

    DECLARE private integer speed = SLOW
    DECLARE private boolean on = false
    DECLARE private double radius = 5
    DECLARE private string color = "blue"

    METHOD getSpeed() RETURNS speed
    METHOD isOn() RETURNS on
    METHOD getRadius() RETURNS radius
    METHOD getColor() RETURNS color

    METHOD setSpeed(value)
        SET speed = value
    END METHOD

    METHOD setOn(value)
        SET on = value
    END METHOD

    METHOD setRadius(value)
        SET radius = value
    END METHOD

    METHOD setColor(value)
        SET color = value
    END METHOD

    METHOD toString()
        IF on IS TRUE THEN
            RETURN string "Fan is on: Speed = speed, Color = color, Radius = radius"
        ELSE
            RETURN string "Fan is off: Color = color, Radius = radius"
        END IF
    END METHOD
END FanClass

BEGIN main
    CREATE fan1 AS new Fan
    SET fan1 speed to FAST
    SET fan1 radius to 10
    SET fan1 color to "yellow"
    SET fan1 on to true

    CREATE fan2 AS new Fan
    SET fan2 speed to MEDIUM
    SET fan2 radius to 5
    SET fan2 color to "blue"
    SET fan2 on to false

    PRINT "Fan 1: " + fan1.toString()
    PRINT "Fan 2: " + fan2.toString()
    PRINT "Test program END"
END main