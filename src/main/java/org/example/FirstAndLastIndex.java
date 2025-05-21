package org.example;

import java.util.ArrayList;

public class FirstAndLastIndex {
    public static void main(String[] args) {


        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("akash");
        arrayList.add("khilare");
        arrayList.add("pune");
        arrayList.add("dahigoan");

        System.out.println(arrayList.getFirst() +" " +arrayList.get(arrayList.size()-1));
    }
}
