package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.*;

public class twodmatrix {
    public static void main(String[] args) {
        int rows,cols;
        ArrayList<ArrayList<Integer>> matrix =new ArrayList<ArrayList<Integer>>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and cols");
        rows=sc.nextInt();
        cols=sc.nextInt();

        for(int i=0;i<3;i++)
        {
            matrix.add(new ArrayList<>());
        }
        for(int i=0;i<rows;i++)
        {
            System.out.println("enter elements in sub arraylist"+i);
            for(int j=0;j<cols;j++)
            {
                matrix.get(i).add(sc.nextInt());
            }
        }
        System.out.println(matrix);

    }

}
