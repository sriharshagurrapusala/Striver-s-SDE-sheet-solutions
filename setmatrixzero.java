package org.example;
import java.util.*;

public class setmatrixzero {
    public static void main(String[] args) {
        int [][] m=new int[10][10];
        int [] row=new int[10];
        int [] col=new int[10];
        int n,c;
        System.out.println("enter size of matrix n,c ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=sc.nextInt();
        System.out.println("enter elements ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            row[i]=0;
            col[i]=0;
        }
        setzero(m,n,c,row,col);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(m[i][j]);
            }
            System.out.println();
        }



    }

    static void setzero(int[][] mat,int n,int c,int [] row,int [] col)
    {

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                {
                    row[i]=7;
                    col[j]=7;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<c;j++)
            {
                if((row[i]==7) || (col[j]==7))
                {
                    mat[i][j]=0;
                }
            }
        }
    }
}
