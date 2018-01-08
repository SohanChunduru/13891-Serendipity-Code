package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * Created by vagmi on 12/27/2017.
 */


    @TeleOp(name = "Glyph collector test", group = "Trial 1")

    public class Test_Op extends OpMode {
    DcMotor leftWheel;
    DcMotor rightWheel;
    //DcMotor DSlide;
    //Servo rFlipper;




    boolean leftWheelPower;
    boolean rightWheelPower;
    //boolean DSlidePower;
   //  boolean rFlipper;


    @Override
    public void init() {

        leftWheel = hardwareMap.dcMotor.get("leftWheel");
        rightWheel = hardwareMap.dcMotor.get("rightWheel");
      //  DSlide = hardwareMap.dcMotor.get("DSlide");
      //  rFlipper = hardwareMap.servo.get("rFlipper");

    }


    @Override
    public void loop() {
        leftWheelPower = gamepad2.x;
        rightWheelPower = gamepad2.x;
        leftWheelPower = gamepad2.b;
        rightWheelPower = gamepad2.b;
        //DSlidePower = gamepad2.right_bumper;
        //DSlidePower = gamepad2.left_bumper;


        if (gamepad2.x) {

            leftWheel.setPower(-0.5);
            rightWheel.setPower(0.5);


        } else if (gamepad2.b) {

            leftWheel.setPower(0.5);
            rightWheel.setPower(-0.5);


        } else {


            leftWheel.setPower(0);
            rightWheel.setPower(0);


        }

       // if (gamepad2.right_bumper) {

          //  DSlide.setPower(0.5);
        }

       // if (gamepad2.left_bumper) {

         //   DSlide.setPower(-0.5);
        }
       /*if (gamepad2.right_trigger){
            rFlipper.setPosition(0.5);
        }
        if (gamepad2.left_trigger){
            rFlipper.setPosition(0.0);
        }*/










