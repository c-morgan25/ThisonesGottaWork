package edu.unl.cse.soft160.tdd_homework;

import static org.junit.Assert.*;

import edu.unl.cse.soft160.tdd_homework.Cart.Action;
import edu.unl.cse.soft160.tdd_homework.Cart.DriverInput;
import edu.unl.cse.soft160.tdd_homework.Cart.Terrain;
import org.junit.Test;

import java.util.Set;

public class CartMustAccelerateTest {
    @Test
    public void test00071() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00072() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00073() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00074() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00075() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00076() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00077() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00078() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00079() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00080() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00081() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00082() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00083() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00084() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00085() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00086() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00087() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00088() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00089() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00090() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00091() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00092() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00093() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00094() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00095() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00096() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00097() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00098() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00099() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00100() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00101() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00102() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00103() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00104() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00105() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00106() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00107() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00108() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00109() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00110() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00111() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00112() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00113() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00114() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00115() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00116() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00117() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00118() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00119() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01583() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01584() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01585() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01586() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01587() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01588() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01589() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01590() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01591() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01592() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01593() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01594() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01595() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01596() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01597() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01598() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01599() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01600() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01601() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01602() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01603() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01604() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01605() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01606() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01607() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01608() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01609() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01610() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01611() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01612() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01613() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01614() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01615() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01616() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01617() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01618() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01619() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01620() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01621() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01622() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01623() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01624() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01625() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01626() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01627() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01628() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01629() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01630() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01631() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03095() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03096() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03097() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03098() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03099() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03100() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03101() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03102() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03103() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03104() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03105() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03106() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03107() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03108() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03109() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03110() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03111() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03112() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03113() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03114() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03115() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03116() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03117() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03118() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03119() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03120() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03121() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03122() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03123() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03124() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03125() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03126() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03127() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03128() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03129() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03130() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03131() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03132() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03133() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03134() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03135() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03136() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03137() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03138() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03139() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03140() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03141() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03142() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03143() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04607() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04608() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04609() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04610() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04611() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04612() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04613() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04614() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04615() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04616() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04617() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04618() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04619() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04620() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04621() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04622() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04623() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04624() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04625() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04626() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04627() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04628() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04629() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04630() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04631() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04632() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04633() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04634() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04635() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04636() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04637() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04638() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04639() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04640() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04641() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04642() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04643() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04644() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04645() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04646() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04647() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04648() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04649() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04650() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04651() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04652() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04653() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04654() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04655() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04985() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04986() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04987() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04988() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04989() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04990() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04991() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04992() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04993() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04994() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04995() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04996() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04997() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04998() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04999() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05000() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05001() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05002() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05003() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05004() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05005() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05006() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05007() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05008() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05009() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05010() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05011() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05012() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05013() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05014() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05015() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05016() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05017() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05018() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05019() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05020() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05021() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05022() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05023() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05024() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05025() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05026() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05027() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05028() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05029() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05030() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05031() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05032() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05033() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06875() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06876() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06877() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06878() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06879() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06880() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06881() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06882() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06883() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06884() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06885() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06886() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06887() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06888() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06889() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06890() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06891() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06892() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06893() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06894() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06895() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06896() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06897() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06898() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06899() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06900() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06901() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06902() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06903() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06904() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06905() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06906() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06907() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06908() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06909() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06910() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06911() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06912() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06913() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06914() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06915() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06916() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06917() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06918() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06919() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06920() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06921() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06922() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06923() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08387() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08388() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08389() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08390() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08391() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08392() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08393() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08394() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08395() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08396() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08397() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08398() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08399() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08400() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08401() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08402() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08403() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08404() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08405() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08406() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08407() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08408() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08409() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08410() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08411() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08412() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08413() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08414() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08415() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08416() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08417() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08418() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08419() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08420() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08421() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08422() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08423() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08424() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08425() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08426() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08427() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08428() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08429() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08430() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08431() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08432() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08433() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08434() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08435() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09899() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09900() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09901() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09902() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09903() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09904() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09905() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09906() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09907() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09908() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09909() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09910() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09911() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09912() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09913() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09914() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09915() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09916() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09917() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09918() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09919() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09920() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09921() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09922() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09923() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09924() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09925() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09926() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09927() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09928() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09929() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09930() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09931() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09932() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09933() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09934() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09935() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09936() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09937() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09938() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09939() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09940() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09941() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09942() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09943() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09944() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09945() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09946() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09947() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11411() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11412() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11413() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11414() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11415() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11416() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11417() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11418() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11419() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11420() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11421() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11422() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11423() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11424() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11425() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11426() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11427() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11428() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11429() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11430() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11431() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11432() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11433() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11434() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11435() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11436() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11437() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11438() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11439() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11440() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11441() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11442() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11443() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11444() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11445() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11446() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11447() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11448() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11449() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11450() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11451() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11452() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11453() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11454() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11455() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11456() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11457() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11458() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11459() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11789() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11790() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11791() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11792() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11793() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11794() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11795() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11796() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11797() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11798() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11799() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11800() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11801() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11802() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11803() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11804() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11805() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11806() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11807() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11808() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11809() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11810() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11811() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11812() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11813() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11814() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11815() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11816() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11817() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11818() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11819() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11820() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11821() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11822() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11823() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11824() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11825() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11826() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11827() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11828() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11829() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11830() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11831() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11832() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11833() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11834() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11835() {
        // Relevant specification requirements: [1, 15, 21, 26]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11836() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11837() {
        // Relevant specification requirements: [1, 21]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.ACCELERATE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

}
