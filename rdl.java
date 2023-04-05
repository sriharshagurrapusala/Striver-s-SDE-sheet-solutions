package org.example;
import java.util.*;
public class rdl {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(4);
        ll.add(5);
        ll.add(5);
        int i=0;
        for(int j=1;j<ll.size();j++)
        {
            if(ll.get(i)!=ll.get(j)){
                i++;
                ll.set(i,ll.get(j));

            }
        }
        System.out.println(i);
        System.out.println(ll);
        while(ll.size()>i+1)
        {
            ll.remove(ll.size()-1);

        }
        System.out.println(ll);
    }
}
