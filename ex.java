package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ex {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=a;
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        b.add(1000);




        System.out.println(a);
    }
}
