package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> numbers = new ArrayList();

    public static void main(String[] args) {
        //1.exercise
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,4,5));

        numbers3();
        System.out.println();

        //2.exercise
        addIfNotExist(78);

        //3.exercise

    }
    public static void numbers3(){
        numbers.stream().forEach(System.out::print);
    }

    public static void addIfNotExist(int number) {
        if (!numbers.contains(number))
        {
            numbers.add(number);
            numbers.stream().forEach(System.out::print);
        }
    }
}
