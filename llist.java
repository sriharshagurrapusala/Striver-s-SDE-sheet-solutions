package org.example;
//Merge Two Sorted Linked Lists

public class llist {
    private Node head;
    private Node tail;
    private int size;
    public llist()
    {
        this.size=0;
    }
    private class Node
    {
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value=value;
            this.next=null;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
    public void insertatfirst(int value)
    {
        Node node =new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size=size+1;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public void insertatlast(int value)
    {
        Node node=new Node(value);
        if(head!=null) {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
            node.next = null;
        }
        else {
            head = node;
        }
    }

    public  static llist mergell(llist first,llist second)
    {
        Node f=first.head;
        Node s=second.head;
        llist dummylist=new llist();

        if(f.value<s.value)
        {
            dummylist.insertatlast(f.value);
            f=f.next;
        }
        else {
            dummylist.insertatlast(s.value);
            s=s.next;
        }
        while(f!=null)
        {
            dummylist.insertatlast(f.value);
            f=f.next;
        }
        while(s!=null)
        {
            dummylist.insertatlast(s.value);
            s=s.next;
        }
        return dummylist;
    }
    public static void main(String[] args) {
        llist ll1=new llist();
        llist ll2=new llist();
        ll1.insertatlast(1);
        ll1.insertatlast(1);
        ll1.insertatlast(2);
        ll1.insertatlast(3);
        ll1.insertatlast(4);
        ll2.insertatlast(1);
        ll2.insertatlast(6);
        ll2.insertatlast(7);
        ll2.insertatlast(10);
        System.out.println("first list is");
        ll1.display();
        System.out.println("second list is");
        ll2.display();
        System.out.println("merge linked lists");
        llist ans=llist.mergell(ll1,ll2);
        ans.display();



    }
}
