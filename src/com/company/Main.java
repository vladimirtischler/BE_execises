package com.company;

import java.util.*;

public class Main {

    public static List<Integer> numbers = new ArrayList<>();
    public static List<Integer> numbers1 = new ArrayList<>();
    public static Set<Integer> hashSet = new HashSet<>();
    public static HashMap<String,Integer> hashMap = new HashMap<>();

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

        //8.exercise
        hashSet.addAll(numbers);
        hashSet.add(1);
        hashSet.forEach(System.out::print);
        System.out.println();

        //9.exercise
        hashMap.put("Red", 1);
        hashMap.put("Green",2);
        hashMap.put("Black",3);
        hashMap.put("White",4);
        System.out.println(hashMap);

        //10.exercise
        createNewElement("Blue",4);

    }

    //1.exercise
    public static void numbers3(){
        numbers.forEach(System.out::print);
    }

    //2.exercise
    public static void addIfNotExist(int number) {
        if (!numbers.contains(number))
        {
            numbers.add(number);;
            numbers.forEach(System.out::print);
        }
    }

    //3.exercise
    public static void deleteEvenNumbers() {
        numbers.stream().filter(y -> y%2!=0).forEach(System.out::print);
    }

    //4.exercise
    public static void evenNumbers(){
        numbers.stream().filter(y -> y%2==0).forEach(System.out::print);
    }

    //5.exercise
    public static void multiplyByLenght(){
        numbers1.stream().map(y->y*numbers1.size()).forEach(System.out::print);
    }

    //6.exercise
    public static int totalBudget(Person[] people){
       return Arrays.stream(people).map(Person::getBudget).reduce(0, Integer::sum);
    }

    //7.exercise
    public static boolean containInNameCharA(Person[] people){
        return Arrays.stream(people).map(Person::getName).anyMatch(y->y.contains("a"));
    }

    //10.exercise
    public static void createNewElement(String a,Integer b){
        if(!hashMap.containsValue(b)&&!hashMap.containsKey(a)){
            hashMap.put(a,b);
        }
        System.out.print(hashMap);
    }

}