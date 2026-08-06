package org.firstinspires.ftc.teamcode.robotmodules;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class shooter {

    private DcMotor shooter;

    private double far_power = 1;
    private double close_power = 0.5;
    private double idle_power = 0.25;


    public shooter(HardwareMap hm) {
        shooter = hm.get(DcMotor.class,"");
        shooter.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void update(Gamepad gm1){
        if(gm1.triangleWasPressed()){
            shooter.setPower(far_power);
        }
        else if(gm1.triangleWasReleased() || gm1.squareWasReleased()){
            shooter.setPower(idle_power);
        }
        else if(gm1.squareWasPressed()){
            shooter.setPower(close_power);
        }
    }



}
