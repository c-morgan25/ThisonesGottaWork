package edu.unl.cse.soft160.tdd_homework;

import static org.junit.Assert.*;

import edu.unl.cse.soft160.tdd_homework.Cart.Action;
import edu.unl.cse.soft160.tdd_homework.Cart.DriverInput;
import edu.unl.cse.soft160.tdd_homework.Cart.Terrain;
import org.junit.Test;

import java.util.Set;

public class CartMustDeflectWheelsRightTest {
    @Test
    public void test00001() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00002() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00003() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00004() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00005() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00006() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00007() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00064() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00065() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00066() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00067() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00068() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00069() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00070() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00127() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00128() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00129() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00130() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00131() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00132() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00133() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00190() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00191() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00192() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00193() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00194() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00195() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00196() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00253() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00254() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00255() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00256() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00257() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00258() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00259() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00260() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00261() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00262() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00263() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00264() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00265() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00266() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00267() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00268() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00269() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00270() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00271() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00272() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00273() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00274() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00275() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00276() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00277() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00278() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00279() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00280() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00281() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00282() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00283() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00284() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00285() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00286() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00287() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00288() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00289() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00290() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00291() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00292() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00293() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00294() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00316() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00317() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00318() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00319() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00320() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00321() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00322() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01513() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01514() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01515() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01516() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01517() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01518() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01519() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01576() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01577() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01578() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01579() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01580() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01581() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01582() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01639() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01640() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01641() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01642() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01643() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01644() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01645() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01702() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01703() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01704() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01705() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01706() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01707() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01708() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01765() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01766() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01767() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01768() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01769() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01770() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01771() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01772() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01773() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01774() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01775() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01776() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01777() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01778() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01779() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01780() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01781() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01782() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01783() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01784() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01785() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01786() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01787() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01788() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01789() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01790() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01791() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01792() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01793() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01794() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01795() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01796() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01797() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01798() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01799() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01800() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01801() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01802() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01803() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01804() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01805() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01806() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01828() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01829() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01830() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01831() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01832() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01833() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01834() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03025() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03026() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03027() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03028() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03029() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03030() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03031() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03088() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03089() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03090() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03091() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03092() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03093() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03094() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03151() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03152() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03153() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03154() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03155() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03156() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03157() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03214() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03215() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03216() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03217() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03218() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03219() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03220() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03277() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03278() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03279() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03280() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03281() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03282() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03283() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03284() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03285() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03286() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03287() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03288() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03289() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03290() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03291() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03292() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03293() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03294() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03295() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03296() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03297() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03298() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03299() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03300() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03301() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03302() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03303() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03304() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03305() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03306() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03307() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03308() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03309() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03310() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03311() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03312() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03313() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03314() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03315() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03316() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03317() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03318() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03340() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03341() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03342() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03343() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03344() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03345() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03346() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03403() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03404() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03405() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03406() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03407() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03408() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03409() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03466() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03467() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03468() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03469() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03470() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03471() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03472() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03529() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03530() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03531() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03532() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03533() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03534() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03535() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03592() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03593() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03594() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03595() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03596() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03597() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03598() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03655() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03656() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03657() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03658() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03659() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03660() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03661() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03718() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03719() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03720() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03721() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03722() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03723() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03724() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04537() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04538() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04539() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04540() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04541() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04542() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04543() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04600() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04601() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04602() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04603() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04604() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04605() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04606() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04663() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04664() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04665() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04666() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04667() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04668() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04669() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04726() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04727() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04728() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04729() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04730() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04731() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04732() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04789() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04790() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04791() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04792() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04793() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04794() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04795() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04796() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04797() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04798() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04799() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04800() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04801() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04802() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04803() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04804() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04805() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04806() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04807() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04808() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04809() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04810() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04811() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04812() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04813() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04814() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04815() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04816() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04817() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04818() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04819() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04820() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04821() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04822() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04823() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04824() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04825() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04826() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04827() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04828() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04829() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04830() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04852() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04853() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04854() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04855() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04856() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04857() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04858() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 12500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04915() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04916() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04917() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04918() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04919() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04920() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04921() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04978() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04979() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04980() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04981() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04982() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04983() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04984() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05041() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05042() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05043() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05044() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05045() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05046() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05047() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05104() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05105() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05106() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05107() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05108() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05109() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05110() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05167() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05168() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05169() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05170() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05171() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05172() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05173() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05174() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05175() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05176() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05177() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05178() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05179() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05180() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05181() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05182() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05183() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05184() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05185() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05186() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05187() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05188() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05189() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05190() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05191() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05192() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05193() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05194() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05195() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05196() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05197() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05198() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05199() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05200() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05201() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05202() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05203() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05204() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05205() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05206() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05207() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05208() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05230() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05231() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05232() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05233() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05234() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05235() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05236() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05293() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05294() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05295() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05296() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05297() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05298() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05299() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05356() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05357() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05358() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05359() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05360() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05361() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05362() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05419() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05420() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05421() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05422() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05423() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05424() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05425() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05482() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05483() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05484() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05485() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05486() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05487() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05488() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05545() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05546() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05547() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05548() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05549() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05550() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05551() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05552() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05553() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05554() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05555() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05556() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05557() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05558() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05559() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05560() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05561() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05562() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05563() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05564() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05565() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05566() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05567() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05568() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05569() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05570() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05571() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05572() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05573() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05574() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05575() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05576() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05577() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05578() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05579() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05580() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05581() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05582() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05583() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05584() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05585() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05586() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05608() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05609() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05610() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05611() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05612() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05613() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05614() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 14001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05671() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05672() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05673() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05674() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05675() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05676() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05677() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05734() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05735() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05736() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05737() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05738() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05739() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05740() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05797() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05798() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05799() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05800() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05801() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05802() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05803() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05860() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05861() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05862() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05863() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05864() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05865() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05866() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05923() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05924() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05925() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05926() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05927() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05928() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05929() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05930() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05931() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05932() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05933() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05934() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05935() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05936() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05937() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05938() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05939() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05940() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05941() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05942() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05943() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05944() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05945() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05946() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05947() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05948() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05949() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05950() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05951() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05952() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05953() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05954() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05955() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05956() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05957() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05958() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05959() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05960() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05961() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05962() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05963() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05964() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05986() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05987() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05988() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05989() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05990() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05991() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05992() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 15000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06049() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06050() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06051() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06052() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06053() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06054() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06055() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06112() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06113() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06114() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06115() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06116() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06117() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06118() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06175() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06176() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06177() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06178() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06179() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06180() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06181() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06238() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06239() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06240() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06241() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06242() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06243() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06244() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06301() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06302() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06303() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06304() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06305() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06306() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06307() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06364() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06365() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06366() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06367() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06368() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06369() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06370() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06805() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06806() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06807() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06808() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06809() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06810() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06811() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06868() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06869() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06870() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06871() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06872() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06873() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06874() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06931() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06932() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06933() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06934() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06935() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06936() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06937() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06994() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06995() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06996() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06997() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06998() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06999() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07000() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07057() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07058() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07059() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07060() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07061() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07062() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07063() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07064() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07065() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07066() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07067() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07068() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07069() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07070() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07071() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07072() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07073() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07074() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07075() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07076() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07077() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07078() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07079() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07080() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07081() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07082() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07083() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07084() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07085() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07086() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07087() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07088() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07089() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07090() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07091() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07092() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07093() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07094() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07095() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07096() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07097() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07098() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07120() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07121() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07122() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07123() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07124() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07125() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07126() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08317() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08318() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08319() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08320() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08321() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08322() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08323() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08380() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08381() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08382() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08383() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08384() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08385() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08386() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08443() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08444() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08445() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08446() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08447() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08448() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08449() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08506() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08507() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08508() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08509() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08510() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08511() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08512() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08569() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08570() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08571() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08572() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08573() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08574() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08575() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08576() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08577() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08578() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08579() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08580() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08581() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08582() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08583() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08584() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08585() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08586() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08587() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08588() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08589() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08590() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08591() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08592() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08593() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08594() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08595() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08596() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08597() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08598() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08599() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08600() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08601() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08602() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08603() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08604() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08605() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08606() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08607() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08608() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08609() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08610() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08632() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08633() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08634() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08635() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08636() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08637() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08638() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09829() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09830() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09831() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09832() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09833() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09834() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09835() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09892() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09893() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09894() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09895() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09896() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09897() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09898() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09955() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09956() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09957() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09958() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09959() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09960() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09961() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10018() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10019() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10020() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10021() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10022() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10023() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10024() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10081() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10082() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10083() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10084() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10085() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10086() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10087() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10088() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10089() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10090() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10091() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10092() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10093() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10094() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10095() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10096() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10097() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10098() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10099() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10100() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10101() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10102() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10103() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10104() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10105() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10106() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10107() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10108() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10109() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10110() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10111() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10112() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10113() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10114() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10115() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10116() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10117() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10118() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10119() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10120() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10121() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10122() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10144() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10145() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10146() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10147() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10148() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10149() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10150() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10207() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10208() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10209() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10210() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10211() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10212() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10213() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10270() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10271() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10272() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10273() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10274() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10275() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10276() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10333() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10334() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10335() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10336() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10337() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10338() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10339() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10396() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10397() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10398() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10399() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10400() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10401() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10402() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10459() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10460() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10461() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10462() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10463() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10464() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10465() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10522() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10523() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10524() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10525() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10526() {
        // Relevant specification requirements: [5, 8, 12, 15, 18, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10527() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10528() {
        // Relevant specification requirements: [5, 8, 12, 18, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11341() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11342() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11343() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11344() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11345() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11346() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11347() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11404() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11405() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11406() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11407() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11408() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11409() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11410() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11467() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11468() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11469() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11470() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11471() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11472() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11473() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11530() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11531() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11532() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11533() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11534() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11535() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11536() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11593() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11594() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11595() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11596() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11597() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11598() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11599() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11600() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11601() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11602() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11603() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11604() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11605() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11606() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11607() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11608() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11609() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11610() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11611() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11612() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11613() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11614() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11615() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11616() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11617() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11618() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11619() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11620() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11621() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11622() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11623() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11624() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11625() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11626() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11627() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11628() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11629() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11630() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11631() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11632() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11633() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11634() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11656() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11657() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11658() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11659() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11660() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11661() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11662() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 2500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11719() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11720() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11721() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11722() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11723() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11724() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11725() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11782() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11783() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11784() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11785() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11786() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11787() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11788() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11845() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11846() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11847() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11848() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11849() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11850() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11851() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11908() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11909() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11910() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11911() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11912() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11913() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11914() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11971() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11972() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11973() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11974() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11975() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11976() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11977() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11978() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11979() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11980() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11981() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11982() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11983() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11984() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11985() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11986() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11987() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11988() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11989() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11990() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11991() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11992() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11993() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11994() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11995() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11996() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11997() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11998() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11999() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12000() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12001() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12002() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12003() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12004() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12005() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12006() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12007() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12008() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12009() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12010() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12011() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12012() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12034() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12035() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12036() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12037() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12038() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12039() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12040() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12097() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12098() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12099() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12100() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12101() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12102() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12103() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12160() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12161() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12162() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12163() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12164() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12165() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12166() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12223() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12224() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12225() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12226() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12227() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12228() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12229() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12286() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12287() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12288() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12289() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12290() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12291() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12292() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12349() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12350() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12351() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12352() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12353() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12354() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12355() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12356() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12357() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12358() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12359() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12360() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12361() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12362() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12363() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12364() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12365() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12366() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12367() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12368() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12369() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12370() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12371() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12372() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12373() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12374() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12375() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12376() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12377() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12378() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12379() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12380() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12381() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12382() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12383() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12384() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12385() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12386() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12387() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12388() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12389() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12390() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12412() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12413() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12414() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12415() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12416() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12417() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12418() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 4001;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12475() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12476() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12477() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12478() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12479() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12480() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12481() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12538() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12539() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12540() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12541() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12542() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12543() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12544() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12601() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12602() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12603() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12604() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12605() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12606() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12607() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12664() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12665() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12666() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12667() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12668() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12669() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12670() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12727() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12728() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12729() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12730() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12731() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12732() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12733() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12734() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12735() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12736() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12737() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12738() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12739() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12740() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12741() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12742() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12743() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12744() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12745() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12746() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12747() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12748() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12749() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12750() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12751() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12752() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12753() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12754() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12755() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12756() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12757() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12758() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12759() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12760() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12761() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12762() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12763() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12764() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12765() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12766() {
        // Relevant specification requirements: [4, 15, 21, 26]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12767() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12768() {
        // Relevant specification requirements: [4, 21]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12790() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12791() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12792() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12793() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12794() {
        // Relevant specification requirements: [5, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12795() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12796() {
        // Relevant specification requirements: [5, 12, 21, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 5000;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12853() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12854() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12855() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12856() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12857() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12858() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12859() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12916() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12917() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12918() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12919() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12920() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12921() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12922() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12979() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12980() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12981() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12982() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12983() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12984() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12985() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13042() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13043() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13044() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13045() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13046() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13047() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13048() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13105() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13106() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13107() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13108() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13109() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13110() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13111() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13168() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13169() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13170() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13171() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13172() {
        // Relevant specification requirements: [3, 5, 7, 12, 15, 21, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13173() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test13174() {
        // Relevant specification requirements: [3, 5, 7, 12, 21, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 7500;
        int currentWheelDeflection = -35;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DEFLECT_WHEELS_RIGHT;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

}
