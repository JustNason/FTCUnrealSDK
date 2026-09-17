package org.ftcunreal.runtime.opmode;

import org.qualcomm.robotcore.hardware.HardwareMap;

public abstract class OpMode {
    public volatile HardwareMap hardwareMap = null;

    public abstract void internalRunOpMode();


}
