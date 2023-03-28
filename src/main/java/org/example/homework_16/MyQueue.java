package org.example.homework_16;
import java.util.*;
import static org.example.homework_16.Methods.createPriorityQueue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        Deque<String> deque = new LinkedList<>();
        deque.add("tandz");
        deque.add("xndzor");
        deque.add("mandarin");
        System.out.println(deque);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(1);
        System.out.println(priorityQueue);
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("b");
        stringPriorityQueue.add("c");
        stringPriorityQueue.add("a");
        System.out.println(stringPriorityQueue);
        Deque<Integer> arraydeque = new ArrayDeque<>();
        arraydeque.add(99);
        arraydeque.add(100);
        arraydeque.add(1);
        System.out.println(arraydeque);
        PriorityQueue<CustomObject> customObjects = new PriorityQueue<>();
        customObjects.add(new CustomObject(27,"Mher"));
        customObjects.add(new CustomObject(20,"Karen"));
        System.out.println(customObjects);
        while (!queue.isEmpty()){
            queue.remove();
        }
        while (!deque.isEmpty()){
            deque.remove();
        }
        if (queue.contains(10)){
            System.out.println("there is an element");
        }else {
            System.out.println("nothing");
        }
        if (deque.contains("tandz")){
            System.out.println("there is an element");
        }else {
            System.out.println("nothing");
        }
        Queue<Integer> odd = new LinkedList<>();
        int counter = 0;
        for (int i = 1; i < 100; i += 2) {
            odd.add(i);
            counter++;
        }
        System.out.println(odd);
        System.out.println(counter);
        createPriorityQueue();
    }
}
