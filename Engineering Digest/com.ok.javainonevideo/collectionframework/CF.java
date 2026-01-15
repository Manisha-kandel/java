// package io.github.jiangdequan;
package com.ok.javainonevideo.collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class CF {
    public static void main(String[] args) {
        System.out.println("Collection Framework");
        //List --> ArrayList and LinkedList
        //Set --> HashSet & LinkedHashSet
        //Map --> HashMap & LinkedHashMap
        // list is an interface and classes arraylisst and linkedlist use that interface, and similarly others
        ArrayList<Integer> arrayList = new ArrayList();  //note it's Integer, not int 
                                                         
        arrayList.add(10);
        arrayList.add(17);
        arrayList.add(5);
        System.out.println(arrayList);

        //contains
        System.out.println(arrayList.contains(18));
        
        //get
        System.out.println(arrayList.get(1));   //17

        //add
        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList2.add(10);
        arrayList2.add(17);
        arrayList2.add(5);

        //addAll
        arrayList.addAll(arrayList2);

        System.out.println(arrayList);      //10,17,5,10,17,5

        /*
        ARRAYLIST: //a new array of size 10 is created, once that is filled new arary
        is made of larger size and the old elements will be copied to the new array 
        of size 1.5 times the original.

        To insert is difficult in arraylist. 

        To take care of it, LinkedList is there. It has nodes, where values and 
        pointers are stored at each node. 

        To insert is easy. just some changes to few pointers, that's all. 
        */
        System.out.println("=============================");
        List<Integer> list = new LinkedList<>();
        list.add(34);
        list.add(78);
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(90);
        list2.add(20);
        System.out.println(list);

        /*
        SET: directly checks if elements exist in the set or not.  
        any element we keep in set goes through some hash function. 

        */
        System.out.println("==================================");
        Set<Integer> set = new HashSet<>();
        
        // hash --> same input --> gives same output --> index
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);
        System.out.println(set);

        set.contains(1);
        
        //LinkedHashSet: maintains order (the order elements are inserted)
        System.out.println("==================================");
        Set<Integer> hashSet = new HashSet<>();
        
        // hash --> same input --> gives same output --> index
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        System.out.println(hashSet);

        //you can check some methods
        hashSet.contains(1);

        /*
        MAP: 
        */
        System.out.println("====================");
        Map<Integer, String> map = new HashMap<>();

        //put
        map.put(1, "Mansa");
        map.put(2, "Mansu");
        map.put(3, "Maicha");
        System.out.println(map);
        System.out.println(map.get(2));        //Mansu
        System.out.println(map.containsKey(3));
        //
        System.out.println("Removing key: 2");
        map.remove(2);
        System.out.println(map);
   
    }
}