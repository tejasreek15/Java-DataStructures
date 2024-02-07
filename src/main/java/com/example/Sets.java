package com.example;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Grey"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));

        balls.forEach(System.out::println);
    }

    private record Ball(String color) {
    }
}
