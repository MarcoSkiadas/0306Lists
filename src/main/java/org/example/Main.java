package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> list = new ArrayList();
        list.add("Hello");
        list.add("Hey");
        list.add("World");

        String text = list.get(2);
        System.out.println(text);

    }
}