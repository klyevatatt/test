package com.test;

/**
 * Created by Pisun on 20.06.2017.
 */
public class App {
    public static void main(String[] arg){
       int x, y;
       x=10;
       y=20;
       if(x<y)System.out.println("x<y");
        x=x*2;
        if(x==y) System.out.println("x=y");
        x=x*2;
        if (x>y) System.out.println("x>y");
        if (x==y)System.out.println("You will not see this massage");

        for (x=0;x<5;x++)
        {System.out.println("Value x=" + x);}
        System.out.println("Value x=" + x);
        for (x=0;x<10;x++){
            System.out.println("Value xx=" + x);
            System.out.println("Value y=" + y);
            y=y-2;
        }
    }
}

