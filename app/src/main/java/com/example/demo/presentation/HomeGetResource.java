package com.example.demo.presentation;

public class HomeGetResource extends ResourceMethodHandler {

    public final static String PATH = "/";

    public String handle(String content) {
        return "Hello, World!";
    }

}
