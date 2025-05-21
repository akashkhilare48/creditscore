package org.example;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={2,51,4,6,4,1,11};

        for (int i=0; i<arr.length; i++) {

            for (int j=1; j<arr.length-i; j++) {

                if (arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
