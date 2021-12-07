package com.hello.java;

import java.util.Arrays;
import java.util.List;

public class helloworld {
    public static void main(String[] args){
        System.out.println("hello world");

        List<Integer> list = Arrays.asList(1,2,3,4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
