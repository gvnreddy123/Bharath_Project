package com.infosys.health.collects;

import java.util.*;

public class EnumeratorEx {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add(100);
        list.add(500);
        list.add("Test");
        list.add(900);
        list.add(true);
        System.out.println(list);
        ListIterator iterator= list.listIterator();
        while(iterator.hasNext())
        {
            Object object = iterator.next();

        }


    }
}
