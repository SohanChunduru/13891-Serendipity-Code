package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Modules.Drives.MecanumDriveModule;

/**
 * Created by Sohan on 11/26/17.
 */

public abstract class BaseOp extends OpMode {
    protected MecanumDriveModule _driveModule = new MecanumDriveModule();

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {

    }

    protected abstract void initializeModules();
}
