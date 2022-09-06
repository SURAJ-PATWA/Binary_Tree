import java.sql.SQLOutput;

public class Inorder_Traversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            data=x;
            left=right=null;
        }
    }


    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        inorder(root);  //20 10 40 30 50
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
