package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Intake {

    DcMotor intake;



    public Intake(HardwareMap hm) {
        this.intake = hm.get(DcMotor.class,"mch0");
    }




    public void update(Gamepad gm1){

        if(gm1.left_bumper){
            intake.setPower(1);
        }
        if(gm1.right_bumper){
            intake.setPower(-1);
        }
        if(gm1.triangle){
            intake.setPower(0);
        }

    }
}
