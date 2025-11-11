package edu.unl.cse.soft160.tdd_homework;

import static org.junit.Assert.*;

import edu.unl.cse.soft160.tdd_homework.Cart.Action;
import edu.unl.cse.soft160.tdd_homework.Cart.DriverInput;
import edu.unl.cse.soft160.tdd_homework.Cart.Terrain;
import org.junit.Test;

import java.util.Set;

public class CartMustDisplaySpeedAndHeadingTest {
    @Test
    public void test00008() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00009() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00010() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00011() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00012() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00013() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00014() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00015() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00016() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00017() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00018() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00019() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00020() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00021() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00022() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00023() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00024() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00025() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00026() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00027() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00028() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00029() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00030() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00031() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00032() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00033() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00034() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00035() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00036() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00037() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00038() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00039() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00040() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00041() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00042() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00043() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00044() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00045() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00046() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00047() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00048() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00049() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00050() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00051() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00052() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00053() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00054() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00055() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00056() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01520() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01521() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01522() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01523() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01525() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01526() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01527() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01528() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01529() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01530() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01532() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01533() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01534() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01535() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01536() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01537() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01539() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01540() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01541() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01542() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01543() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01544() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01546() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01547() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01548() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01549() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01550() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01551() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01553() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01554() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01555() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01556() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01557() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01558() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01560() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01561() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01562() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01563() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01564() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01565() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01567() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01568() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03032() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03033() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03034() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03035() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03037() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03038() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03039() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03040() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03041() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03042() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03044() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03045() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03046() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03047() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03048() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03049() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03051() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03052() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03053() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03054() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03055() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03056() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03058() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03059() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03060() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03061() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03062() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03063() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03065() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03066() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03067() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03068() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03069() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03070() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03072() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03073() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03074() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03075() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03076() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03077() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03079() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03080() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04544() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04545() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04546() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04547() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04549() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04550() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04551() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04552() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04553() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04554() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04556() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04557() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04558() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04559() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04560() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04561() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04563() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04564() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04565() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04566() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04567() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04568() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04570() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04571() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04572() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04573() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04574() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04575() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04577() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04578() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04579() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04580() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04581() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04582() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04584() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04585() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04586() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04587() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04588() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04589() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04591() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04592() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04922() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04923() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04924() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04925() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04927() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04928() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04929() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04930() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04931() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04932() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04934() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04935() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04936() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04937() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04938() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04939() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04941() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04942() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04943() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04944() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04945() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04946() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04948() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04949() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04950() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04951() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04952() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04953() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04955() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04956() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04957() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04958() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04959() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04960() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04962() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04963() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04964() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04965() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04966() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04967() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04969() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04970() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05300() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05301() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05302() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05303() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05305() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05306() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05307() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05308() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05309() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05310() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05312() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05313() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05314() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05315() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05316() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05317() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05319() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05320() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05321() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05322() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05323() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05324() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05326() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05327() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05328() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05329() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05330() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05331() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05333() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05334() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05335() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05336() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05337() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05338() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05340() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05341() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05342() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05343() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05344() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05345() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05347() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05348() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05678() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05679() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05680() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05681() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05683() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05684() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05685() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05686() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05687() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05688() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05690() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05691() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05692() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05693() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05694() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05695() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05697() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05698() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05699() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05700() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05701() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05702() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05704() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05705() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05706() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05707() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05708() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05709() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05711() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05712() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05713() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05714() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05715() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05716() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05718() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05719() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05720() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05721() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05722() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05723() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05725() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05726() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06812() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06813() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06814() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06815() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06816() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06817() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06818() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06819() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06820() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06821() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06822() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06823() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06824() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06825() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06826() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06827() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06828() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06829() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06830() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06831() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06832() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06833() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06834() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06835() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06836() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06837() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06838() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06839() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06840() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06841() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06842() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06843() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06844() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06845() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06846() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06847() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06848() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06849() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06850() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06851() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06852() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06853() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06854() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06855() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06856() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06857() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06858() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06859() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06860() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08324() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08325() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08326() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08327() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08329() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08330() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08331() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08332() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08333() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08334() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08336() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08337() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08338() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08339() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08340() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08341() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08343() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08344() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08345() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08346() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08347() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08348() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08350() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08351() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08352() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08353() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08354() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08355() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08357() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08358() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08359() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08360() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08361() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08362() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08364() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08365() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08366() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08367() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08368() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08369() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08371() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08372() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09836() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09837() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09838() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09839() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09841() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09842() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09843() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09844() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09845() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09846() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09848() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09849() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09850() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09851() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09852() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09853() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09855() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09856() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09857() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09858() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09859() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09860() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09862() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09863() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09864() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09865() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09866() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09867() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09869() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09870() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09871() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09872() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09873() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09874() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09876() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09877() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09878() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09879() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09880() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09881() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09883() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09884() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11348() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11349() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11350() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11351() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11353() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11354() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11355() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11356() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11357() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11358() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11360() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11361() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11362() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11363() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11364() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11365() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11367() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11368() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11369() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11370() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11371() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11372() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11374() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11375() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11376() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11377() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11378() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11379() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11381() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11382() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11383() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11384() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11385() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11386() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11388() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11389() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11390() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11391() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11392() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11393() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11395() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11396() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11726() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11727() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11728() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11729() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11731() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11732() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11733() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11734() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11735() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11736() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11738() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11739() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11740() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11741() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11742() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11743() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11745() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11746() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11747() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11748() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11749() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11750() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11752() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11753() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11754() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11755() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11756() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11757() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11759() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11760() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11761() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11762() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11763() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11764() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11766() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11767() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11768() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11769() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11770() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11771() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11773() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11774() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12104() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12105() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12106() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12107() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12109() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12110() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12111() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12112() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12113() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12114() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12116() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12117() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12118() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12119() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12120() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12121() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12123() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12124() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12125() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12126() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12127() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12128() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12130() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12131() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12132() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12133() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12134() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12135() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12137() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12138() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12139() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12140() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12141() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12142() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12144() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12145() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12146() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12147() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12148() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12149() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12151() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12152() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12482() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12483() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12484() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12485() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12487() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12488() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12489() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12490() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12491() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12492() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12494() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12495() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12496() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12497() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12498() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12499() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12501() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12502() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12503() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12504() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12505() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12506() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12508() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12509() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12510() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12511() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12512() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12513() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12515() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12516() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12517() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12518() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12519() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12520() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12522() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12523() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12524() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12525() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12526() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12527() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12529() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12530() {
        // Relevant specification requirements: [11, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_SPEED_AND_HEADING;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

}
