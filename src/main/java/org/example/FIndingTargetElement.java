package org.example;

public class FIndingTargetElement {
  static   int arr[]={2,4,56,7,8};
    static int target=99;

    public static void main(String[] args) {


        System.out.println(traget(arr,target));
    }
    public static int traget(int arr[],int target){

        for (int i=0; i<arr.length; i++) {
            if (arr[i]==target ) {
                return i;
            }
        }
        return -1;
    }
}
