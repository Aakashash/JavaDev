package org.example;

public class Main {

    private static void dis(){
        System.out.println("Im from he private class");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        display d1 = new display();
//        d1.run();
//
//        d1 = new derivedDisplay();
//        d1.run();
//
        display d = new display();
        d.runs();

        d = new derivedDisplay();
        d.runs();
//        d.upcast();
//



//        derivedDisplay dr = new derivedDisplay();
//        dr.pri();
//        dis();

    }
}
class display{

    public void run(){
        System.out.println("HEy im in base class");
    }
    public static void runs(){
        System.out.println("HEy im in base class as static");
    }
    public void upcast(){
        System.out.println("HEy im in base class as upcast");
    }
    private void pri(){
        System.out.println("HEy im in base class as pri");
    }



}

class derivedDisplay extends display{
    public void run(){
        System.out.println("HEy im in derived class");
    }
    public static void runs(){
        System.out.println("HEy im in derived class as static");
    }
    public void upcast(){
        System.out.println("HEy im in derived class as upcast");
    }
    private void pri(){
        System.out.println("HEy im in derived class as pri");
    }
}