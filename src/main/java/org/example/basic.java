package org.example;

import java.util.Arrays;

public class basic {

    public static void  main(String[] args){
        String a = "Once a spy always a spy";
        char[] charArr
                = new char[] { 'g', 'e', 'e', 'k', 's' };
        int le = a.length();

        for (int i = le-1; i >= 0 ; i--) {
            System.out.print(a.charAt(i));
            //System.out.println();
        }

        char[] ch = a.toCharArray();

        String r = Arrays.toString(charArr);

        System.out.println(r);
        for (char c:ch
             ) {
            System.out.print(c);
        }

    }
}
