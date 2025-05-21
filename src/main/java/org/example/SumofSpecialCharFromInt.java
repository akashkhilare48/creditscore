package org.example;

public class SumofSpecialCharFromInt {

    public static void main(String[] args) {


        String str[] = {"1", "2", "3", "#", "#", "45", "*", "%"};
int sum=0;
        for(String s:str) {
            try {
                int num=Integer.parseInt(s);
                sum=sum+num;
            }catch (NumberFormatException e) {

            }


        }
        System.out.println(sum);

    }
}
