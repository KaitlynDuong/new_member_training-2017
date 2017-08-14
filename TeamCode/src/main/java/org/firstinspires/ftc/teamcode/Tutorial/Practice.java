package org.firstinspires.ftc.teamcode.Tutorial;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Student on 8/14/2017.
 */
public class Autonomous_Tutorial extends LinearOpMode {
        //Declaring and initializing variables
        private DcMotor leftMotor;
        private DcMotor rightMotor;
        private ElapsedTime runtime = new ElapsedTime();

        @Override
        public void runOpMode() throws InterruptedException {
        //Set up hardware map and direction
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        leftMotor.setDirection(DcMotor.Direction.REVERSE);

        //After waitForStart(), the robot will run its mode
        waitForStart();

        encoderDrive(0.5, 48, 48, 3);

        encoderDrive(0.5, -25, -25, 3);
    }
}