package org.example;

public class bstree {
    public static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
        }
    }
    public node root;
    public bstree()
    {
        root=null;
    }

    public  node insert(node root, int data)
    {

        if(root==null)
        {
            root=new node(data);
            return root;
        }
        node x=root;
       while(root!=null) {
           if (data < root.data) {

               if (root.left == null) {
                   root.left = new node(data);
                   return x;

               } else {
                   root = root.left;
                   //root.left = new node(data);
               }

           }
           else {

               if (root.right == null) {
                   root.right = new node(data);
                   return x;

               } else {
                   root = root.right;

               }

           }
       }
        return x;

    }

    public void inorder(node n)
    {
        while (n!=null)
        {
            inorder(n.left);
            System.out.println(n.data);
            inorder(n.right);
        }
    }

    public static void main(String[] args) {
        bstree tree=new bstree();
        node n=new node(7);
        n=tree.insert(n,5);
        n=tree.insert(n,9);
        n=tree.insert(n,2);
        n=tree.insert(n,8);
        n=tree.insert(n,1);
        tree.inorder(n);

    }
}
