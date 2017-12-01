package org.firstinspires.ftc.teamcode.Modules.Drives;

import com.qualcomm.robotcore.hardware.Gamepad;
import org.firstinspires.ftc.teamcode.Inputs.Joystick;

/**
 * Created by Sohan on 11/26/17.
 */

public class TankDriveModule extends DriveModule{
    public void move(Gamepad gamepad) {
        move(new Joystick(gamepad));
    }

    public void move(Joystick joystick) {
        move(joystick.getLeft(), joystick.getRight());
    }

    public void move(double left, double right) {
        setPower(left, right);
    }
}
