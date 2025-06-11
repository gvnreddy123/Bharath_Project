package com.infosys.health.collects;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
       List arrayList = new ArrayList<>();
       arrayList.add(10);
       arrayList.add("Hello");
       arrayList.add(null);
       arrayList.add(true);
       arrayList.add('A');
       arrayList.add(100.00);
       arrayList.add(null);
       arrayList.add("ended");
        System.out.println(arrayList);
        arrayList.set(5,"Apple");
        System.out.println(arrayList);
        arrayList.remove(4);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("Apple"));
        System.out.println(arrayList.isEmpty());



    }
}
