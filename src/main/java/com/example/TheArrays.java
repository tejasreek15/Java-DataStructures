package com.example;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];

        colors[0] = "Pink";
        colors[1] = "Green";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200, 300};

        System.out.println(Arrays.toString(numbers));

        //using loops
        //1. one way to get the elements from array

        //To print array from first index
        for(int i=0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        //Tp print array from last index
        for(int i= colors.length -1; i >=0; i--) {
            System.out.println(colors[i]);
        }

        //2. second way to get the elements from array

        for(String color : colors) {
            System.out.println(color);
        }

        //3. third way to get the elements from array

        Arrays.stream(colors).forEach(System.out::println);

    }
}
