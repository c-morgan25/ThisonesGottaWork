package edu.unl.cse.soft160.tdd_homework;

import static org.junit.Assert.*;

import edu.unl.cse.soft160.tdd_homework.Cart.Action;
import edu.unl.cse.soft160.tdd_homework.Cart.DriverInput;
import edu.unl.cse.soft160.tdd_homework.Cart.Terrain;
import org.junit.Test;

import java.util.Set;

public class CartMustDisplayMessageTest {
    @Test
    public void test00134() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00135() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00136() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00137() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00138() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00139() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00140() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00141() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00142() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00143() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00144() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00145() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00146() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00147() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00148() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00149() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00150() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00151() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00152() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00153() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00154() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00155() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00156() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00157() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00158() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00159() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00160() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00161() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00162() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00163() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00164() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00165() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00166() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00167() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00168() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00169() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00170() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00171() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00172() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00173() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00174() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00175() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00176() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00177() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00178() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00179() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00180() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00181() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00182() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00197() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00198() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00199() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00200() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00201() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00202() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00203() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00204() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00205() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00206() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00207() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00208() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00209() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00210() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00295() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00296() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00297() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00298() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00299() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00300() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00301() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00302() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00303() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00304() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00305() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00306() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00307() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test00308() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01524() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01531() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01538() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01545() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01552() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01559() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01566() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01646() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01647() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01648() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01649() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01650() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01651() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01652() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01653() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01654() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01655() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01656() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01657() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01658() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01659() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01660() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01661() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01662() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01663() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01664() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01665() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01666() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01667() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01668() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01669() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01670() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01671() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01672() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01673() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01674() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01675() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01676() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01677() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01678() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01679() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01680() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01681() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01682() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01683() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01684() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01685() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01686() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01687() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01688() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01689() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01690() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01691() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01692() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01693() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01694() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01709() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01710() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01711() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01712() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01713() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01714() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01715() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01716() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01717() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01718() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01719() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01720() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01721() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01722() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01807() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01808() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01809() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01810() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01811() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01812() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01813() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01814() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01815() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01816() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01817() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01818() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01819() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test01820() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03036() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03043() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03050() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03057() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03064() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03071() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03078() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03221() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03222() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03223() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03224() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03225() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03226() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03227() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03228() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03229() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03230() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03231() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03232() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03233() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03234() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03319() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03320() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03321() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03322() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03323() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03324() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03325() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03326() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03327() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03328() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03329() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03330() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03331() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test03332() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04548() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04555() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04562() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04569() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04576() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04583() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04590() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04733() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04734() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04735() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04736() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04737() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04738() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04739() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04740() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04741() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04742() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04743() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04744() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04745() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04746() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04831() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04832() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04833() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04834() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04835() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04836() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04837() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04838() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04839() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04840() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04841() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04842() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04843() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04844() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 12500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04926() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04933() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04940() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04947() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04954() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04961() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test04968() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05111() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05112() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05113() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05114() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05115() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05116() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05117() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05118() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05119() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05120() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05121() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05122() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05123() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05124() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05209() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05210() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05211() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05212() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05213() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05214() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05215() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05216() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05217() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05218() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05219() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05220() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05221() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05222() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05304() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05311() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05318() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05325() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05332() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05339() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05346() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05363() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05364() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05365() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05366() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05367() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05368() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05369() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05370() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05371() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05372() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05373() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05374() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05375() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05376() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05377() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05378() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05379() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05380() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05381() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05382() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05383() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05384() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05385() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05386() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05387() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05388() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05389() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05390() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05391() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05392() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05393() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05394() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05395() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05396() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05397() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05398() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05399() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05400() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05401() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05402() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05403() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05404() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05405() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05406() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05407() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05408() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05409() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05410() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05411() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05489() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05490() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05491() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05492() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05493() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05494() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05495() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05496() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05497() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05498() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05499() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05500() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05501() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05502() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05587() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05588() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05589() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05590() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05591() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05592() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05593() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05594() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05595() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05596() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05597() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05598() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05599() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05600() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 14001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05682() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05689() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05696() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05703() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05710() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05717() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05724() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05741() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05742() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05743() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05744() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05745() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05746() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05747() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05748() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05749() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05750() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05751() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05752() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05753() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05754() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05755() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05756() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05757() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05758() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05759() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05760() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05761() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05762() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05763() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05764() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05765() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05766() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05767() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05768() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05769() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05770() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05771() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05772() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05773() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05774() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05775() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05776() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05777() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05778() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05779() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05780() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05781() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05782() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05783() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05784() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05785() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05786() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05787() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05788() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05789() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05867() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05868() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05869() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05870() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05871() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05872() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05873() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05874() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05875() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05876() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05877() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05878() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05879() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05880() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05965() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05966() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05967() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05968() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05969() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05970() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05971() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05972() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05973() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05974() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05975() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05976() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05977() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test05978() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 15000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06938() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06939() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06940() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06941() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06942() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06943() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06944() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06945() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06946() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06947() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06948() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06949() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06950() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06951() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06952() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06953() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06954() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06955() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06956() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06957() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06958() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06959() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06960() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06961() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06962() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06963() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06964() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06965() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06966() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06967() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06968() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06969() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06970() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06971() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06972() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06973() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06974() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06975() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06976() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06977() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06978() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06979() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06980() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06981() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06982() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06983() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06984() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06985() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test06986() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07001() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07002() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07003() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07004() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07005() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07006() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07007() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07008() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07009() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07010() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07011() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07012() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07013() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07014() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07099() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07100() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07101() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07102() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07103() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07104() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07105() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07106() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07107() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07108() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07109() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07110() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07111() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test07112() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08328() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08335() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08342() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08349() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08356() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08363() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08370() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08450() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08451() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08452() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08453() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08454() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08455() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08456() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08457() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08458() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08459() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08460() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08461() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08462() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08463() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08464() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08465() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08466() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08467() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08468() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08469() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08470() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08471() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08472() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08473() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08474() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08475() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08476() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08477() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08478() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08479() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08480() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08481() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08482() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08483() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08484() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08485() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08486() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08487() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08488() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08489() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08490() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08491() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08492() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08493() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08494() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08495() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08496() {
        // Relevant specification requirements: [2, 14, 15, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08497() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08498() {
        // Relevant specification requirements: [2, 14, 21, 29]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08513() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08514() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08515() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08516() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08517() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08518() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08519() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08520() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08521() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08522() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08523() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08524() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08525() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08526() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08611() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08612() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08613() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08614() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08615() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08616() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08617() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08618() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08619() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08620() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08621() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08622() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08623() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test08624() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09840() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09847() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09854() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09861() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09868() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09875() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test09882() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10025() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10026() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10027() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10028() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10029() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10030() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10031() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10032() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10033() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10034() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10035() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10036() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10037() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10038() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10123() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10124() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10125() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10126() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10127() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10128() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10129() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10130() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10131() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10132() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10133() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10134() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10135() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test10136() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11352() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11359() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11366() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11373() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11380() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11387() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11394() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11537() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11538() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11539() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11540() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11541() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11542() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11543() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11544() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11545() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11546() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11547() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11548() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11549() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11550() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11635() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11636() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11637() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11638() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11639() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11640() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11641() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11642() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11643() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11644() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11645() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11646() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11647() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11648() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 2500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11730() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11737() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11744() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11751() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11758() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11765() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11772() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11915() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11916() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11917() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11918() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11919() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11920() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11921() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11922() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11923() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11924() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11925() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11926() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11927() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test11928() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12013() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12014() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12015() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12016() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12017() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12018() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12019() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12020() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12021() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12022() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12023() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12024() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12025() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12026() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12108() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12115() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12122() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12129() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12136() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12143() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12150() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12167() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12168() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12169() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12170() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12171() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12172() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12173() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12174() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12175() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12176() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12177() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12178() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12179() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12180() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12181() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12182() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12183() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12184() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12185() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12186() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12187() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12188() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12189() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12190() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12191() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12192() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12193() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12194() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12195() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12196() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12197() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12198() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12199() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12200() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12201() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12202() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12203() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12204() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12205() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12206() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12207() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12208() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12209() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12210() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12211() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12212() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12213() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12214() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12215() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12293() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12294() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12295() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12296() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12297() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12298() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12299() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12300() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12301() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12302() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12303() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12304() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12305() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12306() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12391() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12392() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12393() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12394() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12395() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12396() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12397() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12398() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12399() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12400() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12401() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12402() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12403() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12404() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 4001;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12486() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12493() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12500() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12507() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12514() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12521() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12528() {
        // Relevant specification requirements: [15, 21]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12545() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12546() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12547() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12548() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12549() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12550() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12551() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12552() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12553() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12554() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12555() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12556() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12557() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12558() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12559() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12560() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12561() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12562() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12563() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12564() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12565() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12566() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12567() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12568() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12569() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12570() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12571() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12572() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 0;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12573() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12574() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12575() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12576() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12577() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12578() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12579() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12580() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12581() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12582() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12583() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12584() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12585() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12586() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12587() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12588() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12589() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12590() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12591() {
        // Relevant specification requirements: [1, 3, 14, 15, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12592() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12593() {
        // Relevant specification requirements: [1, 3, 14, 21, 28]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12671() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12672() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12673() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12674() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12675() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12676() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12677() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12678() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12679() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12680() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12681() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12682() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12683() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12684() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = -26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12769() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12770() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12771() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12772() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12773() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12774() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12775() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12776() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.ACCELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12777() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DECELERATE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12778() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12779() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12780() {
        // Relevant specification requirements: [4, 5, 14, 15, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12781() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

    @Test
    public void test12782() {
        // Relevant specification requirements: [4, 5, 14, 17, 21, 30]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 5000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.ROUGH;
        int rateOfApproach = 0;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Action expectedNextAction = Action.DISPLAY_MESSAGE;
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertEquals(expectedNextAction, actualNextAction);
    }

}
