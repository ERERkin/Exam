package com.company.exam1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exam1 {
    public static void main(String[] args) {
        int n = 100;
        int[] a= new int[n];
        for(int i = 1; i <= a.length; i++){
            a[i - 1] = i;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 5; i <= a.length; i = i + 5){
            set.add(a[i - 1]);
        }
        System.out.println(set);
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
        System.out.println(set);
    }
}
