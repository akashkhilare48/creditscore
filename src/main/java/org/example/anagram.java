package org.example;

public class anagram {

     static String str1="listen";
   static   String str2="silent";
    public static void main(String[] args) {

        System.out.println(anagra(str1,str2));
    }
    public static boolean anagra(String str1,String str2){

        int arr[]=new int[256];

       for (int i=0; i<str1.length(); i++) {

           arr[str1.charAt(i)]++;
           arr[str2.charAt(i)]--;
       }

      for (int count :arr) {
          if (count !=0) {
              return false;
          }
      }
      return true;
    }
}
