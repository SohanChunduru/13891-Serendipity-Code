package org.firstinspires.ftc.teamcode.Modules.Drives;

import org.firstinspires.ftc.teamcode.Inputs.Dpad;
import org.firstinspires.ftc.teamcode.Inputs.Joystick;
import com.qualcomm.robotcore.hardware.Gamepad;


/**
 * Created by Sohan on 11/26/17.
 */

public class MecanumDriveModule extends TankDriveModule {
    public void move(Dpad dpad) {
        move(dpad.getDirection());
    }

    public void move(Dpad.Direction direction) {
        switch (direction) {
            case Down:
                setPower(-1.0d);
                break;
            case DownLeft:
                setPower(0.0d, -1.0d, -1.0d, 0.0d);
                break;
            case DownRight:
                setPower(0.0d, 1.0d, 1.0d, 0.0d);
                break;
            case Left:
                setPower(-1.0d, 1.0d, 1.0d, -1.0d);
                break;
            case Right:
                setPower(1.0d, -1.0d, -1.0d, 1.0d);
                break;
            case Up:
                setPower(1.0d);
                break;
            case UpLeft:
                setPower(-1.0d, 0.0d, 0.0d, -1.0d);
                break;
            case UpRight:
                setPower(1.0d, 0.0d, 0.0d, 1.0d);
                break;
            default:
                stop();
                break;
        }
}

    public void move(Gamepad gamepad) {
        if (gamepad.dpad_down || gamepad.dpad_left || gamepad.dpad_right || gamepad.dpad_up) {
            move(new Dpad(gamepad));
        }
        else {
            move(new Joystick(gamepad));
        }
    }
}
