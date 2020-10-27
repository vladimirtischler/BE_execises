package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        //1.exercise
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Thread numbers = new Thread(Main::numbers3);
        numbers.start();

        //2.exercise
        addIfNotExist(5);
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
