package org.example;

public class Solution extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Solution t1=new Solution();
        t1.start();
    }
}

class Multi implements Runnable{

    int a[] = {1,2,3,4,5,6,7,8,9};
    public void run() {
        System.out.println("Runnable thread is running");

        for (int i = 0; i < 9; i++) {

            System.out.println("The number is " + a[i] + " The thread of "+ Thread.currentThread().getName());

        }
    }
    public  static  void  main(String[] args){

        try {

            Multi t = new Multi();
            Thread t1 = new Thread(t);
            t1.start();
            t1.setPriority(1);
          //  t1.join();
        }
        catch (ArithmeticException e) {

            System.out.println("Interrupted");
        }


        Multi tt = new Multi();
        Thread t2 = new Thread(tt);
        t2.start();
        t2.setPriority(9);
        //System.out.println(t1.getName()+ " "+ t1.getState()+ " " );
    }
}



