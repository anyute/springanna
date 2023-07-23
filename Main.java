package src.main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 8080; // Порт, на котором будет запущен сервер
        Server server = new Server(port);
        server.start();
    }

}
