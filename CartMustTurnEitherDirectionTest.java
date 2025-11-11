package edu.unl.cse.soft160.tdd_homework;

import static org.junit.Assert.*;

import edu.unl.cse.soft160.tdd_homework.Cart.Action;
import edu.unl.cse.soft160.tdd_homework.Cart.DriverInput;
import edu.unl.cse.soft160.tdd_homework.Cart.Terrain;
import org.junit.Test;

import java.util.Set;

public class CartMustTurnEitherDirectionTest {
    @Test
    public void test00414() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00415() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00416() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00417() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00418() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00419() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00420() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00421() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00422() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00423() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00424() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00425() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00426() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00427() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00428() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00429() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00430() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00431() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00432() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00433() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00434() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00435() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00436() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00437() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00438() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00439() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00440() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00441() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00477() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00478() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00479() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00480() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00481() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00482() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00483() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00484() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00485() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00486() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00487() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00488() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00489() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00490() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00491() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00492() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00493() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00494() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00495() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00496() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00497() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00498() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00499() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00500() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00501() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00502() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00503() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00504() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00540() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00541() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00542() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00543() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00544() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00545() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00546() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00547() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00548() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00549() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00550() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00551() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00552() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00553() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00554() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00555() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00556() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00557() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00558() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00559() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00560() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00561() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00562() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00563() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00564() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00565() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00566() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00567() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00603() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00604() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00605() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00606() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00607() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00608() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00609() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00610() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00611() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00612() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00613() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00614() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00615() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00616() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00617() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00618() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00619() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00620() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00621() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00622() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00623() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00624() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00625() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00626() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00627() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00628() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00629() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00630() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00666() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00667() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00668() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00669() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00670() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00671() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00672() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00673() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00674() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00675() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00676() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00677() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00678() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00679() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00680() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00681() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00682() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00683() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00684() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00685() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00686() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00687() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00688() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00689() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00690() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00691() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00692() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00693() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00729() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00730() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00731() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00732() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00733() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00734() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00735() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00736() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00737() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00738() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00739() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00740() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00741() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00742() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00743() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00744() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00745() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00746() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00747() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00748() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00749() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00750() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00751() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00752() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00753() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00754() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00755() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00756() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 999;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00792() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00793() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00794() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00795() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00796() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00797() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00798() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00799() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00800() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00801() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00802() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00803() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00804() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00805() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00806() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00807() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00808() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00809() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00810() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00811() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00812() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00813() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00814() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00815() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00816() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00817() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00818() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00819() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00855() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00856() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00857() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00858() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00859() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00860() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00861() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00862() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00863() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00864() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00865() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00866() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00867() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00868() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00869() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00870() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00871() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00872() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00873() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00874() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00875() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00876() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00877() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00878() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00879() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00880() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00881() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00882() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00918() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00919() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00920() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00921() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00922() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00923() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00924() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00925() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00926() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00927() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00928() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00929() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00930() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00931() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00932() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00933() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00934() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00935() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00936() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00937() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00938() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00939() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00940() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00941() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00942() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00943() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00944() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00945() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00981() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00982() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00983() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00984() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00985() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00986() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00987() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00988() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00989() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00990() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00991() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00992() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00993() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00994() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00995() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00996() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00997() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00998() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test00999() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01000() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01001() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01002() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01003() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01004() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01005() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01006() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01007() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01008() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01044() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01045() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01046() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01047() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01048() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01049() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01050() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01051() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01052() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01053() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01054() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01055() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01056() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01057() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01058() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01059() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01060() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01061() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01062() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01063() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01064() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01065() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01066() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01067() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01068() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01069() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01070() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01071() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01107() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01108() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01109() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01110() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01111() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01112() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01113() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01114() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01115() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01116() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01117() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01118() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01119() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01120() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01121() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01122() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01123() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01124() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01125() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01126() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01127() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01128() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01129() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01130() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01131() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01132() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01133() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01134() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01170() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01171() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01172() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01173() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01174() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01175() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01176() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01177() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01178() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01179() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01180() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01181() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01182() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01183() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01184() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01185() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01186() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01187() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01188() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01189() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01190() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01191() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01192() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01193() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01194() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01195() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01196() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01197() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01233() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01234() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01235() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01236() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01237() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01238() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01239() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01240() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01241() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01242() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01243() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01244() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01245() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01246() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01247() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01248() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01249() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01250() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01251() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01252() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01253() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01254() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01255() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01256() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01257() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01258() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01259() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01260() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01296() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01297() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01298() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01299() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01300() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01301() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01302() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01303() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01304() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01305() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01306() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01307() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01308() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01309() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01310() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01311() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01312() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01313() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01314() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01315() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01316() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01317() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01318() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01319() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01320() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01321() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01322() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01323() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01359() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01360() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01361() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01362() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01363() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01364() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01365() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01366() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01367() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01368() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01369() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01370() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01371() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01372() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01373() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01374() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01375() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01376() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01377() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01378() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01379() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01380() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01381() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01382() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01383() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01384() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01385() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01386() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01422() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01423() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01424() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01425() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01426() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01427() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01428() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01429() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01430() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01431() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01432() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01433() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01434() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01435() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01436() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01437() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01438() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01439() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01440() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01441() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01442() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01443() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01444() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01445() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01446() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01447() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01448() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01449() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01485() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01486() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01487() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01488() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01489() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01490() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01491() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01492() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01493() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01494() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01495() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01496() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01497() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01498() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01499() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01500() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01501() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01502() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01503() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01504() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01505() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01506() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01507() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01508() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01509() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01510() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01511() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test01512() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 0;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02304() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02305() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02306() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02307() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02308() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02309() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02310() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02311() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02312() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02313() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02314() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02315() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02316() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02317() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02318() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02319() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02320() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02321() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02322() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02323() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02324() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02325() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02326() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02327() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02328() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02329() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02330() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02331() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02367() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02368() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02369() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02370() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02371() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02372() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02373() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02374() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02375() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02376() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02377() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02378() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02379() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02380() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02381() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02382() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02383() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02384() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02385() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02386() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02387() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02388() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02389() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02390() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02391() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02392() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02393() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02394() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02430() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02431() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02432() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02433() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02434() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02435() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02436() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02437() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02438() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02439() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02440() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02441() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02442() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02443() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02444() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02445() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02446() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02447() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02448() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02449() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02450() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02451() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02452() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02453() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02454() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02455() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02456() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02457() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02493() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02494() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02495() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02496() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02497() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02498() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02499() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02500() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02501() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02502() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02503() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02504() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02505() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02506() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02507() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02508() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02509() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02510() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02511() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02512() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02513() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02514() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02515() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02516() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02517() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02518() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02519() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02520() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02556() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02557() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02558() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02559() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02560() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02561() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02562() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02563() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02564() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02565() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02566() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02567() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02568() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02569() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02570() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02571() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02572() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02573() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02574() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02575() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02576() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02577() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02578() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02579() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02580() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02581() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02582() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02583() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02619() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02620() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02621() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02622() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02623() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02624() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02625() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02626() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02627() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02628() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02629() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02630() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02631() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02632() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02633() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02634() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02635() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02636() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02637() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02638() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02639() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02640() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02641() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02642() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02643() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02644() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02645() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02646() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02682() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02683() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02684() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02685() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02686() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02687() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02688() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02689() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02690() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02691() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02692() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02693() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02694() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02695() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02696() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02697() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02698() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02699() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02700() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02701() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02702() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02703() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02704() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02705() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02706() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02707() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02708() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02709() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02745() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02746() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02747() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02748() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02749() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02750() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02751() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02752() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02753() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02754() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02755() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02756() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02757() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02758() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02759() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02760() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02761() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02762() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02763() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02764() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02765() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02766() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02767() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02768() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02769() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02770() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02771() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02772() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02808() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02809() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02810() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02811() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02812() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02813() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02814() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02815() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02816() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02817() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02818() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02819() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02820() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02821() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02822() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02823() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02824() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02825() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02826() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02827() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02828() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02829() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02830() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02831() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02832() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02833() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02834() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02835() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02871() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02872() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02873() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02874() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02875() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02876() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02877() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02878() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02879() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02880() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02881() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02882() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02883() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02884() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02885() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02886() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02887() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02888() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02889() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02890() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02891() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02892() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02893() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02894() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02895() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02896() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02897() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02898() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02934() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02935() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02936() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02937() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02938() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02939() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02940() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02941() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02942() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02943() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02944() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02945() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02946() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02947() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02948() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02949() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02950() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02951() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02952() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02953() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02954() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02955() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02956() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02957() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02958() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02959() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02960() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02961() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02997() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02998() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test02999() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03000() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03001() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03002() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03003() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03004() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03005() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03006() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03007() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03008() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03009() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03010() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03011() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03012() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03013() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03014() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03015() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03016() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03017() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03018() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03019() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03020() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03021() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03022() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03023() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test03024() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 999;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04194() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04195() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04196() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04197() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04198() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04199() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04200() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04201() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04202() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04203() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04204() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04205() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04206() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04207() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04208() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04209() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04210() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04211() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04212() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04213() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04214() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04215() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04216() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04217() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04218() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04219() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04220() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04221() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04257() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04258() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04259() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04260() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04261() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04262() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04263() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04264() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04265() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04266() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04267() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04268() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04269() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04270() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04271() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04272() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04273() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04274() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04275() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04276() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04277() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04278() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04279() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04280() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04281() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04282() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04283() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04284() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04320() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04321() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04322() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04323() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04324() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04325() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04326() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04327() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04328() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04329() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04330() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04331() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04332() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04333() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04334() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04335() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04336() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04337() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04338() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04339() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04340() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04341() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04342() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04343() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04344() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04345() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04346() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04347() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04383() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04384() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04385() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04386() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04387() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04388() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04389() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04390() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04391() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04392() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04393() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04394() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04395() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04396() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04397() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04398() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04399() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04400() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04401() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04402() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04403() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04404() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04405() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04406() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04407() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04408() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04409() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04410() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04446() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04447() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04448() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04449() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04450() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04451() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04452() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04453() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04454() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04455() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04456() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04457() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04458() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04459() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04460() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04461() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04462() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04463() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04464() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04465() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04466() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04467() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04468() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04469() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04470() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04471() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04472() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04473() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04509() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04510() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04511() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04512() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04513() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04514() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04515() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04516() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04517() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04518() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04519() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04520() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04521() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04522() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04523() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04524() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04525() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04526() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04527() {
        // Relevant specification requirements: [10, 13, 15, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04528() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04529() {
        // Relevant specification requirements: [10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04530() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04531() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04532() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04533() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04534() {
        // Relevant specification requirements: [5, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04535() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test04536() {
        // Relevant specification requirements: [5, 10, 12, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 1000;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 1001;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06462() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06463() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06464() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06465() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06466() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06467() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06468() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06469() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06470() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06471() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06472() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06473() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06474() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06475() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06476() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06477() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06478() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06479() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06480() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06481() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06482() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06483() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06484() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06485() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06486() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06487() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06488() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06489() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.NO_INPUT;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06525() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06526() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06527() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06528() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06529() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06530() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06531() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06532() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06533() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06534() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06535() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06536() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06537() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06538() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06539() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06540() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06541() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06542() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06543() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06544() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06545() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06546() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06547() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06548() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06549() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06550() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06551() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06552() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.UP_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06588() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06589() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06590() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06591() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06592() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06593() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06594() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06595() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06596() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06597() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06598() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06599() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06600() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06601() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06602() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06603() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06604() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06605() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06606() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06607() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06608() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06609() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06610() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06611() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06612() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06613() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06614() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06615() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.DOWN_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06651() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06652() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06653() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06654() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06655() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06656() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06657() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06658() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06659() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06660() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06661() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06662() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06663() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06664() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06665() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06666() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06667() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06668() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06669() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06670() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06671() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06672() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06673() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06674() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06675() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06676() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06677() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06678() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.LEFT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06714() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06715() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06716() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06717() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06718() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06719() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06720() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06721() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06722() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06723() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06724() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06725() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06726() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06727() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06728() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06729() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06730() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06731() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06732() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06733() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06734() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06735() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06736() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06737() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06738() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06739() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06740() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06741() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.RIGHT_ARROW;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06777() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06778() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06779() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06780() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06781() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06782() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06783() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 25;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06784() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06785() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06786() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06787() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06788() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06789() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06790() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 26;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06791() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06792() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06793() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06794() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06795() {
        // Relevant specification requirements: [3, 7, 10, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06796() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06797() {
        // Relevant specification requirements: [3, 7, 10, 13, 20, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 30;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06798() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.ACCELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06799() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DECELERATE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06800() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_LEFT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06801() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DEFLECT_WHEELS_RIGHT;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06802() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 15, 20, 26, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.EMERGENCY_STOP;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06803() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_SPEED_AND_HEADING;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

    @Test
    public void test06804() {
        // Relevant specification requirements: [3, 5, 7, 10, 12, 13, 20, 25, 27]
        DriverInput input = DriverInput.EMERGENCY_STOP;
        int currentSpeed = 17500;
        int currentWheelDeflection = 35;
        Terrain terrain = Terrain.SMOOTH;
        int rateOfApproach = 18000;
        Action lastActionTaken = Action.DISPLAY_MESSAGE;
        Set<Action> expectedNextActionOptions = Set.of(Action.DEFLECT_WHEELS_LEFT, Action.DEFLECT_WHEELS_RIGHT);
        Action actualNextAction = Cart.act(input, currentSpeed, currentWheelDeflection, terrain, rateOfApproach, lastActionTaken);
        assertTrue(expectedNextActionOptions.contains(actualNextAction));
    }

}
