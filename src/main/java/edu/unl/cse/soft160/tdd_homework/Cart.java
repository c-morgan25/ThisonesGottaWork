package edu.unl.cse.soft160.tdd_homework;

public class Cart {
    public enum DriverInput {
        NO_INPUT,
        UP_ARROW,
        DOWN_ARROW,
        LEFT_ARROW,
        RIGHT_ARROW,
        EMERGENCY_STOP,
    }

    public enum Terrain {
        SMOOTH,
        MODERATE,
        ROUGH,
    }

    public enum Action {
        ACCELERATE,
        DECELERATE,
        DEFLECT_WHEELS_LEFT,
        DEFLECT_WHEELS_RIGHT,
        EMERGENCY_STOP,
        DISPLAY_SPEED_AND_HEADING,
        DISPLAY_MESSAGE,
    }

    private static final int MIN_SPEED_FOR_BRAKING = 1000;
    private static final int DEFLECTION_LIMIT = 30;
    private static final int DRIVER_WARNING_DEFLECTION = 26;

    public static Action act(
            DriverInput input,
            int currentSpeed,
            int currentWheelDeflection,
            Terrain terrain,
            int rateOfApproach,
            Action lastActionTaken
    ) {
        int maxSpeed = maxSpeedForTerrain(terrain);
        int criticalSpeed = criticalSpeedForTerrain(terrain);

        // High rate-of-approach situations override normal driver intent.
        if (rateOfApproach >= 1001) {
            return chooseTurnDirection(currentWheelDeflection);
        }

        if (rateOfApproach == 1000) {
            if (currentSpeed >= MIN_SPEED_FOR_BRAKING) {
                return Action.EMERGENCY_STOP;
            }
            return chooseTurnDirection(currentWheelDeflection);
        }

        if (rateOfApproach == 999) {
            if (currentSpeed == 0) {
                return chooseTurnDirection(currentWheelDeflection);
            }
            if (currentSpeed < MIN_SPEED_FOR_BRAKING) {
                return Action.EMERGENCY_STOP;
            }
            if (currentWheelDeflection > DEFLECTION_LIMIT) {
                return Action.DEFLECT_WHEELS_LEFT;
            }
            if (currentWheelDeflection < -DEFLECTION_LIMIT) {
                return Action.DEFLECT_WHEELS_RIGHT;
            }
            return Action.DECELERATE;
        }

        // Correct excessive steering before considering the driver's command.
        if (currentWheelDeflection > DEFLECTION_LIMIT) {
            return Action.DEFLECT_WHEELS_LEFT;
        }
        if (currentWheelDeflection < -DEFLECTION_LIMIT) {
            return Action.DEFLECT_WHEELS_RIGHT;
        }

        switch (input) {
            case DOWN_ARROW:
                return currentSpeed >= MIN_SPEED_FOR_BRAKING
                        ? Action.DECELERATE
                        : Action.DISPLAY_MESSAGE;
            case UP_ARROW:
                if (currentSpeed >= criticalSpeed) {
                    return Action.DECELERATE;
                }
                if (currentSpeed > maxSpeed) {
                    return Action.DISPLAY_MESSAGE;
                }
                return Action.ACCELERATE;
            case LEFT_ARROW:
                if (currentSpeed >= criticalSpeed) {
                    return Action.DECELERATE;
                }
                if (currentWheelDeflection <= -DRIVER_WARNING_DEFLECTION) {
                    return Action.DISPLAY_MESSAGE;
                }
                return Action.DEFLECT_WHEELS_LEFT;
            case RIGHT_ARROW:
                if (currentSpeed >= criticalSpeed) {
                    return Action.DECELERATE;
                }
                if (currentWheelDeflection >= DRIVER_WARNING_DEFLECTION) {
                    return Action.DISPLAY_MESSAGE;
                }
                return Action.DEFLECT_WHEELS_RIGHT;
            case EMERGENCY_STOP:
                return Action.EMERGENCY_STOP;
            case NO_INPUT:
            default:
                if (currentSpeed >= criticalSpeed) {
                    return Action.DECELERATE;
                }
                if (lastActionTaken == Action.EMERGENCY_STOP) {
                    return currentSpeed == 0
                            ? Action.DISPLAY_SPEED_AND_HEADING
                            : Action.DISPLAY_MESSAGE;
                }
                return Action.DISPLAY_SPEED_AND_HEADING;
        }
    }

    private static Action chooseTurnDirection(int currentWheelDeflection) {
        return currentWheelDeflection < 0
                ? Action.DEFLECT_WHEELS_RIGHT
                : Action.DEFLECT_WHEELS_LEFT;
    }

    private static int maxSpeedForTerrain(Terrain terrain) {
        switch (terrain) {
            case ROUGH:
                return 4000;
            case MODERATE:
                return 10000;
            case SMOOTH:
            default:
                return 14000;
        }
    }

    private static int criticalSpeedForTerrain(Terrain terrain) {
        switch (terrain) {
            case ROUGH:
                return 7500;
            case MODERATE:
                return 13500;
            case SMOOTH:
            default:
                return 17500;
        }
    }
}
