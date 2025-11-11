package edu.unl.cse.soft160.tdd_homework;

import static org.junit.Assert.*;

import edu.unl.cse.soft160.tdd_homework.Cart.Action;
import edu.unl.cse.soft160.tdd_homework.Cart.DriverInput;
import edu.unl.cse.soft160.tdd_homework.Cart.Terrain;
import org.junit.Test;

import java.util.Set;

public class CartMustDeflectWheelsLeftTest {
    @Test
    public void test00057() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00058() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00059() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00060() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00061() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00062() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00063() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00120() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00121() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00122() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00123() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00124() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00125() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00126() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00183() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00184() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00185() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00186() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00187() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00188() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00189() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00211() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00212() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00213() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00214() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00215() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00216() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00217() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00218() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00219() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00220() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00221() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00222() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00223() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00224() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00225() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00226() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00227() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00228() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00229() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00230() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00231() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00232() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00233() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00234() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00235() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00236() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00237() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00238() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00239() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00240() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00241() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00242() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00243() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00244() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00245() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00246() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00247() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00248() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00249() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00250() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00251() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00252() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00309() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00310() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00311() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00312() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00313() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00314() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00315() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00372() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00373() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00374() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00375() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00376() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00377() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00378() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01569() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01570() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01571() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01572() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01573() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01574() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01575() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01632() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01633() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01634() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01635() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01636() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01637() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01638() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01695() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01696() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01697() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01698() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01699() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01700() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01701() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01723() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01724() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01725() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01726() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01727() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01728() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01729() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01730() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01731() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01732() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01733() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01734() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01735() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01736() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01737() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01738() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01739() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01740() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01741() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01742() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01743() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01744() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01745() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01746() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01747() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01748() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01749() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01750() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01751() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01752() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01753() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01754() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01755() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01756() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01757() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01758() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01759() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01760() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01761() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01762() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01763() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01764() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01821() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01822() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01823() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01824() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01825() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01826() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01827() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01884() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01885() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01886() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01887() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01888() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01889() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01890() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03081() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03082() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03083() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03084() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03085() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03086() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03087() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03144() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03145() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03146() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03147() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03148() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03149() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03150() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03207() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03208() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03209() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03210() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03211() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03212() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03213() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03235() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03236() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03237() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03238() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03239() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03240() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03241() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03242() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03243() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03244() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03245() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03246() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03247() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03248() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03249() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03250() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03251() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03252() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03253() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03254() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03255() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03256() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03257() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03258() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03259() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03260() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03261() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03262() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03263() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03264() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03265() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03266() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03267() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03268() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03269() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03270() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03271() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03272() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03273() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03274() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03275() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03276() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03333() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03334() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03335() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03336() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03337() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03338() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03339() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03396() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03397() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03398() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03399() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03400() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03401() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03402() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03459() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03460() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03461() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03462() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03463() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03464() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03465() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03522() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03523() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03524() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03525() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03526() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03527() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03528() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03585() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03586() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03587() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03588() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03589() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03590() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03591() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03648() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03649() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03650() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03651() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03652() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03653() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03654() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03711() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03712() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03713() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03714() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03715() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03716() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03717() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03774() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03775() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03776() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03777() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03778() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03779() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03780() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04593() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04594() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04595() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04596() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04597() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04598() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04599() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04656() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04657() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04658() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04659() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04660() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04661() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04662() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04719() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04720() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04721() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04722() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04723() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04724() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04725() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04747() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04748() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04749() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04750() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04751() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04752() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04753() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04754() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04755() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04756() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04757() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04758() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04759() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04760() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04761() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04762() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04763() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04764() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04765() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04766() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04767() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04768() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04769() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04770() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04771() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04772() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04773() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04774() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04775() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04776() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04777() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04778() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04779() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04780() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04781() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04782() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04783() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04784() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04785() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04786() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04787() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04788() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04845() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04846() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04847() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04848() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04849() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04850() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04851() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04908() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04909() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04910() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04911() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04912() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04913() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04914() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04971() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04972() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04973() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04974() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04975() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04976() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04977() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05034() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05035() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05036() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05037() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05038() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05039() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05040() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05097() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05098() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05099() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05100() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05101() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05102() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05103() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05125() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05126() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05127() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05128() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05129() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05130() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05131() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05132() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05133() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05134() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05135() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05136() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05137() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05138() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05139() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05140() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05141() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05142() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05143() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05144() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05145() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05146() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05147() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05148() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05149() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05150() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05151() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05152() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05153() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05154() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05155() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05156() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05157() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05158() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05159() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05160() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05161() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05162() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05163() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05164() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05165() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05166() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05223() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05224() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05225() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05226() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05227() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05228() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05229() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05286() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05287() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05288() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05289() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05290() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05291() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05292() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05349() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05350() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05351() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05352() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05353() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05354() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05355() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05412() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05413() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05414() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05415() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05416() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05417() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05418() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05475() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05476() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05477() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05478() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05479() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05480() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05481() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05503() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05504() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05505() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05506() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05507() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05508() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05509() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05510() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05511() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05512() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05513() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05514() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05515() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05516() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05517() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05518() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05519() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05520() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05521() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05522() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05523() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05524() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05525() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05526() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05527() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05528() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05529() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05530() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05531() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05532() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05533() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05534() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05535() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05536() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05537() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05538() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05539() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05540() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05541() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05542() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05543() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05544() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05601() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05602() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05603() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05604() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05605() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05606() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05607() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05664() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05665() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05666() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05667() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05668() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05669() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05670() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05727() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05728() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05729() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05730() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05731() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05732() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05733() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05790() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05791() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05792() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05793() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05794() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05795() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05796() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05853() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05854() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05855() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05856() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05857() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05858() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05859() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05881() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05882() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05883() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05884() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05885() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05886() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05887() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05888() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05889() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05890() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05891() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05892() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05893() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05894() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05895() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05896() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05897() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05898() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05899() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05900() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05901() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05902() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05903() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05904() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05905() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05906() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05907() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05908() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05909() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05910() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05911() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05912() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05913() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05914() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05915() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05916() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05917() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05918() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05919() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05920() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05921() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05922() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05979() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05980() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05981() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05982() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05983() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05984() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05985() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06042() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06043() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06044() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06045() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06046() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06047() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06048() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06105() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06106() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06107() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06108() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06109() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06110() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06111() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06168() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06169() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06170() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06171() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06172() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06173() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06174() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06231() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06232() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06233() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06234() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06235() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06236() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06237() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06294() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06295() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06296() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06297() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06298() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06299() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06300() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06357() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06358() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06359() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06360() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06361() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06362() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06363() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06420() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06421() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06422() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06423() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06424() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06425() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06426() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06861() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06862() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06863() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06864() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06865() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06866() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06867() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06924() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06925() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06926() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06927() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06928() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06929() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06930() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06987() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06988() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06989() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06990() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06991() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06992() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06993() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07015() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07016() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07017() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07018() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07019() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07020() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07021() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07022() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07023() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07024() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07025() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07026() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07027() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07028() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07029() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07030() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07031() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07032() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07033() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07034() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07035() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07036() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07037() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07038() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07039() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07040() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07041() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07042() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07043() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07044() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07045() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07046() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07047() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07048() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07049() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07050() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07051() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07052() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07053() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07054() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07055() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07056() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07113() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07114() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07115() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07116() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07117() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07118() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07119() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07176() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07177() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07178() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07179() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07180() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07181() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07182() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08373() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08374() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08375() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08376() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08377() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08378() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08379() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08436() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08437() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08438() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08439() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08440() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08441() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08442() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08499() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08500() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08501() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08502() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08503() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08504() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08505() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08527() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08528() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08529() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08530() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08531() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08532() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08533() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08534() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08535() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08536() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08537() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08538() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08539() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08540() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08541() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08542() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08543() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08544() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08545() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08546() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08547() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08548() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08549() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08550() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08551() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08552() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08553() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08554() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08555() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08556() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08557() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08558() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08559() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08560() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08561() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08562() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08563() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08564() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08565() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08566() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08567() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08568() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08625() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08626() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08627() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08628() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08629() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08630() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08631() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08688() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08689() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08690() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08691() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08692() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08693() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08694() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09885() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09886() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09887() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09888() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09889() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09890() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09891() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09948() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09949() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09950() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09951() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09952() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09953() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09954() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10011() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10012() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10013() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10014() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10015() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10016() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10017() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10039() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10040() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10041() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10042() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10043() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10044() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10045() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10046() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10047() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10048() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10049() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10050() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10051() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10052() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10053() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10054() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10055() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10056() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10057() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10058() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10059() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10060() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10061() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10062() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10063() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10064() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10065() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10066() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10067() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10068() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10069() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10070() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10071() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10072() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10073() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10074() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10075() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10076() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10077() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10078() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10079() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10080() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10137() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10138() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10139() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10140() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10141() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10142() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10143() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10200() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10201() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10202() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10203() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10204() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10205() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10206() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10263() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10264() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10265() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10266() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10267() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10268() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10269() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10326() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10327() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10328() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10329() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10330() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10331() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10332() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10389() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10390() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10391() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10392() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10393() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10394() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10395() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10452() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10453() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10454() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10455() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10456() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10457() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10458() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10515() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10516() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10517() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10518() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10519() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10520() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10521() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10578() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10579() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10580() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10581() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10582() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10583() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10584() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11397() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11398() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11399() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11400() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11401() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11402() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11403() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11460() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11461() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11462() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11463() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11464() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11465() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11466() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11523() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11524() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11525() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11526() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11527() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11528() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11529() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11551() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11552() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11553() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11554() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11555() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11556() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11557() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11558() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11559() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11560() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11561() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11562() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11563() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11564() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11565() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11566() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11567() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11568() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11569() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11570() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11571() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11572() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11573() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11574() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11575() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11576() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11577() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11578() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11579() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11580() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11581() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11582() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11583() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11584() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11585() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11586() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11587() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11588() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11589() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11590() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11591() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11592() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11649() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11650() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11651() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11652() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11653() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11654() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11655() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11712() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11713() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11714() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11715() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11716() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11717() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11718() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11775() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11776() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11777() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11778() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11779() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11780() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11781() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11838() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11839() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11840() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11841() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11842() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11843() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11844() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11901() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11902() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11903() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11904() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11905() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11906() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11907() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11929() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11930() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11931() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11932() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11933() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11934() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11935() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11936() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11937() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11938() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11939() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11940() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11941() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11942() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11943() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11944() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11945() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11946() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11947() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11948() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11949() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11950() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11951() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11952() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11953() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11954() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11955() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11956() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11957() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11958() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11959() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11960() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11961() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11962() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11963() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11964() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11965() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11966() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11967() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11968() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11969() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11970() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12027() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12028() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12029() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12030() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12031() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12032() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12033() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12090() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12091() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12092() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12093() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12094() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12095() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12096() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12153() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12154() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12155() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12156() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12157() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12158() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12159() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12216() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12217() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12218() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12219() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12220() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12221() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12222() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12279() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12280() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12281() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12282() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12283() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12284() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12285() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12307() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12308() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12309() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12310() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12311() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12312() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12313() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12314() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12315() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12316() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12317() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12318() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12319() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12320() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12321() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12322() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12323() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12324() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12325() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12326() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12327() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12328() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12329() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12330() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12331() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12332() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12333() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12334() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12335() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12336() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12337() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12338() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12339() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12340() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12341() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12342() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12343() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12344() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12345() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12346() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12347() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12348() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12405() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12406() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12407() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12408() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12409() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12410() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12411() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12468() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12469() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12470() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12471() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12472() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12473() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12474() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12531() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12532() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12533() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12534() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12535() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12536() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12537() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12594() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12595() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12596() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12597() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12598() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12599() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12600() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12657() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12658() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12659() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12660() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12661() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12662() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12663() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12685() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12686() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12687() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12688() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12689() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12690() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12691() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12692() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12693() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12694() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12695() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12696() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12697() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12698() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12699() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12700() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12701() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12702() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12703() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12704() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12705() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12706() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12707() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12708() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12709() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12710() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12711() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12712() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12713() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12714() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12715() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12716() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12717() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12718() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12719() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12720() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12721() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12722() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12723() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12724() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12725() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12726() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12783() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12784() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12785() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12786() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12787() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12788() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12789() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12846() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12847() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12848() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12849() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12850() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12851() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12852() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12909() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12910() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12911() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12912() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12913() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12914() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12915() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12972() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12973() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12974() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12975() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12976() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12977() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12978() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13035() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13036() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13037() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13038() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13039() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13040() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13041() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13098() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13099() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13100() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13101() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13102() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13103() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13104() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13161() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13162() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13163() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13164() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13165() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13166() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13167() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13224() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13225() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13226() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13227() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13228() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13229() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13230() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_LEFT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

}
