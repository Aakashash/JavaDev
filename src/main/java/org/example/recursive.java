package org.example;

public class recursive {

    public static int a ;

    public static void main(String[] args) {

        a = 0;
        sample(a);

    }
         static void sample(int a){
        System.out.println("inside the recursive");
        if(a==10) return;
        a++;
             System.out.println(a);
        sample(a);

        System.out.println("This should be printing more than once ");


    }

}