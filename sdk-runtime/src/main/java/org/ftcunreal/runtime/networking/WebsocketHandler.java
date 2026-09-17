package org.ftcunreal.runtime.networking;

import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.net.URI;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CountDownLatch;
public class WebsocketHandler {
    private WebSocket webSocket;
    public void Connect() throws InterruptedException, Exception {
        String serverUrl = "ws://localhost:9000";

        CountDownLatch latch = new CountDownLatch(1);
        HttpClient client = HttpClient.newHttpClient();


        webSocket = client.newWebSocketBuilder()
                .buildAsync(URI.create(serverUrl), new WebSocketListener(latch))
                .join();

    }


    private static class WebSocketListener implements WebSocket.Listener {
        private final CountDownLatch latch;
        public WebSocketListener(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void onOpen(WebSocket webSocket) {
            System.out.println("CONNECTED to server");
            webSocket.request(1);
        }

        @Override
        public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
            System.out.println("RECEIVED message: " + data);

            webSocket.request(1);

            return null;
        }

        @Override
        public CompletionStage<?> onClose(WebSocket webSocket, int statusCode, String reason) {
            System.out.println("DISCONNECTED. Status: " + statusCode + ", Reason: " + reason);
            latch.countDown();
            return null;
        }

        @Override
        public void onError(WebSocket webSocket, Throwable error) {
            System.err.println("ERROR occurred: " + error.getMessage());
            error.printStackTrace();
            latch.countDown();
        }

    }

    public void sendMessage(String message) {
        webSocket.sendText(message, true);
    }

}

