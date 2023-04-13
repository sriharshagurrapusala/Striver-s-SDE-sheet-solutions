package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TWOdarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> b=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of ele");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            b.add(sc.nextInt());
        }
        System.out.println(b);
        //considering rows and colums of matrix
        System.out.println("enter rows & cols for Arraylist<ArrayList>");
        int r=sc.nextInt();
        for(int i=0;i<r;i++)
        {
            a.add(new ArrayList<>());
        }

        int c=sc.nextInt();
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               // a.add(i,b.get(k++));

                    a.get(i).add(b.get(k));
                    k++;

            }
        }
        System.out.println(a);
    }
}
