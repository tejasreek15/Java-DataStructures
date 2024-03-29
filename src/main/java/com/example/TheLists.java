package com.example;

import java.util.ArrayList;
import java.util.List;

public class TheLists {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("Violet"));

        for(String color: colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for(int i=0; i <colors.size(); i++){
            System.out.println(colors.get(i));
        }


        List<String> colorsUnmodifiableList = List.of(
                "blue", "green"
        );
        // returns an unmodifiable list
        //colorsUnmodifiableList.add("violet");
    }
}
