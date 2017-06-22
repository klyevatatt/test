package com.test;

/**
 * Created by Pisun on 20.06.2017.
 */
public class App {
    public static void main(String args[]){
        int lightspeed;
        int days;
        int second;
        int distance;
        // приблизительная скорость света
        lightspeed=186000;
        days= 1000;
        second=days*24*60*60;
        distance=lightspeed*second;
        System.out.print("For "+ days);
        System.out.print(" days light went about ");
        System.out.println(distance + " mile");
        }

}

