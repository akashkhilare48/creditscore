package org.example;

import java.util.HashSet;
import java.util.Set;

public class Commonnumber {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 5, 6, 7};

        Set<Integer> set = new HashSet<>();
        Set<Integer> commanset = new HashSet<>();

        for (int a : arr1) {
            set.add(a);

        }

        for (int b:arr2) {
            if(set.contains(b)) {
                commanset.add(b);
            }
        }
        System.out.println(commanset);
    }

}
