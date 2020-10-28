package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        //1.exercise
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,4,5));

        Thread numbers = new Thread(Main::numbers3);
        numbers.start();

        //2.exercise
        addIfNotExist(10);
    }
    public static List<Integer> numbers3(){
        numbers.stream().forEach(y->System.out.print(y));
        return numbers;
    }

    public static List<Integer> addIfNotExist(int number) {
        if (!numbers.contains(number))
        {
            numbers.add(number);
        }
        return numbers;
    }
}
