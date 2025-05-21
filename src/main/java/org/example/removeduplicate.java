package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class removeduplicate {
    public static void main(String[] args) {
        int arr[]={3,3,2,5,4,6,8,7,6,7};

        Set<Integer> set=new HashSet<>();

        for (int a:arr) {
            set.add(a);
        }

        int arr1[]=new int[set.size()];
        int i=0;
        for (int a1:set) {
            arr1[i]=a1;
            i++;
        }
        System.out.println(Arrays.toString(arr1));

    }
}
