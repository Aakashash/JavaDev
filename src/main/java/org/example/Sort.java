package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public static void main(String[] args) {
        System.out.println("Hello world");

        int[] a = {1,3,4,3,55,234,63,55,34,34};
        for (int i = 0; i < a.length; i++) {
       //     System.out.println(a[i]);
        }
        int mid = a.length/2;
       // System.out.println(mid);
        int [] leftarray = new int[mid];
        int [] rightarray = new int[a.length-mid];
        //System.out.println(a.length);
        for (int i = 0; i < mid; i++) {
            leftarray[i]=a[i];
        }
        for (int i = mid,j=0; i < a.length; i++,j++) {
           rightarray[j]=a[i];
        }

        List<Integer> l1= new ArrayList();
        List<Integer> l2= new ArrayList();
        for (int i = 0; i < mid; i++) {

            l1.add(a[i]);
        }
        for (int i = mid; i < a.length; i++) {
               l2.add(a[i]);
        }
        System.out.println(l1);
        System.out.println(l2);
        for (int i = 0; i < leftarray.length; i++) {
                 System.out.print(leftarray[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < rightarray.length; i++) {
                 System.out.print(rightarray[i]+ " ");
        }
    }

}
