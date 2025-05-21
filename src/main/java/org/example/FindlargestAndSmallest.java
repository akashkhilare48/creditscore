package org.example;

public class FindlargestAndSmallest {
    public static void main(String[] args) {
        int arr[]={3,66,7,1,44};

        int min=arr[0];
        int max=arr[0];

        for (int i=1; i<arr.length; i++) {

            if (arr[i] <min) {
                min=arr[i];
            }
            if (arr[i] >max) {
                max=arr[i];
            }
        }
        System.out.println(min +" " +max);
    }
}
