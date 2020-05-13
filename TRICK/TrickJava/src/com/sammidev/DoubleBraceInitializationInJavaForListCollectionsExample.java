package com.sammidev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBraceInitializationInJavaForListCollectionsExample {
    public static void main(String[] args) {
        List<Integer> values2 = new ArrayList<Integer>();
        values2.add(2);
        values2.add(3);
        values2.add(5);
        for(int i : values2){
            System.out.println(i);
        }


        List<Integer> values = Arrays.asList(12,32,45,43);
        for(int i : values){
            System.out.println(i);
        }


        List<Integer> values3 = new ArrayList<>()
        {{
            add(56);
            add(65);
            add(343);
        }};
        for(int i : values){
            System.out.println(i);
        }
    }
}
