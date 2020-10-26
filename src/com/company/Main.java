package com.company;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1.cvičenie
        //1.verzia
        List<Integer> numbers1 = Arrays.asList(1,1,1,2,2,3,4,5);
        numbers1.stream().forEach(y ->System.out.print(y));
        System.out.println();
        //2.verzia
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(1);
        numbers2.add(1);
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.forEach( (n) -> { System.out.print(n); } );
        System.out.println();

        //2.cvičenie
        Thread numbers = new Thread(Main::numbers3);
        numbers.start();

    }
    public static void numbers3(){
        List<Integer> numbers = Arrays.asList(1,1,1,2,2,3,4,5);
        numbers.stream().forEach(y->System.out.print(y));
    }
}
