package org.example.homework_16;

import java.util.PriorityQueue;

public class Methods {
    public static void createPriorityQueue() {
        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        while (!colors.isEmpty()) {
            System.out.println(colors.poll());
        }
    }
}
