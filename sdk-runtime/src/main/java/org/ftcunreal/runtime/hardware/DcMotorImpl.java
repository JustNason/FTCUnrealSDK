package org.ftcunreal.runtime.hardware;

import org.qualcomm.robotcore.hardware.DcMotor;
public class DcMotorImpl implements DcMotor {
    private double power;
    private Direction direction;

    @Override
    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public double getPower() {
        return power;
    }

    @Override
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
