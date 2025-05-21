package org.example;

import java.util.*;

public class NonRepetingElement {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};

        List<Integer>list=new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        Set<Integer> set = map.keySet();

        for (int b : set) {

            if (map.get(b) ==1) {
             list.add(b);
            }
        }
        System.out.println(list);;
    }
}
