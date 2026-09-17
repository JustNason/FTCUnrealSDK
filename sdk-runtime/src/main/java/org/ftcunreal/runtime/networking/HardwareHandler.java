package org.ftcunreal.runtime.networking;

public class HardwareHandler {
    WebsocketHandler websocket = null;
    public HardwareHandler() {
        websocket = new WebsocketHandler();
        try {
            websocket.Connect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void GetHardware() {
        websocket.sendMessage("{\"command\": \"Get Hardware\"}");
    }

}
