package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> numbers = new ArrayList();
    public static List<Integer> unevenNumbers = new ArrayList();
    public static List<Integer> evenNumbers = new ArrayList();

    public static void main(String[] args) {
        //1.exercise
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,4,5));

        numbers3();
        System.out.println();

        //2.exercise
        addIfNotExist(78);
        System.out.println();

        //3.exercise
        deleteEvenNumbers();
        System.out.println();

        //4.exercise
        evenNumbers();

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

    public static void deleteEvenNumbers() {
        for (var y : numbers) {
            if (y % 2 != 0) {
                unevenNumbers.add(y);
            }
        }
        unevenNumbers.stream().forEach(System.out::print);
    }

    public static void evenNumbers(){
        for (var i : numbers){
            if (i%2==0){
                evenNumbers.add(i);
            }
        }
        evenNumbers.stream().forEach(System.out::print);
    }

}
