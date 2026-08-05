package org.firstinspires.ftc.teamcode.robotmodules;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Dropdown {

    public Servo dropdown;
    public double onPos = 0.5;
    public double offPos = 0.2;

    private State state;


    public enum State{
        ON,
        OFF;
    }



    public Dropdown(HardwareMap hm) {
        this.dropdown = hm.get(Servo.class,"");
        state = State.OFF;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setPosition(double position){
        dropdown.setPosition(position);
    }




    public void update(Gamepad gm1) {
        if(gm1.xWasPressed()){
            setState(State.ON);
        }
        else if(gm1.xWasReleased()){
            setState(State.OFF);
        }


        switch (state) {
            case ON:
                dropdown.setPosition(onPos);
                break;
            case OFF :
                dropdown.setPosition(offPos);
                break;
        }
    }
}
