package org.example.homework_16;

public class CustomObject implements Comparable<CustomObject> {
    private int priority;
    private String name;

    public CustomObject(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(CustomObject other) {
        return Integer.compare(this.priority, other.priority);
    }
}

