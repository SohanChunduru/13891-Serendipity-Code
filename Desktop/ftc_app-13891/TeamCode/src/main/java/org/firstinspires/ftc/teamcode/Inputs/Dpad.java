package org.firstinspires.ftc.teamcode.Inputs;

import org.firstinspires.ftc.teamcode.Utilities.Convert;
import com.qualcomm.robotcore.hardware.Gamepad;
/**
 * Created by Sohan on 11/26/17.
 */

public class Dpad {
    public enum Direction {
        Down,
        DownLeft,
        DownRight,
        Left,
        None,
        Right,
        Up,
        UpLeft,
        UpRight
    }

    private Direction _dircetion = Direction.None;

    public Dpad(Direction direction) {
        _dircetion = direction;
    }

    public Dpad(Gamepad gamepad) {
        _dircetion = Convert.toDirection(gamepad);
    }

    public Direction getDirection() {
        return _dircetion;
    }
}
