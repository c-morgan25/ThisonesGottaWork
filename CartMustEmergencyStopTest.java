package edu.unl.cse.soft160.tdd_homework;

import static org.junit.Assert.*;

import edu.unl.cse.soft160.tdd_homework.Cart.Action;
import edu.unl.cse.soft160.tdd_homework.Cart.DriverInput;
import edu.unl.cse.soft160.tdd_homework.Cart.Terrain;
import org.junit.Test;

import java.util.Set;

public class CartMustEmergencyStopTest {
    @Test
    public void test00323() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00324() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00325() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00326() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00327() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00328() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00329() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00330() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00331() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00332() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00333() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00334() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00335() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00336() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00337() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00338() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00339() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00340() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00341() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00342() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00343() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00344() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00345() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00346() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00347() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00348() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00349() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00350() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00351() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00352() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00353() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00354() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00355() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00356() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00357() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00358() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00359() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00360() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00361() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00362() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00363() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00364() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00365() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00366() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00367() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00368() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00369() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00370() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00371() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01835() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01836() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01837() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01838() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01839() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01840() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01841() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01842() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01843() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01844() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01845() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01846() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01847() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01848() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01849() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01850() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01851() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01852() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01853() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01854() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01855() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01856() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01857() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01858() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01859() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01860() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01861() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01862() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01863() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01864() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01865() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01866() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01867() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01868() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01869() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01870() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01871() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01872() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01873() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01874() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01875() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01876() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01877() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01878() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01879() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01880() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01881() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01882() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01883() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01891() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01892() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01893() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01894() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01895() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01896() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01897() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01898() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01899() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01900() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01901() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01902() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01903() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01904() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01905() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01906() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01907() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01908() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01909() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01910() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01911() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01912() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01913() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01914() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01915() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01916() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01917() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01918() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01919() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01920() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01921() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01922() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01923() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01924() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01925() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01926() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01927() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01928() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01929() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01930() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01931() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01932() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01933() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01934() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01935() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01936() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01937() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01938() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01939() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01940() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01941() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01942() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01943() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01944() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01945() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01946() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01947() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01948() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01949() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01950() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01951() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01952() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01953() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01954() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01955() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01956() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01957() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01958() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01959() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01960() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01961() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01962() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01963() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01964() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01965() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01966() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01967() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01968() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01969() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01970() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01971() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01972() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01973() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01974() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01975() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01976() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01977() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01978() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01979() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01980() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01981() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01982() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01983() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01984() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01985() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01986() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01987() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01988() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01989() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01990() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01991() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01992() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01993() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01994() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01995() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01996() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01997() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01998() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01999() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02000() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02001() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02002() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02003() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02004() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02005() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02006() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02007() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02008() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02009() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02010() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02011() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02012() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02013() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02014() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02015() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02016() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02017() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02018() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02019() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02020() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02021() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02022() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02023() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02024() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02025() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02026() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02027() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02028() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02029() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02030() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02031() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02032() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02033() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02034() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02035() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02036() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02037() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02038() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02039() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02040() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02041() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02042() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02043() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02044() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02045() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02046() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02047() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02048() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02049() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02050() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02051() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02052() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02053() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02054() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02055() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02056() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02057() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02058() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02059() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02060() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02061() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02062() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02063() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02064() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02065() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02066() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02067() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02068() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02069() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02070() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02071() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02072() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02073() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02074() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02075() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02076() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02077() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02078() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02079() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02080() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02081() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02082() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02083() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02084() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02085() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02086() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02087() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02088() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02089() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02090() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02091() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02092() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02093() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02094() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02095() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02096() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02097() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02098() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02099() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02100() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02101() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02102() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02103() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02104() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02105() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02106() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02107() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02108() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02109() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02110() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02111() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02112() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02113() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02114() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02115() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02116() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02117() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02118() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02119() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02120() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02121() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02122() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02123() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02124() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02125() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02126() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02127() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02128() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02129() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02130() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02131() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02132() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02133() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02134() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02135() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02136() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02137() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02138() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02139() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02140() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02141() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02142() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02143() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02144() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02145() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02146() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02147() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02148() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02149() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02150() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02151() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02152() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02153() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02154() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02155() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02156() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02157() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02158() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02159() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02160() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02161() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02162() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02163() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02164() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02165() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02166() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02167() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02168() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02169() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02170() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02171() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02172() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02173() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02174() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02175() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02176() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02177() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02178() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02179() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02180() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02181() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02182() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02183() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02184() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02185() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02186() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02187() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02188() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02189() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02190() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02191() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02192() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02193() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02194() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02195() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02196() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02197() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02198() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02199() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02200() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02201() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02202() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02203() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02204() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02205() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02206() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02207() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02208() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02209() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02210() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02211() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02212() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02213() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02214() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02215() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02216() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02217() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02218() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02219() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02220() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02221() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02222() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02223() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02224() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02225() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02226() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02227() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02228() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02229() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02230() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02231() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02232() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02233() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02234() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02235() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02236() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02237() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02238() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02239() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02240() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02241() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02242() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02243() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02244() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02245() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02246() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02247() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02248() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02249() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02250() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02251() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02252() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02253() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02254() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02255() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02256() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02257() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02258() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02259() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02260() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02261() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02262() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02263() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02264() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02265() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02266() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02267() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test02268() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03347() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03348() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03349() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03350() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03351() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03352() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03353() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03354() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03355() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03356() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03357() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03358() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03359() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03360() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03361() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03362() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03363() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03364() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03365() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03366() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03367() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03368() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03369() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03370() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03371() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03372() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03373() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03374() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03375() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03376() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03377() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03378() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03379() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03380() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03381() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03382() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03383() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03384() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03385() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03386() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03387() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03388() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03389() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03390() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03391() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03392() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03393() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03394() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03395() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03781() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03782() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03783() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03784() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03785() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03786() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03787() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03788() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03789() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03790() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03791() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03792() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03793() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03794() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03795() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03796() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03797() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03798() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03799() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03800() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03801() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03802() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03803() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03804() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03805() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03806() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03807() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03808() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03809() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03810() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03811() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03812() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03813() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03814() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03815() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03816() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03817() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03818() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03819() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03820() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03821() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03822() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03823() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03824() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03825() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03826() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03827() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03828() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03829() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03830() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03831() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03832() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03833() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03834() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03835() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03836() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03837() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03838() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03839() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03840() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03841() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03842() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03843() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03844() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03845() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03846() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03847() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03848() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03849() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03850() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03851() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03852() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03853() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03854() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03855() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03856() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03857() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03858() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03859() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03860() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03861() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03862() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03863() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03864() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03865() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03866() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03867() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03868() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03869() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03870() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03871() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03872() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03873() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03874() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03875() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03876() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03877() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03878() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03879() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03880() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03881() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03882() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03883() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03884() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03885() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03886() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03887() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03888() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03889() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03890() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03891() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03892() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03893() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03894() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03895() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03896() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03897() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03898() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03899() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03900() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03901() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03902() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03903() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03904() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03905() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03906() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03907() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03908() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03909() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03910() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03911() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03912() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03913() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03914() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03915() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03916() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03917() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03918() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03919() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03920() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03921() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03922() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03923() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03924() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03925() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03926() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03927() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03928() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03929() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03930() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03931() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03932() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03933() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03934() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03935() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03936() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03937() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03938() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03939() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03940() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03941() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03942() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03943() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03944() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03945() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03946() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03947() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03948() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03949() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03950() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03951() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03952() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03953() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03954() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03955() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03956() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03957() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03958() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03959() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03960() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03961() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03962() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03963() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03964() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03965() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03966() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03967() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03968() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03969() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03970() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03971() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03972() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03973() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03974() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03975() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03976() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03977() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03978() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03979() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03980() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03981() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03982() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03983() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03984() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03985() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03986() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03987() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03988() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03989() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03990() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03991() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03992() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03993() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03994() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03995() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03996() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03997() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03998() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03999() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04000() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04001() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04002() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04003() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04004() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04005() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04006() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04007() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04008() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04009() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04010() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04011() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04012() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04013() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04014() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04015() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04016() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04017() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04018() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04019() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04020() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04021() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04022() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04023() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04024() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04025() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04026() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04027() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04028() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04029() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04030() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04031() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04032() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04033() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04034() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04035() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04036() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04037() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04038() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04039() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04040() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04041() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04042() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04043() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04044() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04045() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04046() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04047() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04048() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04049() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04050() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04051() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04052() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04053() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04054() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04055() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04056() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04057() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04058() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04059() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04060() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04061() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04062() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04063() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04064() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04065() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04066() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04067() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04068() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04069() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04070() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04071() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04072() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04073() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04074() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04075() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04076() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04077() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04078() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04079() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04080() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04081() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04082() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04083() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04084() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04085() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04086() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04087() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04088() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04089() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04090() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04091() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04092() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04093() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04094() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04095() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04096() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04097() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04098() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04099() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04100() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04101() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04102() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04103() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04104() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04105() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04106() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04107() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04108() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04109() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04110() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04111() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04112() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04113() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04114() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04115() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04116() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04117() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04118() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04119() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04120() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04121() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04122() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04123() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04124() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04125() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04126() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04127() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04128() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04129() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04130() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04131() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04132() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04133() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04134() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04135() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04136() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04137() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04138() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04139() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04140() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04141() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04142() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04143() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04144() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04145() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04146() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04147() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04148() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04149() {
        // Relevant specification requirements: [9, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04150() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04151() {
        // Relevant specification requirements: [9, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04152() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04153() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04154() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04155() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04156() {
        // Relevant specification requirements: [5, 9, 12, 13, 15, 19, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04157() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04158() {
        // Relevant specification requirements: [5, 9, 12, 13, 19, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04859() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04860() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04861() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04862() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04863() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04864() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04865() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04866() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04867() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04868() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04869() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04870() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04871() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04872() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04873() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04874() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04875() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04876() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04877() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04878() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04879() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04880() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04881() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04882() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04883() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04884() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04885() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04886() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04887() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04888() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04889() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04890() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04891() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04892() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04893() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04894() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04895() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04896() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04897() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04898() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04899() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04900() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04901() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04902() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04903() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04904() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04905() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04906() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04907() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05237() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05238() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05239() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05240() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05241() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05242() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05243() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05244() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05245() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05246() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05247() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05248() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05249() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05250() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05251() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05252() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05253() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05254() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05255() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05256() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05257() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05258() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05259() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05260() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05261() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05262() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05263() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05264() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05265() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05266() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05267() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05268() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05269() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05270() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05271() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05272() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05273() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05274() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05275() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05276() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05277() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05278() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05279() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05280() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05281() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05282() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05283() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05284() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05285() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05615() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05616() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05617() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05618() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05619() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05620() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05621() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05622() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05623() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05624() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05625() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05626() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05627() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05628() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05629() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05630() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05631() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05632() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05633() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05634() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05635() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05636() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05637() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05638() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05639() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05640() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05641() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05642() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05643() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05644() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05645() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05646() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05647() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05648() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05649() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05650() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05651() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05652() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05653() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05654() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05655() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05656() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05657() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05658() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05659() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05660() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05661() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05662() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05663() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05993() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05994() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05995() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05996() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05997() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05998() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05999() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06000() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06001() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06002() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06003() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06004() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06005() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06006() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06007() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06008() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06009() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06010() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06011() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06012() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06013() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06014() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06015() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06016() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06017() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06018() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06019() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06020() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06021() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06022() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06023() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06024() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06025() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06026() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06027() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06028() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06029() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06030() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06031() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06032() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06033() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06034() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06035() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06036() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06037() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06038() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06039() {
        // Relevant specification requirements: [6, 13, 15, 21, 26]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06040() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06041() {
        // Relevant specification requirements: [6, 13, 21]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.EMERGENCY_STOP;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

}
