package com.company;

import java.lang.reflect.Array;
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
        System.out.println();

        //3.exercise
        deleteEvenNumbers();
        System.out.println();

        //4.exercise
        evenNumbers();
        System.out.println();

        //5.exercise
        multiplyByLenght();
        //6.Exercise

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
        numbers.stream().filter(y -> y%2!=0).forEach(System.out::print);
    }
    //4.exercise
    public static void evenNumbers(){
            numbers.stream().filter(y -> y%2==0).forEach(System.out::print);
    }
    //5.exercise
    public static void multiplyByLenght(){
        List <Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5,4,7,2,4));
        numbers.stream().map(y->y*numbers.size()).forEach(System.out::print);
    }

    //6.exercise

}
