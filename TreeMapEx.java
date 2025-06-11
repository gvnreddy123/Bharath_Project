package com.infosys.health.collects;

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        Map treeMapObj = new TreeMap();
        treeMapObj.put(1,"A");
        treeMapObj.put(3,"B");
        treeMapObj.put(2,null);
        treeMapObj.put(5,"D");
        treeMapObj.put(4,"E");
        treeMapObj.put(1,null);
        System.out.println(treeMapObj);
       /* System.out.println(treeMapObj.keySet());
        System.out.println(treeMapObj.values());
        System.out.println(treeMapObj.entrySet());*/

/*        {1=G, 2=C, 3=B, 4=E, 5=D, 6=F}
[1, 2, 3, 4, 5, 6]
[G, C, B, E, D, F]
[1=G, 2=C, 3=B, 4=E, 5=D, 6=F]*/
    }
}
