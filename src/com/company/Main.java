package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static List<Integer> numbers = new ArrayList<>();
    public static List<Integer> numbers1 = new ArrayList<>();

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
        numbers1.addAll(Arrays.asList(5,4,7,2,3));
        multiplyByLenght();
        System.out.println();

        //6.Exercise
        Person person1 = new Person("John",25,5000);
        Person person2 = new Person("Martin",31,7050);
        Person person3 = new Person("Steve", 22,4800);
        System.out.println(totalBudget(new Person[]{person1,person2,person3}));

        //7.exercise
        System.out.println(containInNameCharA(new Person[]{person1,person2,person3}));

    }

    //1.exercise
    public static List<Integer> numbers3(){
        numbers.stream().forEach(System.out::print);
        return numbers;
    }

    //2.exercise
    public static List<Integer> addIfNotExist(int number) {
        if (!numbers.contains(number))
        {
            numbers.add(number);;
            numbers.stream().forEach(System.out::print);
        }
        return numbers;
    }

    //3.exercise
    public static List<Integer> deleteEvenNumbers() {
        numbers.stream().filter(y -> y%2!=0).forEach(System.out::print);
        return numbers;
    }

    //4.exercise
    public static List<Integer> evenNumbers(){
        numbers.stream().filter(y -> y%2==0).forEach(System.out::print);
        return numbers;
    }

    //5.exercise
    public static List<Integer> multiplyByLenght(){
        numbers1.stream().map(y->y*numbers1.size()).forEach(System.out::print);
        return numbers1;
    }

    //6.exercise
    public static int totalBudget(Person[] people){
        int totalBudget = Arrays.stream(people).map(Person::getBudget).reduce(0, Integer::sum);
        return totalBudget;
    }

    //7.exercise
    public static boolean containInNameCharA(Person[] people){
        boolean b = Arrays.stream(people).map(Person::getName).anyMatch(y->y.contains("a"));
        return b;
    }
}
