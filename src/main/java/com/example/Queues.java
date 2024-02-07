package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("liya", 23));
        queue.add(new Person("gita", 21));
        queue.add(new Person("sonu", 40));

        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }


    record Person(String name, int age) {
    }
}
