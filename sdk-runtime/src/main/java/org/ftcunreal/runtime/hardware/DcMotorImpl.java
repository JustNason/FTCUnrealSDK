package org.ftcunreal.runtime.hardware;

import org.qualcomm.robotcore.hardware.DcMotor;
public class DcMotorImpl implements DcMotor {
    private double power;

    @Override
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public double getPower() {
        return power;
    }
}
