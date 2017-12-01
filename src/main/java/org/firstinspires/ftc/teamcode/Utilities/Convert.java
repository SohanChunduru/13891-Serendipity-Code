package org.firstinspires.ftc.teamcode.Utilities;

/**
 * Created by Sohan on 11/26/17.
 */

import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.Inputs.Dpad;

public class Convert {
    public static Dpad.Direction toDirection(Gamepad gamepad) {
        if (gamepad.dpad_down && gamepad.dpad_left) {
            return Dpad.Direction.DownLeft;
        }
        else if (gamepad.dpad_down && gamepad.dpad_right) {
            return Dpad.Direction.DownRight;
        }
        else if (gamepad.dpad_up && gamepad.dpad_left) {
            return Dpad.Direction.UpLeft;
        }
        else if (gamepad.dpad_up && gamepad.dpad_right) {
            return Dpad.Direction.UpRight;
        }
        else if (gamepad.dpad_down) {
            return Dpad.Direction.Down;
        }
        else if (gamepad.dpad_left) {
            return Dpad.Direction.Left;
        }
        else if (gamepad.dpad_right) {
            return Dpad.Direction.Right;
        }
        else if (gamepad.dpad_up) {
            return Dpad.Direction.Up;
        }
        else {
            return Dpad.Direction.None;
        }
    }
}
