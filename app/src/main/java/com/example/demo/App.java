package com.example.demo;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

public class App {
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.run();
    }

    private void run() throws IOException {
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        HttpServer httpServer = HttpServer.create(address, 0) ;
        httpServer.start();
        httpServer.createContext("/", exchange -> {
            System.out.println("Request /");
            String method = exchange.getRequestMethod();
            URI uri = exchange.getRequestURI();
            exchange.sendResponseHeaders(204, -1);
        });

        System.out.println("Listening on http://localhost:8080");
    }
}
