package org.ftcunreal.runtime.hardware;

import org.ftcunreal.runtime.networking.HardwareHandler;
import org.qualcomm.robotcore.hardware.HardwareMap;

public class HardwareMapImpl implements HardwareMap {

    HardwareHandler hardwareHandler;

    public HardwareMapImpl(HardwareHandler hardwareHandler) {
        this.hardwareHandler = hardwareHandler;
        init();
    }

    private void init() {
        hardwareHandler.GetHardware();
    }

    @Override
    public <T> T get(Class<T> deviceType, String name) {
        return null;
    }
}
