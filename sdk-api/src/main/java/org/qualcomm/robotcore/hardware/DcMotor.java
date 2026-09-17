package org.qualcomm.robotcore.hardware;

public interface DcMotor {

    enum Direction { FORWARD, REVERSE;
        public Direction inverted() {
            return this==FORWARD ? REVERSE : FORWARD;
        }
    }
    void setPower(double power);

    void setDirection(Direction direction);

    double getPower();
}
