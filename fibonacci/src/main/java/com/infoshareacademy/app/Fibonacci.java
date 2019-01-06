package com.infoshareacademy.app;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> getFibonacciAsList (Integer item){

        List<Integer> fibonacciList = new ArrayList<>();

        for (int i = 0; i <= item; i++){
            if (i == 0 || i == 1) {
                fibonacciList.add(i);
            } else {
                Integer sum = fibonacciList.get(i-1) + (fibonacciList.get(i-2));
                fibonacciList.add(sum);
            }
        }
        return fibonacciList;
    }
}