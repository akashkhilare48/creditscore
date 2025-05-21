package org.example;

public class Demo {

    private static Demo instance;

    private Demo(){

    }

    public static Demo getInstance(){

        if(instance==null) {
            instance=new Demo();
        }
        return instance;
    }
    public void massage(){
        System.out.println("singltone class");
         System.out.println("singltone1 class");
    }


}

class akash {

    public static void main(String[] args) {
        Demo obj=Demo.getInstance();
        Demo obj1=Demo.getInstance();
        System.out.println(obj==obj1);
        obj1.massage();
    }
}
