class BinaryTree{
    Node root;
    class Node{
        int data;
        Node left,right;
        
        Node(int d){
            data=d;
            right=null;
            left=null;
        }
    }
    
     public BinaryTree(int d){
        root=new Node(d);
        
    }
    
    void insertleft(Node r, int val)
    {
        Node newNode=new Node(val);
        r.left=newNode;
    }
    
    void insertright(Node r, int val)
    {
        Node newNode=new Node(val);
        r.right=newNode;
    }
    
    public static void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public static void inOrder(Node root)
    {
        if(root!=null)
        {
            
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }
    
    public static void postOrder(Node root)
    {
        if(root!=null)
        {
           
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data);
        }
    }
}
class Main{
    public static void main(String arge[])
    {
        BinaryTree tree= new BinaryTree(10);
        tree.insertleft(tree.root,5);
        tree.insertright(tree.root,15);
        tree.insertleft(tree.root.left,3);
        tree.insertright(tree.root.left,8);
        tree.insertleft(tree.root.right,12);
        
        BinaryTree.preOrder(tree.root);
        System.out.println();
        BinaryTree.inOrder(tree.root);
        System.out.println();
        BinaryTree.postOrder(tree.root);
        
    }
}
