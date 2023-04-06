package org.example;

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

    public void removeduplicates()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.value==temp.next.value)
            {
                temp.next=temp.next.next;
                size--;
            }
            else {
                temp=temp.next;
            }

        }
        temp=tail;
        temp.next=null;
    }
    public static void main(String[] args) {
        llist ll=new llist();
        ll.insertatfirst(4);
        ll.insertatfirst(4);
        ll.insertatfirst(3);
        ll.insertatfirst(3);
        ll.insertatfirst(3);
        ll.insertatfirst(3);
        ll.insertatfirst(2);
        ll.insertatfirst(2);
        ll.insertatfirst(1);
        ll.insertatfirst(1);
        ll.display();
        ll.removeduplicates();
        System.out.println();
        ll.display();


    }
}
